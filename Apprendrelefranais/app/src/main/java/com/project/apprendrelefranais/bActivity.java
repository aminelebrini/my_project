package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bActivity extends AppCompatActivity {

    ImageButton btn_back, btn_banane,btn_bateau;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_bateau=findViewById(R.id.btn_bateau);
        btn_banane=findViewById(R.id.btn_banane);
        mp = MediaPlayer.create(bActivity.this, R.raw.banane);
        mp = MediaPlayer.create(bActivity.this, R.raw.bateau);

        btn_banane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.banane);
            }
        });

        btn_bateau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.bateau);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bActivity.this, Alphabet.class);
                startActivity(intent);
            }
        });
    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(bActivity.this, soundResource);
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
    }
}