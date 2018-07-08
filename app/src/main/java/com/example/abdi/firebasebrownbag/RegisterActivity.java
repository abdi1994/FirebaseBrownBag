package com.example.abdi.firebasebrownbag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    public void LoginLink(View view) {
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
    }

    public void Register(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}