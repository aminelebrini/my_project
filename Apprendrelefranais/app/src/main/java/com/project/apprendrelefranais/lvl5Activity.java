package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lvl5Activity extends AppCompatActivity {

    ImageButton btn_back,btn_dra,btn_pay,btn_prof,btn_famille,btn_repas,btn_bain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl5);

        btn_back=findViewById(R.id.btn_back);
        btn_dra=findViewById(R.id.btn_dra);
        btn_pay=findViewById(R.id.btn_pay);
        btn_prof=findViewById(R.id.btn_prof);
        btn_famille=findViewById(R.id.btn_famille);
        btn_repas=findViewById(R.id.btn_repas);
        btn_bain=findViewById(R.id.btn_bain);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl5Activity.this, list_activity.class);
                startActivity(i);
            }
        });

        btn_dra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl5Activity.this, drapauxActivity.class);
                startActivity(i);
            }
        });

        btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl5Activity.this, paysActivity.class);
                startActivity(i);
            }
        });

        btn_prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl5Activity.this, profesActivity.class);
                startActivity(i);
            }
        });

        btn_famille.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl5Activity.this, familleActivity.class);
                startActivity(i);
            }
        });

        btn_repas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl5Activity.this, repasActivity.class);
                startActivity(i);
            }
        });

        btn_bain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl5Activity.this, bainActivity.class);
                startActivity(i);
            }
        });


    }
}