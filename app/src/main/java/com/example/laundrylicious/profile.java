package com.example.laundrylicious;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.profile);
    }

    public void kembali(View view) {
        startActivity(new Intent(this, dashboard.class));
        finish();
    }

    public void ganti_nama(View view) {
        startActivity(new Intent(this, ganti_nama.class));
        finish();
    }

    public void ganti_email(View view) {
        startActivity(new Intent(this, ganti_email.class));
        finish();
    }

    public void ganti_nohp(View view) {
        startActivity(new Intent(this, ganti_nohp.class));
        finish();
    }

    public void ganti_pw(View view) {
        startActivity(new Intent(this, ganti_pwbaru.class));
        finish();
    }
}