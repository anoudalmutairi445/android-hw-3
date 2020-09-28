package com.example.universityofandriod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class contactuss extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactuss);

        Button e1 = findViewById(R.id.email1);
        Button e2 = findViewById(R.id.email2);
        Button cal = findViewById(R.id.markerc);
        Button flo = findViewById(R.id.markerf);
        Button hon = findViewById(R.id.markerh);
        Button par = findViewById(R.id.markerp);
        Button n1 = findViewById(R.id.num1);
        Button n2 = findViewById(R.id.num2);

        Intent drop = getIntent();

       e1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/#inbox?compose=CllgCJNxNdjnrBHmVSmhPHgFJSXDBzXVtptslxbPpPMlWqjrbMCsqRFSTJSHzRVvbzKnNVClqdB"));
               startActivity(browserIntent);

           }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/#inbox?compose=CllgCJNxNdjnrBHmVSmhPHgFJSXDBzXVtptslxbPpPMlWqjrbMCsqRFSTJSHzRVvbzKnNVClqdB"));
                startActivity(browserIntent);

            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                phoneIntent.setData(Uri.parse("tel:99387984"));
                startActivity(phoneIntent);

            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:50040431"));
                startActivity(callIntent);


            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.kw/maps/place/Disneyland+Park/@33.8120962,-117.9211629,17z/data=!3m1!4b1!4m5!3m4!1s0x80dcd7d12b3b5e6b:0x2ef62f8418225cfa!8m2!3d33.8120918!4d-117.9189742?hl=en&authuser=0"));
                startActivity(browserIntent);

            }
        });
        flo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.kw/maps/place/Walt+Disney+World%C2%AE+Resort/@28.3852377,-81.5660627,17z/data=!3m1!4b1!4m5!3m4!1s0x88dd7ee634caa5f7:0xa71e391fd01cf1a0!8m2!3d28.385233!4d-81.563874?hl=en&authuser=0"));
                startActivity(browserIntent);

            }
        });
        hon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.kw/maps/place/Hong+Kong+Disneyland/@22.3129715,114.0390932,17z/data=!3m1!4b1!4m5!3m4!1s0x3403fc2f53d3953d:0x35b3af6ce4475405!8m2!3d22.3129666!4d114.0412819?hl=en&authuser=0"));
                startActivity(browserIntent);

            }
        });
        par.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.kw/maps/place/Disneyland+Park/@48.8701047,2.7778589,17z/data=!3m1!4b1!4m5!3m4!1s0x47e61d258669d87f:0x50bced61a25e17e5!8m2!3d48.8701012!4d2.7800476?hl=en&authuser=0"));
                startActivity(browserIntent);

            }
        });


    }



    }

