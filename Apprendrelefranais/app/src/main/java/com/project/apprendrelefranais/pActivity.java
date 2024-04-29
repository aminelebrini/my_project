package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pActivity extends AppCompatActivity {

    ImageButton btn_back, btn_papillon, btn_parapluie;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_papillon = findViewById(R.id.btn_papillon);
        btn_parapluie = findViewById(R.id.btn_parapluie);
        mp=MediaPlayer.create(pActivity.this, R.raw.papillon);
        mp=MediaPlayer.create(pActivity.this, R.raw.parapluie);

        btn_papillon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.papillon);
            }
        });

        btn_parapluie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.parapluie);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(pActivity.this, soundResource);
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

                Intent intent = new Intent(pActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}