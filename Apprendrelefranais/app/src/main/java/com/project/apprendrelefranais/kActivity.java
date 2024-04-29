package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kActivity extends AppCompatActivity {

    ImageButton btn_back, btn_kiwi, btn_kouala;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_kiwi = findViewById(R.id.btn_kiwi);
        btn_kouala = findViewById(R.id.btn_kouala);
        mp=MediaPlayer.create(kActivity.this, R.raw.kiwi);
        mp=MediaPlayer.create(kActivity.this, R.raw.kouala);

        btn_kiwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.kiwi);
            }
        });

        btn_kouala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.kouala);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(kActivity.this, soundResource);
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

                Intent intent = new Intent(kActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}