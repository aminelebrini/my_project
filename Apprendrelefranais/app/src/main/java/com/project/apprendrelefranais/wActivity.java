package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class wActivity extends AppCompatActivity {

    ImageButton btn_back,btn_wagon,btn_wapiti;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_wagon = findViewById(R.id.btn_wagon);
        btn_wapiti = findViewById(R.id.btn_wapiti);
        mp = MediaPlayer.create(wActivity.this, R.raw.wagon);
        mp = MediaPlayer.create(wActivity.this, R.raw.wapiti);

        btn_wagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.wagon);
            }
        });

        btn_wapiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.wapiti);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(wActivity.this, soundResource);
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

                Intent intent = new Intent(wActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}