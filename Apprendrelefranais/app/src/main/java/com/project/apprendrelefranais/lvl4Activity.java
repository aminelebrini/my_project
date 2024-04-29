package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lvl4Activity extends AppCompatActivity {

    ImageButton btn_back,btn_cham,btn_sal,btn_spor,btn_espace,btn_tech,btn_bain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl4);
        btn_back=findViewById(R.id.btn_back);
        btn_cham=findViewById(R.id.btn_cham);
        btn_sal=findViewById(R.id.btn_sal);
        btn_spor=findViewById(R.id.btn_spor);
        btn_espace=findViewById(R.id.btn_espace);
        btn_tech=findViewById(R.id.btn_tech);
        btn_bain=findViewById(R.id.btn_bain);

        btn_cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl4Activity.this, chambreActivity.class);
                startActivity(i);
            }
        });

        btn_sal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl4Activity.this, salonActivity.class);
                startActivity(i);
            }
        });

        btn_spor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl4Activity.this, sportActivity.class);
                startActivity(i);
            }
        });

        btn_espace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl4Activity.this, espaceActivity.class);
                startActivity(i);
            }
        });

        btn_tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl4Activity.this, techActivity.class);
                startActivity(i);
            }
        });

        btn_bain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent i = new Intent(lvl4Activity.this, bainActivity.class);
                 startActivity(i);
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl4Activity.this, list_activity.class);
                startActivity(i);
            }
        });
    }
}