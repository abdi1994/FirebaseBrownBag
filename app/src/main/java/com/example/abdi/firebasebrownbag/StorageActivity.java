package com.example.abdi.firebasebrownbag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StorageActivity extends AppCompatActivity {

    public void Upload(View view) {

    }

    public void Back(View view) {
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);
    }
}
