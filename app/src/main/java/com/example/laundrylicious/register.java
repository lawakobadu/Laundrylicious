//package com.example.laundrylicious;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowManager;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//
//public class register extends AppCompatActivity {
//    EditText email, phone, password;
//    Button register;
//    TextView loginBtn;
//    FirebaseAuth fAuth;
//    ProgressBar progressBar;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();
//        setContentView(R.layout.register);
//
//        email   = findViewById(R.id.email);
//        phone   = findViewById(R.id.phone);
//        password   = findViewById(R.id.password);
//        register   = findViewById(R.id.register);
//        loginBtn   = findViewById(R.id.loginBtn);
//
//        fAuth      = FirebaseAuth.getInstance();
//        progressBar   = findViewById(R.id.progressBar);
//
//        if(fAuth.getCurrentUser() != null) {
//            startActivity(new Intent(getApplicationContext(), dashboard.class));
//            finish();
//        }
//
//        register.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                String email1 = email.getText().toString().trim();
//                String password1 = password.getText().toString().trim();
//
//                if(TextUtils.isEmpty(email1)) {
//                    email.setError("Email is Required.");
//                    return;
//                }
//
//                if(TextUtils.isEmpty(password1)) {
//                    password.setError("Password is Required");
//                    return;
//                }
//
//                if(password1.length() <6) {
//                    password.setError("Password must be >=6 characters");
//                    return;
//                }
//
//                progressBar.setVisibility(View.VISIBLE);
//
//                // Register User
//
//                fAuth.createUserWithEmailAndPassword(email1,password1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful()){
//                            Toast.makeText(register.this, "User Created", Toast.LENGTH_SHORT).show();
//                            startActivity(new Intent(getApplicationContext(), login.class));
//                        }else {
//                            Toast.makeText(register.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//            }
//        });
//    }
//
////    public void kembali(View view) {
////        startActivity(new Intent(this, login.class));
////        finish();
////    }
//}
