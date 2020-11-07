package com.example.linker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NewsActivity extends AppCompatActivity {
    ImageButton bbcLondon,nytimes,theGurd,cnnNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        bbcLondon=(ImageButton)findViewById(R.id.imageButtonBBC);
        nytimes=(ImageButton)findViewById(R.id.imageButtonNY);
        theGurd=(ImageButton)findViewById(R.id.imageButtonGurdian);
        cnnNews=(ImageButton)findViewById(R.id.imageButtonCNN);
    }
    public void bbc(View v){
        Intent intentOne=new Intent(NewsActivity.this,bbcWeb.class);
        startActivity(intentOne);
    }
    public void ny(View c){
        Intent intentTwo=new Intent(NewsActivity.this,nyWeb.class);
        startActivity(intentTwo );
    }
    public void cnn(View d){
        Intent intentThree=new Intent(NewsActivity.this,cnnWeb.class);
        startActivity(intentThree );
    }
    public void gurdian(View e){
        Intent intentFour=new Intent(NewsActivity.this,gurdWeb.class);
        startActivity(intentFour );
    }
}
