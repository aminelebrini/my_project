package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lvl3Activity extends AppCompatActivity {

    ImageButton btn_met,btn_vet,btn_corps,btn_vac,btn_form,btn_cui,btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl3);
        btn_met=findViewById(R.id.btn_met);
        btn_vet=findViewById(R.id.btn_vet);
        btn_corps=findViewById(R.id.btn_corps);
        btn_vac=findViewById(R.id.btn_vac);
        btn_form=findViewById(R.id.btn_form);
        btn_cui=findViewById(R.id.btn_cui);
        btn_back=findViewById(R.id.btn_back);

        btn_met.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl3Activity.this, meteoActivity.class);
                startActivity(i);
            }
        });

        btn_vet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl3Activity.this, vetementActivity.class);
                startActivity(i);
            }
        });

        btn_corps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl3Activity.this, corpsActivity.class);
                startActivity(i);
            }
        });

        btn_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl3Activity.this, formesActivity.class);
                startActivity(i);
            }
        });

        btn_cui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl3Activity.this, cuisineActivity.class);
                startActivity(i);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lvl3Activity.this, list_activity.class);
                startActivity(i);
            }
        });

    }
}