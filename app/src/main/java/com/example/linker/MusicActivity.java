package com.example.linker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MusicActivity extends AppCompatActivity {
    ImageButton spoti,cloud,hung,gana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        spoti=(ImageButton)findViewById(R.id.imageButtonSpotify);
        cloud=(ImageButton)findViewById(R.id.imageButtonSound);
        hung=(ImageButton)findViewById(R.id.imageButtonHungama);
        gana=(ImageButton)findViewById(R.id.imageButtonGanna);
    }
    public void spotify(View v){
        Intent intentOne=new Intent(MusicActivity.this,spotiWeb.class);
        startActivity(intentOne);
    }
    public void sound(View c){
        Intent intentTwo=new Intent(MusicActivity.this,cloudWeb.class);
        startActivity(intentTwo );
    }
    public void hungama(View d){
        Intent intentThree=new Intent(MusicActivity.this,cnnWeb.class);
        startActivity(intentThree );
    }
    public void ganna(View e){
        Intent intentFour=new Intent(MusicActivity.this,gurdWeb.class);
        startActivity(intentFour );
    }
}
