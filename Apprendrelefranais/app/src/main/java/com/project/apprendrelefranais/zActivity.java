package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class zActivity extends AppCompatActivity {

    ImageButton btn_back,btn_zebre,btn_zappe;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_zebre = findViewById(R.id.btn_zebre);
        btn_zappe = findViewById(R.id.btn_zappe);
        mp = MediaPlayer.create(zActivity.this, R.raw.zebre);
        mp = MediaPlayer.create(zActivity.this, R.raw.zappe);

        btn_zebre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.zebre);
            }
        });

        btn_zappe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.zappe);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(zActivity.this, soundResource);
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

                Intent intent = new Intent(zActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}