package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class yActivity extends AppCompatActivity {

    ImageButton btn_back,btn_yaourt,btn_yucca;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_yaourt = findViewById(R.id.btn_yaourt);
        btn_yucca = findViewById(R.id.btn_yucca);
        mp = MediaPlayer.create(yActivity.this, R.raw.yaourt);
        mp = MediaPlayer.create(yActivity.this, R.raw.yucca);

        btn_yaourt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.yaourt);
            }
        });

        btn_yucca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.yucca);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(yActivity.this, soundResource);
        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mp.start();
            }
        });

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.release();
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(yActivity.this, Alphabet.class);

                startActivity(intent);
            }
        });
    }
}
