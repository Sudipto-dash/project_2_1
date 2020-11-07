package com.example.linker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class cbWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb_web);
        WebView webs;
        setContentView(R.layout.activity_espn_web);
        webs=(WebView)findViewById(R.id.webView);
        webs.setWebViewClient(new WebViewClient());
        webs.loadUrl("https://www.cricbuzz.com");
    }
}
