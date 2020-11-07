package com.example.linker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aryWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ary_web);
        WebView webs;
        setContentView(R.layout.activity_espn_web);
        webs=(WebView)findViewById(R.id.webView);
        webs.setWebViewClient(new WebViewClient());
        webs.loadUrl("https://arysports.tv/");
    }
}
