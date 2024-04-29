package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class list_legumeActivity extends AppCompatActivity {

    ImageButton btn_back,btn_tomate,btn_potere,btn_oignon,btn_carotte,btn_laitue,btn_mais;
    ImageButton btn_poivron,btn_brocoli,btn_concombre,btn_champignon,btn_ail,btn_citrouille,btn_choufleur,btn_haricots;
    ImageButton btn_radis,btn_persil,btn_piment,btn_aubergine;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_legume);

        btn_back = findViewById(R.id.btn_back);
        btn_tomate = findViewById(R.id.btn_tomate);
        btn_potere = findViewById(R.id.btn_potere);
        btn_oignon = findViewById(R.id.btn_oignon);
        btn_carotte= findViewById(R.id.btn_carotte);
        btn_laitue = findViewById(R.id.btn_laitue);
        btn_mais = findViewById(R.id.btn_mais);
        btn_poivron = findViewById(R.id.btn_poivron);
        btn_brocoli = findViewById(R.id.btn_brocoli);
        btn_concombre = findViewById(R.id.btn_concombre);
        btn_champignon = findViewById(R.id.btn_champignon);
        btn_ail = findViewById(R.id.btn_ail);
        btn_citrouille = findViewById(R.id.btn_citrouille);
        btn_choufleur = findViewById(R.id.btn_choufleur);
        btn_haricots = findViewById(R.id.btn_haricots);
        btn_radis = findViewById(R.id.btn_radis);
        btn_persil = findViewById(R.id.btn_persil);
        btn_piment = findViewById(R.id.btn_piment);
        btn_aubergine = findViewById(R.id.btn_aubergine);
        mp=MediaPlayer.create(list_legumeActivity.this, R.raw.tomate);

        btn_tomate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.tomate);
            }
        });

        btn_potere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.potere);
            }
        });

        btn_oignon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.oignon);
            }
        });

        btn_carotte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.carotte);
            }
        });

        btn_laitue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.laitue);
            }
        });

        btn_mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.mais);
            }
        });
        btn_poivron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.poivron);
            }
        });
        btn_brocoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.brocoli);
            }
        });
        btn_concombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.concombre);
            }
        });
        btn_champignon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.champignon);
            }
        });

        btn_ail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.ail);
            }
        });

        btn_citrouille.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.citrouille);
            }
        });
        btn_choufleur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.choufleur);
            }
        });
        btn_haricots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.haricots);
            }
        });
        btn_radis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.radis);
            }
        });
        btn_persil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.persil);
            }
        });
        btn_piment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.haricots);
            }
        });
        btn_haricots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.piment);
            }
        });
        btn_aubergine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.aubergine);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(list_legumeActivity.this,lvl1Activity.class);

                startActivity(intent);
            }
        });

    }

    private void playSound(int soundResource) {
        if (mp != null) {
            mp.release();
        }
        mp = MediaPlayer.create(list_legumeActivity.this, soundResource);
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