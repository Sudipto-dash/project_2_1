package com.example.linker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SportsActivity extends AppCompatActivity {
    ImageButton espn,cb,fox,sky,ary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        espn=(ImageButton)findViewById(R.id.imageButtonEspn);
        cb=(ImageButton)findViewById(R.id.imageButtonCricbuzz);
        fox=(ImageButton)findViewById(R.id.imageButtonFox);
        sky=(ImageButton)findViewById(R.id.imageButtonSky);
        ary=(ImageButton)findViewById(R.id.imageButtonAry);
    }
    public void espnSports(View v){
        Intent intentOne=new Intent(SportsActivity.this,espnWeb.class);
        startActivity(intentOne);
    }
    public void cbSports(View c){
        Intent intentTwo=new Intent(SportsActivity.this,cbWeb.class);
        startActivity(intentTwo );
    }
    public void arySports(View d){
        Intent intentThree=new Intent(SportsActivity.this,aryWeb.class);
        startActivity(intentThree );
    }
    public void foxSports(View e){
        Intent intentFour=new Intent(SportsActivity.this,foxWeb.class);
        startActivity(intentFour );
    }
    public void skySports(View f){
        Intent intentFive=new Intent(SportsActivity.this,skyWeb.class);
        startActivity(intentFive );
    }
}
