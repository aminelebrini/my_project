package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class oActivity extends AppCompatActivity {

    ImageButton btn_back, btn_oiseau, btn_orange;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_oiseau = findViewById(R.id.btn_oiseau);
        btn_orange = findViewById(R.id.btn_orange);
        mp=MediaPlayer.create(oActivity.this, R.raw.oiseau);
        mp=MediaPlayer.create(oActivity.this, R.raw.orange);

        btn_oiseau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.oiseau);
            }
        });

        btn_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.orange);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(oActivity.this, soundResource);
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

                Intent intent = new Intent(oActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}