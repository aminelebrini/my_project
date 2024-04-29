package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class couleursActivity extends AppCompatActivity {

    ImageButton btn_back, btn_rouge, btn_vert, btn_bleu, btn_jaune, btn_orange, btn_violet, btn_rose, btn_blanche, btn_gris;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couleurs);

        btn_back = findViewById(R.id.btn_back);
        btn_rouge = findViewById(R.id.btn_rouge);
        btn_vert = findViewById(R.id.btn_vert);
        btn_bleu = findViewById(R.id.btn_bleu);
        btn_jaune = findViewById(R.id.btn_jaune);
        btn_orange = findViewById(R.id.btn_orange);
        btn_violet = findViewById(R.id.btn_violet);
        btn_rose = findViewById(R.id.btn_rose);
        btn_blanche = findViewById(R.id.btn_blanche);
        btn_gris = findViewById(R.id.btn_gris);
        mp = MediaPlayer.create(couleursActivity.this, R.raw.rouge);

        btn_rouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.rouge);
            }
        });

        btn_vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.vert);
            }
        });

        btn_bleu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.bleu);
            }
        });

        btn_jaune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.jaune);
            }
        });

        btn_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.orange);
            }
        });

        btn_violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.violet);
            }
        });

        btn_rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.rose);
            }
        });

        btn_blanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.blanche);
            }
        });

        btn_gris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.gris);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(couleursActivity.this, lvl1Activity.class);
                startActivity(intent);
            }
        });
    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(couleursActivity.this, soundResource);
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
