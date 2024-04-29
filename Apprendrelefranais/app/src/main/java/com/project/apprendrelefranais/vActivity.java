package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class vActivity extends AppCompatActivity {

    ImageButton btn_back, btn_voiture, btn_volcan;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_voiture = findViewById(R.id.btn_voiture);
        btn_volcan = findViewById(R.id.btn_volcan);
        mp = MediaPlayer.create(vActivity.this, R.raw.voiture);
        mp = MediaPlayer.create(vActivity.this, R.raw.volcan);

        btn_voiture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.voiture);
            }
        });

        btn_volcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.volcan);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(vActivity.this, soundResource);
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

                Intent intent = new Intent(vActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}