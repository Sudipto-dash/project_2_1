package com.example.linker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class utubeWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utube_web);
        WebView webs;
        webs=(WebView)findViewById(R.id.webView);
        webs.setWebViewClient(new WebViewClient());
        webs.loadUrl("https://youtube.com/");
    }
}
