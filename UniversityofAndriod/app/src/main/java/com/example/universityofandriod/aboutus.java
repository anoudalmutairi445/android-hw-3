package com.example.universityofandriod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);


        Button w = findViewById(R.id.arielmovie);
        Button b = findViewById(R.id.beautyandthebeast);
        Button g = findViewById(R.id.cinder);
        Button p = findViewById(R.id.petter);


            Intent air = getIntent();





       w.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kidsmovies.co/movies/the-little-mermaid"));
               startActivity(browserIntent);

           }
        });

       b.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                Intent browserIntent2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kidsmovies.co/movies/beauty-and-the-beast"));
                startActivity(browserIntent2);

            }
        });
       g.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                Intent browserIntent3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kidsmovies.co/movies/cinderella"));
                startActivity(browserIntent3);
            }
        });
//
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    Intent browserIntent4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kidsmovies.co/movies/peter-pan"));
                startActivity(browserIntent4);
        }
        });



        }
    }


