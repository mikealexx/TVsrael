package com.mikealexx.tvsrael;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.SimpleExoPlayer;

public class MainActivity extends AppCompatActivity {
    private SimpleExoPlayer player;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        Button button1 = findViewById(R.id.button1);
        String button1URL = "https://contactgbs.mmdlive.lldns.net/contactgbs/dd4f5f04932345f1b47c4bfb45fbd682/manifest.m3u8";

        Button button2 = findViewById(R.id.button2);
        String button2URL = "https://kan11.media.kan.org.il/hls/live/2024514/2024514/master.m3u8";

        Button button3 = findViewById(R.id.button3);
        String button3URL = "https://mako-streaming.akamaized.net/stream/hls/live/2033791/k12dvr/profile/2/hdntl=exp=1718451277~acl=%2f*~data=hdntl~hmac=8cbf3fd2036137c455f1d5a1ae92d9636350bcd7174a8eb099823ad2d0f6891e/profileManifest.m3u8?_uid=6ed0f3cf-96ad-46bd-97f0-60735ffe59b3&rK=a1&_did=ab7bec57-50bc-4ab5-ba26-9dda008c9b5b";

        Button button4 = findViewById(R.id.button4);
        String button4URL = "https://d2xg1g9o5vns8m.cloudfront.net/out/v1/0855d703f7d5436fae6a9c7ce8ca5075/index.m3u8";

        Button button5 = findViewById(R.id.button5);
        String button5URL = "https://now14.g-mana.live/media/91517161-44ab-4e46-af70-e9fe26117d2e/mainManifest.m3u8";

        Button button6 = findViewById(R.id.button6);
        String button6URL = "https://shoppingil-rewriter.vidnt.com/index.m3u8";

        Button button7 = findViewById(R.id.button7);
        String button7URL = "https://makan.media.kan.org.il/hls/live/2024680/2024680/master.m3u8";

        Button button8 = findViewById(R.id.button8);
        String button8URL = "https://kan23.media.kan.org.il/hls/live/2024691/2024691/master.m3u8";

        Button button9 = findViewById(R.id.button9);
        String button9URL = "https://contact.gostreaming.tv/Knesset/myStream/playlist.m3u8";

        //buttons selection listener
        button1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });
        button2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });
        button3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });
        button4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });
        button5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });
        button6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });
        button7.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });
        button8.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });
        button9.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });

        //button click listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button1URL);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button2URL);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button3URL);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button4URL);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button5URL);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button6URL);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button7URL);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button8URL);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button9URL);
                startActivity(intent);
            }
        });
    }

    private void startVideoActivity(String videoUrl) {
        Intent intent = new Intent(this, VideoPlayerActivity.class);
        intent.putExtra("VIDEO_URL", videoUrl);
        startActivity(intent);
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
