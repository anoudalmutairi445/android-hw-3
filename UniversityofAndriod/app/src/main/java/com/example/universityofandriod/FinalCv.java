package com.example.universityofandriod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FinalCv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_cv);

        TextView name = findViewById(R.id.name2);
        TextView age = findViewById(R.id.birth);
        TextView sch = findViewById(R.id.sch);
        TextView tell = findViewById(R.id.info);
        TextView act = findViewById(R.id.act);
        TextView gpa = findViewById(R.id.gpa2);

        Bundle port = getIntent().getExtras();
        String myL = port.getString("name");
        String myr = port.getString("birthday");
        String myh = port.getString("gpa");
        String mys = port.getString("sch");
        String myt = port.getString("tell");
        String myc = port.getString("circ");

        name.setText(myL);
        age.setText(myr);
        sch.setText(mys);
        gpa.setText(myh);
        tell.setText(myt);
        act.setText(myc);




    }
}