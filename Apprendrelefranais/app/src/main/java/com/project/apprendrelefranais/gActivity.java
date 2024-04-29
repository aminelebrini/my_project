package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class gActivity extends AppCompatActivity {

    ImageButton btn_back, btn_gateau,btn_girafe;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_gateau = findViewById(R.id.btn_gateau);
        btn_girafe = findViewById(R.id.btn_girafe);
        mp=MediaPlayer.create(gActivity.this, R.raw.gateau);
        mp=MediaPlayer.create(gActivity.this, R.raw.girafe);


        btn_gateau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.gateau);
            }
        });

        btn_girafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.girafe);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(gActivity.this, soundResource);
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

                Intent intent = new Intent(gActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}