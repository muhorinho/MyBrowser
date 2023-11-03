package com.muhammedbuga.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = findViewById(R.id.webview);
        Button btnGo = findViewById(R.id.go);
        EditText txtAddress = findViewById(R.id.adress);

        webview.setWebViewClient(new WebViewClient());

        btnGo.setOnClickListener(v -> {
            String url = "http://" + txtAddress.getText().toString(); // Kullanıcının girdiği web adresi
            webview.loadUrl(url); // WebView ile belirtilen URL'yi yükle
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}