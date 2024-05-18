package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class moisActivity extends AppCompatActivity {

    ImageButton btn_back,btn_janvier,btn_fevrier,btn_mars,btn_avril,btn_mai,btn_juin;
    ImageButton btn_juillet,btn_aout,btn_septembre,btn_octobre,btn_nouvembre,btn_decembre;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mois);

        btn_back = findViewById(R.id.btn_back);
        btn_janvier = findViewById(R.id.btn_janvier);
        btn_fevrier = findViewById(R.id.btn_fevrier);
        btn_mars = findViewById(R.id.btn_mars);
        btn_avril = findViewById(R.id.btn_avril);
        btn_mai = findViewById(R.id.btn_mai);
        btn_juin = findViewById(R.id.btn_juin);
        btn_juillet = findViewById(R.id.btn_juillet);
        btn_aout = findViewById(R.id.btn_aout);
        btn_septembre = findViewById(R.id.btn_septembre);
        btn_octobre = findViewById(R.id.btn_octobre);
        btn_nouvembre = findViewById(R.id.btn_nouvembre);
        btn_decembre = findViewById(R.id.btn_decembre);
        mp=MediaPlayer.create(moisActivity.this, R.raw.janvier);

        btn_janvier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.janvier);
            }
        });
        btn_fevrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.fevrier);
            }
        });
        btn_mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.mars);
            }
        });
        btn_avril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.avril);
            }
        });
        btn_mai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.mai);
            }
        });
        btn_juin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.juin);
            }
        });
        btn_juillet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.juillet);
            }
        });
        btn_aout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.aout);
            }
        });
        btn_septembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.septembre);
            }
        });
        btn_octobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.octobre);
            }
        });
        btn_nouvembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.nouvembre);
            }
        });
        btn_decembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.decembre);
            }
        });
    }

    private void playSound(int soundResource){
        if (mp!=null){
            mp.release();
        }
        mp=MediaPlayer.create(moisActivity.this, soundResource);
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

                Intent intent = new Intent(moisActivity.this,lvl2Activity.class);

                startActivity(intent);
            }
        });
    }
}