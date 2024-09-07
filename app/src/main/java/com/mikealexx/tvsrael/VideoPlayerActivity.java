package com.mikealexx.tvsrael;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.util.MimeTypes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import java.util.HashMap;
import java.util.Map;

public class VideoPlayerActivity extends AppCompatActivity {

    public static final String MIME_TYPE_HLS = MimeTypes.APPLICATION_M3U8;
    private SimpleExoPlayer player;
    private PlayerView playerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_video_player);

        hideSystemUi();

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        playerView = findViewById(R.id.player_view);

        String videoUrl = getIntent().getStringExtra("VIDEO_URL");

        LoadControl loadControl = new DefaultLoadControl.Builder()
                .setBufferDurationsMs(15000, 30000, 1500, 5000)
                .createDefaultLoadControl();

        player = new SimpleExoPlayer.Builder(this).setLoadControl(loadControl).build();
        playerView.setPlayer(player);

        DefaultHttpDataSource.Factory dataSourceFactory = new DefaultHttpDataSource.Factory().setDefaultRequestProperties(buildHeaders());
        MediaItem mediaItem = new MediaItem.Builder().setUri(Uri.parse(videoUrl)).setMimeType(MIME_TYPE_HLS).build();
        player.setMediaSource(new HlsMediaSource.Factory(dataSourceFactory).createMediaSource(mediaItem));

        player.setMediaSource(new HlsMediaSource.Factory(dataSourceFactory).createMediaSource(mediaItem));
        player.prepare();
        player.setPlayWhenReady(true);
    }

    private void hideSystemUi() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
        );
    }

    private Map<String, String> buildHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:126.0) Gecko/20100101 Firefox/126.0");
        if(getIntent().getStringExtra("ORIGIN_URL") != null)
            headers.put("Origin", getIntent().getStringExtra("ORIGIN_URL"));
        if(getIntent().getStringExtra("REFERER_URL") != null)
            headers.put("Referer", getIntent().getStringExtra("REFERER_URL"));
        return headers;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode) {
            case KeyEvent.KEYCODE_DPAD_UP:
                if(MainActivity.channelManager.getChannelNumberByURL(getIntent().getStringExtra("VIDEO_URL")) == 18) {
                    break;
                }
                int nextChannel = MainActivity.channelManager.getChannelNumberByURL(getIntent().getStringExtra("VIDEO_URL")) + 1;
                Intent nextIntent = new Intent(VideoPlayerActivity.this, VideoPlayerActivity.class);
                nextIntent.putExtra("VIDEO_URL", MainActivity.channelManager.getChannelUrlByName("Channel " + nextChannel));
                nextIntent.putExtra("ORIGIN_URL", MainActivity.channelManager.getChannelOriginByName("Channel " + nextChannel));
                nextIntent.putExtra("REFERER_URL", MainActivity.channelManager.getChannelRefererByName("Channel " + nextChannel));
                getIntent().putExtra("CURRENT_CHANNEL", nextChannel);
                finish();
                startActivity(nextIntent);
                break;

            case KeyEvent.KEYCODE_DPAD_DOWN:
                if(MainActivity.channelManager.getChannelNumberByURL(getIntent().getStringExtra("VIDEO_URL")) == 1) {
                    break;
                }
                int prevChannel = MainActivity.channelManager.getChannelNumberByURL(getIntent().getStringExtra("VIDEO_URL")) - 1;
                Intent prevIntent = new Intent(VideoPlayerActivity.this, VideoPlayerActivity.class);
                prevIntent.putExtra("VIDEO_URL", MainActivity.channelManager.getChannelUrlByName("Channel " + prevChannel));
                prevIntent.putExtra("ORIGIN_URL", MainActivity.channelManager.getChannelOriginByName("Channel " + prevChannel));
                prevIntent.putExtra("REFERER_URL", MainActivity.channelManager.getChannelRefererByName("Channel " + prevChannel));
                getIntent().putExtra("CURRENT_CHANNEL", prevChannel);
                finish();
                startActivity(prevIntent);
                break;

            case KeyEvent.KEYCODE_ENTER:
            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE:
            case KeyEvent.KEYCODE_MEDIA_PLAY:
            case KeyEvent.KEYCODE_MEDIA_PAUSE:
                if (player != null) {
                    if (player.isPlaying()) {
                        player.pause();
                    } else {
                        player.play();
                    }
                    return true;
                }
                break;

            case KeyEvent.KEYCODE_MEDIA_STOP:
                if (player != null) {
                    player.stop();
                    return true;
                }
                break;
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    protected void onPause() {
        super.onPause();
        player.stop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        player.play();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player.release();
            player = null;
        }
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            hideSystemUi();
            playerView.setPlayer(player);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            hideSystemUi();
            playerView.setPlayer(player);
        }
    }
}