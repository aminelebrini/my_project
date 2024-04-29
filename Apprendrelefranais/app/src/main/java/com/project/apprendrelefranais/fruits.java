package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class fruits extends AppCompatActivity {

        ImageButton btn_back, btn_bananne, btn_pomme, btn_citron, btn_raisin, btn_cerise, btn_orangge, btn_poire, btn_fraise, btn_ananas, btn_pasteque, btn_peche, btn_kiwii, btn_avocat, btn_melon, btn_figue;
        MediaPlayer mp;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_fruits);

                btn_back = findViewById(R.id.btn_back);
                btn_bananne = findViewById(R.id.btn_bananne);
                btn_pomme = findViewById(R.id.btn_pomme);
                btn_citron = findViewById(R.id.btn_citron);
                btn_raisin = findViewById(R.id.btn_raisin);
                btn_cerise = findViewById(R.id.btn_cerise);
                btn_orangge = findViewById(R.id.btn_orange);
                btn_poire = findViewById(R.id.btn_poire);
                btn_fraise = findViewById(R.id.btn_fraise);
                btn_ananas = findViewById(R.id.btn_ananas);
                btn_pasteque = findViewById(R.id.btn_pasteque);
                btn_peche = findViewById(R.id.btn_peche);
                btn_kiwii = findViewById(R.id.btn_kiwii);
                btn_avocat = findViewById(R.id.btn_avocat);
                btn_melon = findViewById(R.id.btn_melon);
                btn_figue = findViewById(R.id.btn_figue);
                mp = MediaPlayer.create(fruits.this, R.raw.banane);

                btn_bananne.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.banane);
                        }
                });

                btn_pomme.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.pomme);
                        }
                });

                btn_citron.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.citron);
                        }
                });
                btn_raisin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.raisin);
                        }
                });
                btn_cerise.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.cerise);
                        }
                });
                btn_orangge.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.orange);
                        }
                });
                btn_poire.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.poire);
                        }
                });
                btn_fraise.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.fraise);
                        }
                });
                btn_ananas.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.ananass);
                        }
                });
                btn_pasteque.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.pasteque);
                        }
                });

                btn_peche.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.peche);
                        }
                });

                btn_kiwii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.kiwii);
                        }
                });
                btn_avocat.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.avocatt);
                        }
                });
                btn_melon.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.melon);
                        }
                });
                btn_figue.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                playSound(R.raw.figue);
                        }
                });

                // Ajoutez les autres listeners pour les autres boutons de fruits de la même manière...

                btn_back.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(fruits.this, list_activity.class);
                                startActivity(intent);
                        }
                });
        }

        private void playSound(int soundResource) {
                if (mp != null) {
                        mp.release();
                }
                mp = MediaPlayer.create(fruits.this, soundResource);
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