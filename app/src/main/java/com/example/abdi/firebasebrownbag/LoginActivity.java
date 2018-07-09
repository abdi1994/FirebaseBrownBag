package com.example.abdi.firebasebrownbag;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText emailEditText, passwordEditText;

    public void RegisterLink(View view) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }

    public void Login(View view) {
        auth = FirebaseAuth.getInstance();
        String emailString = emailEditText.getText().toString().trim();
        String passwordString = passwordEditText.getText().toString().trim();

//        auth.signInWithEmailAndPassword(emailString, passwordString)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//                            Log.d("Login", "signInWithEmail:success");
//                            startActivity(new Intent(getApplicationContext(), MenuActivity.class));
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Log.w("Login", "signInWithEmail:failure", task.getException());
//                            Toast.makeText(getApplicationContext(), "Authentication failed.",
//                                    Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        auth = FirebaseAuth.getInstance();

        emailEditText = findViewById(R.id.LoginEmail);
        passwordEditText = findViewById(R.id.LoginPassword);
    }
}
