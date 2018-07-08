package com.example.abdi.firebasebrownbag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    public void Database(View view) {
        startActivity(new Intent(MenuActivity.this, DatabaseActivity.class));

    }

    public void Storage(View view) {
        startActivity(new Intent(MenuActivity.this, StorageActivity.class));
    }

    public void SignOut(View view) {

        startActivity(new Intent(MenuActivity.this, LoginActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
}