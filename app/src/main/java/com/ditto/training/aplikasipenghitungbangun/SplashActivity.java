package com.ditto.training.aplikasipenghitungbangun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    private static int splashTime = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent namaIntent = new Intent(SplashActivity.this, NamaActivity.class);
                startActivity(namaIntent);
                 finish();
            }
        },splashTime);
    }
}
