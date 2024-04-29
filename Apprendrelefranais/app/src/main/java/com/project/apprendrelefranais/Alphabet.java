package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabet extends AppCompatActivity {

    ImageButton btn_a, btn_b,btn_c,btn_d, btn_e,btn_f,btn_g,btn_h,btn_i,btn_j,btn_k,btn_l,btn_m,btn_n,btn_o,btn_p,btn_q,btn_r,btn_s,btn_t,btn_u,btn_v,btn_w,btn_x,btn_y,btn_z, btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        btn_a = findViewById(R.id.btn_a);
        btn_b = findViewById(R.id.btn_b);
        btn_b = findViewById(R.id.btn_b);
        btn_c = findViewById(R.id.btn_c);
        btn_d = findViewById(R.id.btn_d);
        btn_e = findViewById(R.id.btn_e);
        btn_f = findViewById(R.id.btn_f);
        btn_g = findViewById(R.id.btn_g);
        btn_h = findViewById(R.id.btn_h);
        btn_i = findViewById(R.id.btn_i);
        btn_j = findViewById(R.id.btn_j);
        btn_k = findViewById(R.id.btn_k);
        btn_l = findViewById(R.id.btn_l);
        btn_m = findViewById(R.id.btn_m);
        btn_n = findViewById(R.id.btn_n);
        btn_o = findViewById(R.id.btn_o);
        btn_p = findViewById(R.id.btn_p);
        btn_q = findViewById(R.id.btn_q);
        btn_r = findViewById(R.id.btn_r);
        btn_s = findViewById(R.id.btn_s);
        btn_t = findViewById(R.id.btn_t);
        btn_u = findViewById(R.id.btn_u);
        btn_v = findViewById(R.id.btn_v);
        btn_w = findViewById(R.id.btn_w);
        btn_x = findViewById(R.id.btn_x);
        btn_y = findViewById(R.id.btn_y);
        btn_z = findViewById(R.id.btn_z);
        btn_back = findViewById(R.id.btn_back);

        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, aActivity.class);
                startActivity(intent);
            }
        });

        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, bActivity.class);
                startActivity(intent);
            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, cActivity.class);
                startActivity(intent);
            }
        });

        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, dActivity.class);
                startActivity(intent);
            }
        });

        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, eActivity.class);
                startActivity(intent);
            }
        });

        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, fActivity.class);
                startActivity(intent);
            }
        });

        btn_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, gActivity.class);
                startActivity(intent);
            }
        });

        btn_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, hActivity.class);
                startActivity(intent);
            }
        });

        btn_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, iActivity.class);
                startActivity(intent);
            }
        });

        btn_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, jActivity.class);
                startActivity(intent);
            }
        });

        btn_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, kActivity.class);
                startActivity(intent);
            }
        });

        btn_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, lActivity.class);
                startActivity(intent);
            }
        });

        btn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, mActivity.class);
                startActivity(intent);
            }
        });

        btn_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, nActivity.class);
                startActivity(intent);
            }
        });

        btn_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, oActivity.class);
                startActivity(intent);
            }
        });

        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, pActivity.class);
                startActivity(intent);
            }
        });

        btn_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, qActivity.class);
                startActivity(intent);
            }
        });

        btn_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, rActivity.class);
                startActivity(intent);
            }
        });

        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, sActivity.class);
                startActivity(intent);
            }
        });

        btn_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, tActivity.class);
                startActivity(intent);
            }
        });

        btn_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, uActivity.class);
                startActivity(intent);
            }
        });

        btn_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, vActivity.class);
                startActivity(intent);
            }
        });

        btn_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, wActivity.class);
                startActivity(intent);
            }
        });

        btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, xActivity.class);
                startActivity(intent);
            }
        });

        btn_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, yActivity.class);
                startActivity(intent);
            }
        });

        btn_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, zActivity.class);
                startActivity(intent);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this, list_activity.class);
                startActivity(intent);
            }
        });
    }
}