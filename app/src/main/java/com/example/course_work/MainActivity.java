package com.example.course_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setOnClickListener(this);

        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setOnClickListener(this);

        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setOnClickListener(this);

        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setOnClickListener(this);

        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setOnClickListener(this);

        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setOnClickListener(this);

        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView15.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textView12:
            Intent intent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(intent);
            break;
            case R.id.textView13:
            Intent i = new Intent(MainActivity.this, favorites.class);
            startActivity(i);
            break;
            case R.id.imageView11:
            Intent a = new Intent(MainActivity.this, Conferences.class);
            startActivity(a);
            break;
            case R.id.imageView12:
            Intent b = new Intent(MainActivity.this, Excursions.class);
            startActivity(b);
            break;
            case R.id.imageView13:
            Intent c = new Intent(MainActivity.this, Exhibitions.class);
            startActivity(c);
            break;
            case R.id.imageView14:
            Intent f = new Intent(MainActivity.this, TheatreActivity.class);
            startActivity(f);
            break;
            case R.id.imageView15:
            Intent e = new Intent(MainActivity.this, Video_conference.class);
            startActivity(e);
            break;
        }
    }
}

