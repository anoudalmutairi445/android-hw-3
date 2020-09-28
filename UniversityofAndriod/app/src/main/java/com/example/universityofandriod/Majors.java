package com.example.universityofandriod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Majors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majors);

        Intent bird = getIntent();

        Button j = findViewById(R.id.jasmine);
        Button c = findViewById(R.id.cinderella);
        Button a = findViewById(R.id.ariel);
        Button s = findViewById(R.id.snowwhite);
        Button b = findViewById(R.id.belle);
        Button r = findViewById(R.id.rep);

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent( Majors.this , Apply.class);
                startActivity(x);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent( Majors.this , Apply.class);
                startActivity(x);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent( Majors.this , Apply.class);
                startActivity(x);
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent( Majors.this , Apply.class);
                startActivity(x);
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent( Majors.this , Apply.class);
                startActivity(x);
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent( Majors.this , Apply.class);
                startActivity(x);
            }
        });





    }
}