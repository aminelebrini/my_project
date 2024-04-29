package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class trspActivity extends AppCompatActivity {

    ImageButton btn_back,btn_velo,btn_train,btn_voiiture,btn_navire,btn_avion,btn_moto,btn_camion;
    ImageButton btn_bus,btn_helicopterre,btn_voipolice,btn_campompier,btn_ambulance;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trsp);

        btn_back=findViewById(R.id.btn_back);
        btn_velo=findViewById(R.id.btn_velo);
        btn_train=findViewById(R.id.btn_train);
        btn_voiiture=findViewById(R.id.btn_voiiture);
        btn_navire=findViewById(R.id.btn_navire);
        btn_avion=findViewById(R.id.btn_avion);
        btn_moto=findViewById(R.id.btn_moto);
        btn_camion=findViewById(R.id.btn_camion);
        btn_bus=findViewById(R.id.btn_bus);
        btn_helicopterre=findViewById(R.id.btn_helicopterre);
        btn_voipolice=findViewById(R.id.btn_voipolice);
        btn_campompier=findViewById(R.id.btn_campompier);
        btn_ambulance=findViewById(R.id.btn_ambulance);
        mp = MediaPlayer.create(trspActivity.this, R.raw.velo);

        btn_velo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.velo);
            }
        });

        btn_train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.train);
            }
        });
        btn_voiiture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.voiture);
            }
        });
        btn_navire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.navire);
            }
        });
        btn_avion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.avion);
            }
        });
        btn_moto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.moto);
            }
        });
        btn_camion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.camion);
            }
        });
        btn_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.bus);
            }
        });
        btn_helicopterre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.helicoptere);
            }
        });
        btn_voipolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.voipolice);
            }
        });
        btn_campompier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.camionpomp);
            }
        });
        btn_ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.ambulance);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(trspActivity.this,lvl1Activity.class);

                startActivity(intent);
            }
        });
    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(trspActivity.this, soundResource);
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