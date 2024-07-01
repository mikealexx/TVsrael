package com.mikealexx.tvsrael;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GetTask extends AsyncTask<Context, Long, String> {
    private static final String url = "https://raw.githubusercontent.com/mikealexx/TVsrael/main/channels.json";
    private Context context;
    private ProgressBar progressBar;

    public GetTask(Context context, ProgressBar progressBar) {
        this.context = context;
        this.progressBar = progressBar;
    }

    @Override
    protected String doInBackground(Context... voids) {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        Call call = client.newCall(new Request.Builder()
                .url(url)
                .get()
                .build());

        try(Response response = call.execute()) {
            if (response.code() == 200) {
                long contentLength = getContentLength(client);
                long downloaded = 0;
                byte[] buffer = new byte[8192];
                int read;
                InputStream inputStream = response.body().byteStream();
                StringBuilder stringBuilder = new StringBuilder();
                while ((read = inputStream.read(buffer)) != -1) {
                    downloaded += read;
                    publishProgress(downloaded, contentLength);
                    stringBuilder.append(new String(buffer, 0, read));
                }
                return stringBuilder.toString();
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private long getContentLength(OkHttpClient client) {
        Request initialRequest = new Request.Builder()
                .url(url)
                .header("Range", "bytes=0-1")  // Request the first byte to get the content length
                .build();
        try (Response response = client.newCall(initialRequest).execute()) {
            if (response.isSuccessful() && response.header("Content-Range") != null) {
                String contentRange = response.header("Content-Range");
                // Content-Range format: "bytes 0-1/12345"
                String totalLengthStr = contentRange.split("/")[1];
                return Long.parseLong(totalLengthStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    protected void onProgressUpdate(Long... values) {
        if (values.length > 1) {
            progressBar.setMax(values[1].intValue());
        }
        progressBar.setProgress(values[0].intValue());
        Log.d("ProgressUpdate", "Downloaded: " + values[0] + " / " + "Total: " + values[1]);
    }

    @Override
    protected void onPostExecute(String result) {
        if (result != null) {
            WelcomeActivity.channelManager = new ChannelManager(result);

            Intent intent = new Intent(context, MainActivity.class);
            this.context.startActivity(intent);
        }
    }
}