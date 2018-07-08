package com.example.abdi.firebasebrownbag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    public void RegisterLink(View view) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }

    public void Login(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
