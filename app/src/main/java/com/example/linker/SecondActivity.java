package com.example.linker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {
    ImageButton sports,music,news,videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sports=(ImageButton)findViewById(R.id.imageButtonSports);
        music=(ImageButton)findViewById(R.id.imageButtonMusic);
        news=(ImageButton)findViewById(R.id.imageButtonNews);
        videos=(ImageButton)findViewById(R.id.imageButonVideo);
    }
    public void sports (View v){
        Intent sportsPage=new Intent(SecondActivity.this,SportsActivity.class);
        startActivity(sportsPage);
    }
    public void news (View c){
        Intent newsPage=new Intent(SecondActivity.this,NewsActivity.class);
        startActivity(newsPage);

    }
    public void music (View d){
        Intent musicPage=new Intent(SecondActivity.this,MusicActivity.class);
        startActivity(musicPage);

    }
    public void videos (View e){
        Intent videosPage=new Intent(SecondActivity.this,VideosActivity.class);
        startActivity(videosPage);

    }
}
