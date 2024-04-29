package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class iActivity extends AppCompatActivity {

    ImageButton btn_back,btn_igloo,btn_insecte;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_igloo = findViewById(R.id.btn_igloo);
        btn_insecte = findViewById(R.id.btn_insecte);
        mp=MediaPlayer.create(iActivity.this, R.raw.igloo);
        mp=MediaPlayer.create(iActivity.this, R.raw.insecte);


        btn_igloo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.igloo);
            }
        });

        btn_insecte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.insecte);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(iActivity.this, soundResource);
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

                Intent intent = new Intent(iActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}