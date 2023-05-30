package com.folbazar.folerhat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        //full screen mode hide status bar
        getWindow().setFlags(1024, 1024);


        //hide action bar
      //  getSupportActionBar().hide();



    }
}