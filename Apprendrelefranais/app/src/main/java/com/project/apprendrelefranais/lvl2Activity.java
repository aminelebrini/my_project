package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lvl2Activity extends AppCompatActivity {


    ImageButton btn_animaux, btn_jours,btn_mois,btn_ecole,btn_ville,btn_insects, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2);

        btn_animaux=findViewById(R.id.btn_animaux);
        btn_jours=findViewById(R.id.btn_jours);
        btn_mois=findViewById(R.id.btn_mois);
        btn_ecole=findViewById(R.id.btn_ecole);
        btn_ville=findViewById(R.id.btn_ville);
        btn_insects=findViewById(R.id.btn_insects);
        btn_back=findViewById(R.id.btn_back);

        btn_animaux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl2Activity.this, animauxActivity.class);
                startActivity(i);
            }
        });

        btn_jours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl2Activity.this, joursActivity.class);
                startActivity(i);
            }
        });

        btn_mois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl2Activity.this, moisActivity.class);
                startActivity(i);
            }
        });

        btn_ecole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl2Activity.this, ecoleActivity.class);
                startActivity(i);
            }
        });

        btn_ville.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl2Activity.this, villeActivity.class);
                startActivity(i);
            }
        });

        btn_insects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl2Activity.this, insectesActivity.class);
                startActivity(i);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(lvl2Activity.this, list_activity.class);
                startActivity(i);
            }
        });

    }
}