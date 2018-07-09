package com.example.abdi.firebasebrownbag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabaseActivity extends AppCompatActivity {

    private FirebaseDatabase database;
    private DatabaseReference myRef;
    private FirebaseAuth auth;
    private EditText name, address;

    public void Save(View view) {
//        auth = FirebaseAuth.getInstance();
//
//        String nameString = name.getText().toString().trim();
//        String addressString = address.getText().toString().trim();
//
//        User user = new User(nameString, auth.getCurrentUser().getEmail(), addressString);
//        myRef.child(auth.getCurrentUser().getUid()).setValue(user);
//        Toast.makeText(getApplicationContext(), "Data saved!", Toast.LENGTH_LONG).show();
    }

    public void Back(View view) {
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

//        database = FirebaseDatabase.getInstance();
//        myRef = database.getReference("User");

        name = findViewById(R.id.Name);
        address = findViewById(R.id.Address);
    }
}
