package com.mikealexx.tvsrael;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {
    private SimpleExoPlayer player;
    private PlayerView playerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize PlayerView
//        playerView = findViewById(R.id.player_view);
//        if(playerView == null) {
//            System.out.println("NULLLLL");
//        }

        // Set up button listeners
        //findViewById(R.id.button1).setOnClickListener(view -> playVideo("https://d2xg1g9o5vns8m.cloudfront.net/out/v1/0855d703f7d5436fae6a9c7ce8ca5075/index.m3u8"));
        // Repeat for other buttons

        Button button1 = findViewById(R.id.button1);

        button1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", "https://d2xg1g9o5vns8m.cloudfront.net/out/v1/0855d703f7d5436fae6a9c7ce8ca5075/index.m3u8");
                startActivity(intent);
            }
        });
    }

    private void startVideoActivity(String videoUrl) {
        Intent intent = new Intent(this, VideoPlayerActivity.class);
        intent.putExtra("VIDEO_URL", videoUrl);
        startActivity(intent);
    }

    private void playVideo(String videoUrl) {
        if (player != null) {
            player.release();
        }

        // Create a new ExoPlayer instance
        player = new SimpleExoPlayer.Builder(this).build();
        playerView.setPlayer(player);

        // Create a media item
        MediaItem mediaItem = MediaItem.fromUri(Uri.parse(videoUrl));
        player.setMediaItem(mediaItem);

        // Prepare and play the video
        player.prepare();
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
}
