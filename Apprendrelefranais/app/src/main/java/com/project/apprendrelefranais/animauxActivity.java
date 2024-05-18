package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class animauxActivity extends AppCompatActivity {

    ImageButton btn_back,btn_chien,btn_chat,btn_oiseauu,btn_poisson,btn_souris,btn_tortue,btn_lapin,btn_cameleon,btn_peroquet;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animaux);

        btn_back = findViewById(R.id.btn_back);
        btn_chien = findViewById(R.id.btn_chien);
        btn_chat = findViewById(R.id.btn_chat);
        btn_oiseauu = findViewById(R.id.btn_oiseauu);
        btn_poisson = findViewById(R.id.btn_poisson);
        btn_souris = findViewById(R.id.btn_souris);
        btn_tortue = findViewById(R.id.btn_tortue);
        btn_lapin = findViewById(R.id.btn_lapin);
        btn_cameleon = findViewById(R.id.btn_cameleon);
        btn_peroquet = findViewById(R.id.btn_peroquet);
        mp=MediaPlayer.create(animauxActivity.this, R.raw.chien);

        btn_chien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.chien);
            }
        });

        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.chat);
            }
        });

        btn_oiseauu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.oiseau);
            }
        });
        btn_poisson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.poisson);
            }
        });
        btn_souris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.souris);
            }
        });
        btn_tortue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.tortue);
            }
        });
        btn_lapin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.lapin);
            }
        });
        btn_cameleon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.cameleon);
            }
        });
        btn_peroquet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.peroquet);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(animauxActivity.this,lvl2Activity.class);

                startActivity(intent);
            }
        });
    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(animauxActivity.this, soundResource);
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