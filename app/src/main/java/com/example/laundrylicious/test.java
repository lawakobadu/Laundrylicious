//package com.example.laundrylicious;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowManager;
//
//public class test extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();
//        setContentView(R.layout.test);
//    }
//
//    public void kembali(View view) {
//        startActivity(new Intent(this, riwayat_transaksi.class));
//        finish();
//    }
//
//    public void balik(View view) {
//        startActivity(new Intent(this, login.class));
//        finish();
//    }
//}