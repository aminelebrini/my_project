package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class jActivity extends AppCompatActivity {

    ImageButton btn_back, btn_jardin, btn_jagouar;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_jardin = findViewById(R.id.btn_jardin);
        btn_jagouar = findViewById(R.id.btn_jagouar);
        mp=MediaPlayer.create(jActivity.this, R.raw.jardin);
        mp=MediaPlayer.create(jActivity.this, R.raw.jagouar);


        btn_jardin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.jardin);
            }
        });

        btn_jagouar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.jagouar);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(jActivity.this, soundResource);
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

                Intent intent = new Intent(jActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}