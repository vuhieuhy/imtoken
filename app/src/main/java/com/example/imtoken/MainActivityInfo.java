package com.example.imtoken;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivityInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_info);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right, R.anim.left);
    }
}