package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class nActivity extends AppCompatActivity {

    ImageButton btn_back, btn_nuage, btn_nenupha;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_nuage = findViewById(R.id.btn_nuage);
        btn_nenupha = findViewById(R.id.btn_nenupha);
        mp=MediaPlayer.create(nActivity.this, R.raw.nuage);
        mp=MediaPlayer.create(nActivity.this, R.raw.nenupha);

        btn_nuage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.nuage);
            }
        });

        btn_nenupha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.nenupha);
            }
        });


    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(nActivity.this, soundResource);
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

                Intent intent = new Intent(nActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}