package com.example.laundrylicious;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class order_list extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.order_list);
    }

    public void kembali(View view) {
        startActivity(new Intent(this, dashboard.class));
        finish();
    }

    public void tambahkan(View view) {
        startActivity(new Intent(this, detail_order.class));
        finish();
    }
}