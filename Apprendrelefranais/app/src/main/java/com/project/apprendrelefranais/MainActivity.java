package com.project.apprendrelefranais;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_enter,btn_facebook,btn_instagram,btn_linkdin,btn_x,btn_github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_enter = findViewById(R.id.btn_enter);
        btn_facebook = findViewById(R.id.btn_facebook);
        btn_instagram = findViewById(R.id.btn_instagram);
        btn_linkdin = findViewById(R.id.btn_linkdin);
        btn_x = findViewById(R.id.btn_x);
        btn_github = findViewById(R.id.btn_github);

        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSocielMedialink("https://web.facebook.com/profile.php?id=100077032690356");
            }
        });

        btn_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSocielMedialink("https://www.instagram.com/amine_lebrini_");
            }
        });

        btn_linkdin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSocielMedialink("https://www.linkedin.com/in/amine-lebrini-76b526297/");
            }
        });

        btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSocielMedialink("https://twitter.com/AmineLebrini4");
            }
        });

        btn_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSocielMedialink("https://github.com/aminelebrini");
            }
        });


        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(MainActivity.this, list_activity.class);
                startActivity(intent);
            }
        });
    }

    private void openSocielMedialink(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}