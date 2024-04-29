package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lvl1Activity extends AppCompatActivity {

    ImageButton btn_couleurs, btn_nombres, btn_fruits, btn_legumes, btn_trsp,btn_alphabets, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1);

        btn_couleurs=findViewById(R.id.btn_couleurs);
        btn_nombres=findViewById(R.id.btn_nombres);
        btn_fruits=findViewById(R.id.btn_fruits);
        btn_legumes=findViewById(R.id.btn_legumes);
        btn_trsp=findViewById(R.id.btn_trsp);
        btn_alphabets=findViewById(R.id.btn_alphabets);
        btn_back=findViewById(R.id.btn_back);


        btn_couleurs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl1Activity.this, couleursActivity.class);
                startActivity(i);
            }
        });

        btn_nombres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl1Activity.this, list_numActivity.class);
                startActivity(i);
            }
        });

        btn_fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl1Activity.this, fruits.class);
                startActivity(i);
            }
        });

        btn_legumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl1Activity.this, list_legumeActivity.class);
                startActivity(i);
            }
        });

        btn_trsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl1Activity.this, trspActivity.class);
                startActivity(i);
            }
        });

        btn_alphabets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl1Activity.this, Alphabet.class);
                startActivity(i);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl1Activity.this, list_activity.class);
                startActivity(i);
            }
        });
    }
}