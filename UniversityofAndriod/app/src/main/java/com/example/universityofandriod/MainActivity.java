package com.example.universityofandriod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button u = findViewById(R.id.contactus);
        Button t = findViewById(R.id.aboutuss);
        Button f = findViewById(R.id.apply);


        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent( MainActivity.this , contactuss.class);
                startActivity(x);
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent( MainActivity.this , aboutus.class);
                startActivity(v);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent( MainActivity.this , Majors.class);
                startActivity(k);
            }
        });





    }
}