package com.example.universityofandriod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Apply extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
        Intent air = getIntent();
        Intent v = getIntent();
        final Intent n = getIntent();
        Intent j = getIntent();
        Intent l = getIntent();
        Intent m = getIntent();

        final EditText s = findViewById(R.id.school);
        final EditText b = findViewById(R.id.birthday);
        final EditText a = findViewById(R.id.name);
        final EditText g = findViewById(R.id.gpa);
        final EditText e = findViewById(R.id.circ);
        final EditText t = findViewById(R.id.tell);
        Button d = findViewById(R.id.done);

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = a.getText().toString();
                String age = b.getText().toString();
                String gpa = g.getText().toString();
                String tell = t.getText().toString();
                String circ = e.getText().toString();
                String school = s.getText().toString();

                Intent x = new Intent( Apply.this , FinalCv.class);
                x.putExtra("name", name1);
                x.putExtra("birthday", age);
                x.putExtra("gpa", gpa);
                x.putExtra("sch", school);
                x.putExtra("tell",tell);
                x.putExtra("circ",circ);


                startActivity(x);
            }
        });
    }
}