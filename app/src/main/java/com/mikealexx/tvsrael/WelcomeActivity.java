package com.mikealexx.tvsrael;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {
    public static ChannelManager channelManager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ProgressBar progressBar = findViewById(R.id.progressBar);

        AsyncTask<Context, Long, String> response = new GetTask(this, progressBar).execute();
    }
}
