package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lActivity extends AppCompatActivity {

    ImageButton btn_back, btn_lampe, btn_lune;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_lampe = findViewById(R.id.btn_lampe);
        btn_lune = findViewById(R.id.btn_lune);
        mp=MediaPlayer.create(lActivity.this, R.raw.lampe);
        mp=MediaPlayer.create(lActivity.this, R.raw.lune);

        btn_lampe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.lampe);
            }
        });

        btn_lune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.lune);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(lActivity.this, soundResource);
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

                Intent intent = new Intent(lActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}