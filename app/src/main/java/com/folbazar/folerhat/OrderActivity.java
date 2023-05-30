package com.folbazar.folerhat;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {
    //backiconn
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        back = findViewById(R.id.imageView2);
        back.setOnClickListener(v -> {
            finish();
        });
    }
}