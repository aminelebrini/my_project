package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class eActivity extends AppCompatActivity {

    ImageButton btn_back, btn_elephant,btn_escargot;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eactivity);

        btn_back = findViewById(R.id.btn_back);
        btn_elephant=findViewById(R.id.btn_elephant);
        btn_escargot=findViewById(R.id.btn_escargot);
        mp=MediaPlayer.create(eActivity.this, R.raw.elephant);
        mp=MediaPlayer.create(eActivity.this, R.raw.escargot);

        btn_elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.elephant);
            }
        });

        btn_escargot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.escargot);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(eActivity.this, soundResource);
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

                Intent intent = new Intent(eActivity.this,Alphabet.class);

                startActivity(intent);
            }
        });
    }
}