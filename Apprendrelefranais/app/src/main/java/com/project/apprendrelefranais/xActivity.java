package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class xActivity extends AppCompatActivity {

    ImageButton btn_back, btn_xylophone, btn_xeres;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_xylophone = findViewById(R.id.btn_xylophone);
        btn_xeres = findViewById(R.id.btn_xeres);
        mp = MediaPlayer.create(xActivity.this, R.raw.xylophone);
        mp = MediaPlayer.create(xActivity.this, R.raw.xeres);

        btn_xylophone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.xylophone);
            }
        });

        btn_xeres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.xeres);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(xActivity.this, soundResource);
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

                Intent intent = new Intent(xActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}