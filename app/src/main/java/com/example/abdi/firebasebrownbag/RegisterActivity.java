package com.example.abdi.firebasebrownbag;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText emailEditText, passwordEditText;

    public void LoginLink(View view) {
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
    }

    public void Register(View view) {
        auth = FirebaseAuth.getInstance();
        String emailString = emailEditText.getText().toString().trim();
        String passwordString = passwordEditText.getText().toString().trim();
//        auth.createUserWithEmailAndPassword(emailString, passwordString)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            Log.d("Registration", "createUserWithEmail:success");
//                            startActivity(new Intent(getApplicationContext(), MenuActivity.class));
//                            finish();
//                        } else {
//                            Log.w("Registration", "createUserWithEmail:failure", task.getException());
//                            Toast.makeText(RegisterActivity.this, "Authentication failed.",
//                                    Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
//        auth = FirebaseAuth.getInstance();

        emailEditText = findViewById(R.id.RegisterEmail);
        passwordEditText = findViewById(R.id.RegisterPassword);
    }
}