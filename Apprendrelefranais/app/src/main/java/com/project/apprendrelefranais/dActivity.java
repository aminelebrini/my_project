package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class dActivity extends AppCompatActivity {

    ImageButton btn_back, btn_drapeau,btn_dromadaire;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_drapeau=findViewById(R.id.btn_drapeau);
        btn_dromadaire=findViewById(R.id.btn_dromadaire);
        mp=MediaPlayer.create(dActivity.this, R.raw.drapeau);
        mp=MediaPlayer.create(dActivity.this, R.raw.dromadaire);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(dActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });

        btn_drapeau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.drapeau);
            }
        });

        btn_dromadaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.dromadaire);
            }
        });
    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(dActivity.this, soundResource);
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
    }
}