//package com.example.laundrylicious;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowManager;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class login extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        setContentView(R.layout.login);
//    }
//
//    public void pindah(View view) {
//        Intent intent = new Intent(this, register.class);
//        startActivity(intent);
//    }
//
//    public void masuk(View view) {
//        startActivity(new Intent(this, dashboard.class));
//        finish();
//    }
//
//    public void lupa_password(View view) {
//        startActivity(new Intent(this, lupa_password.class));
//        finish();
//    }
//}
