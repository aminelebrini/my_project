package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class list_activity extends AppCompatActivity {

    ImageButton btn_lvl1, btn_lvl2,btn_lvl3,btn_lvl4,btn_lvl5,btn_lvl6,btn_lvl7,btn_lvl8,btn_lvl9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btn_lvl1=findViewById(R.id.btn_lvl1);
        btn_lvl2=findViewById(R.id.btn_lvl2);
        btn_lvl3=findViewById(R.id.btn_lvl3);
        btn_lvl4=findViewById(R.id.btn_lvl4);
        btn_lvl5=findViewById(R.id.btn_lvl5);
        btn_lvl6=findViewById(R.id.btn_lvl6);
        btn_lvl7=findViewById(R.id.btn_lvl7);
        btn_lvl8=findViewById(R.id.btn_lvl8);
        btn_lvl9=findViewById(R.id.btn_lvl9);


        btn_lvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(list_activity.this, lvl1Activity.class);
                startActivity(intent);
            }
        });

        btn_lvl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(list_activity.this, lvl2Activity.class);
                startActivity(intent);
            }
        });

        btn_lvl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(list_activity.this, lvl3Activity.class);
                startActivity(intent);
            }
        });

        btn_lvl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(list_activity.this, lvl4Activity.class);
                startActivity(intent);
            }
        });

        btn_lvl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(list_activity.this, lvl5Activity.class);
                startActivity(intent);
            }
        });
        
    }
}