package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class joursActivity extends AppCompatActivity {

    ImageButton btn_back, btn_lundi,btn_mardi,btn_mercredi,btn_jeudi,btn_vendredi,btn_samedi,btn_dimanche;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jours);


        btn_back = findViewById(R.id.btn_back);
        btn_lundi = findViewById(R.id.btn_lundi);
        btn_mardi = findViewById(R.id.btn_mardi);
        btn_mercredi = findViewById(R.id.btn_mercredi);
        btn_jeudi = findViewById(R.id.btn_jeudi);
        btn_vendredi = findViewById(R.id.btn_vendredi);
        btn_samedi = findViewById(R.id.btn_samedi);
        btn_dimanche = findViewById(R.id.btn_dimanche);
        mp=MediaPlayer.create(joursActivity.this, R.raw.lundi);

        btn_lundi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.lundi);
            }
        });

        btn_mardi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.mardi);
            }
        });
        btn_mercredi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.mercredi);
            }
        });
        btn_jeudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.jeudi);
            }
        });
        btn_vendredi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.vendredi);
            }
        });
        btn_samedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.samedi);
            }
        });
        btn_dimanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.dimanche);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(joursActivity.this,lvl2Activity.class);

                startActivity(intent);
            }
        });
    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(joursActivity.this, soundResource);
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