package com.example.course_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_conference extends AppCompatActivity implements View.OnClickListener{



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button5:
                Intent intent = new Intent(Video_conference.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_conference);
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        /*VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video1));

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();

        VideoView videoView2 = findViewById(R.id.videoView2);
        videoView2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video2));

        MediaController mediaController2 = new MediaController(this);
        videoView2.setMediaController(mediaController2);
        videoView2.start();*/

        VideoView videoView3 = findViewById(R.id.videoView3);
        videoView3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video3));

        MediaController mediaController3 = new MediaController(this);
        videoView3.setMediaController(mediaController3);
        videoView3.start();

        VideoView videoView4 = findViewById(R.id.videoView4);
        videoView4.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video4));

        MediaController mediaController4 = new MediaController(this);
        videoView4.setMediaController(mediaController3);
        videoView4.start();
    }

}
