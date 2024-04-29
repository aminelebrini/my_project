package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hActivity extends AppCompatActivity {

    ImageButton btn_back, btn_hibou, btn_helicoptere;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_hibou = findViewById(R.id.btn_hibou);
        btn_helicoptere = findViewById(R.id.btn_helicoptere);
        mp=MediaPlayer.create(hActivity.this, R.raw.hibou);
        mp=MediaPlayer.create(hActivity.this, R.raw.helicoptere);

        btn_hibou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.hibou);
            }
        });

        btn_helicoptere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.helicoptere);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(hActivity.this, soundResource);
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

                Intent intent = new Intent(hActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}