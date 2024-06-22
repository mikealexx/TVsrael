package com.mikealexx.tvsrael;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.SimpleExoPlayer;

public class MainActivity extends AppCompatActivity {
    private SimpleExoPlayer player;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        hideSystemUi();

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

        Button button10 = findViewById(R.id.button10);
        String button10URL = "https://ddy1.mizhls.ru/ddy1/premium140/tracks-v1a1/mono.m3u8";

        Button button11 = findViewById(R.id.button11);
        String button11URL = "https://ddy1.mizhls.ru/ddy1/premium141/tracks-v1a1/mono.m3u8";

        Button button12 = findViewById(R.id.button12);
        String button12URL = "https://ddy1.mizhls.ru/ddy1/premium142/tracks-v1a1/mono.m3u8";

        Button button13 = findViewById(R.id.button13);
        String button13URL = "https://ddy1.mizhls.ru/ddy1/premium143/tracks-v1a1/mono.m3u8";

        Button button14 = findViewById(R.id.button14);
        String button14URL = "https://ddy1.mizhls.ru/ddy1/premium144/tracks-v1a1/mono.m3u8";

        Button button15 = findViewById(R.id.button15);
        String button15URL = "https://ddy1.mizhls.ru/ddy1/premium145/tracks-v1a1/mono.m3u8";

        Button button16 = findViewById(R.id.button16);
        String button16URL = "https://ddy1.mizhls.ru/ddy1/premium146/tracks-v1a1/mono.m3u8";

        Button button17 = findViewById(R.id.button17);
        String button17URL = "https://ddy1.mizhls.ru/ddy1/premium147/tracks-v1a1/mono.m3u8";

        Button button18 = findViewById(R.id.button18);
        String button18URL = "https://ddy3.mizhls.ru/ddy3/premium148/tracks-v1a1/mono.m3u8";

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

        button10.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });

        button11.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });

        button12.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });

        button13.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });

        button14.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });

        button15.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });

        button16.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });

        button17.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                view.setSelected(hasFocus);
            }
        });

        button18.setOnFocusChangeListener(new View.OnFocusChangeListener() {
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

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button10URL);
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button11URL);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button12URL);
                startActivity(intent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button13URL);
                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button14URL);
                startActivity(intent);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button15URL);
                startActivity(intent);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button16URL);
                startActivity(intent);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button17URL);
                startActivity(intent);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URL", button18URL);
                startActivity(intent);
            }
        });
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

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_ESCAPE:
            case KeyEvent.KEYCODE_BACK:
                Intent intent = new Intent(MainActivity.this, ExitActivity.class);
                startActivity(intent);
                return true;
            // Add more cases for other buttons if needed
            default:
                return super.onKeyDown(keyCode, event);
        }
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
