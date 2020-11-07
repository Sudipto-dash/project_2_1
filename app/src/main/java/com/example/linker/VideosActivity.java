package com.example.linker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VideosActivity extends AppCompatActivity {
    ImageButton tube,net,daily,hul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        tube=(ImageButton)findViewById(R.id.imageButtonUtube);
        net=(ImageButton)findViewById(R.id.imageButtonNetFlix);
        daily=(ImageButton)findViewById(R.id.imageButtonDailyMotion);
        hul=(ImageButton)findViewById(R.id.imageButtonHulu);
    }
    public void utube(View v){
        Intent intentOne=new Intent(VideosActivity.this,utubeWeb.class);
        startActivity(intentOne);
    }
    public void flix(View c){
        Intent intentTwo=new Intent(VideosActivity.this,netflixWeb.class);
        startActivity(intentTwo );
    }
    public void motion(View d){
        Intent intentThree=new Intent(VideosActivity.this,motionWeb.class);
        startActivity(intentThree );
    }
    public void hulu(View e){
        Intent intentFour=new Intent(VideosActivity.this,huluWeb.class);
        startActivity(intentFour );
    }
}
