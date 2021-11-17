package com.example.laundrylicious;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;

public class verifikasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.verifikasi);
    }

    public void kembali(View view) {
        startActivity(new Intent(this, lupa_password.class));
        finish();
    }

    public void simpan(View view) {
        startActivity(new Intent(this, dashboard.class));
        finish();
    }
}
