package com.example.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView demil, dpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        demil = findViewById(R.id.dataEmail);
        dpass = findViewById(R.id.dataPasswords);

        Bundle budel = getIntent().getExtras();

        String email = budel.getString("a");
        String passwords = budel.getString("b");

        demil.setText(email);
        dpass.setText(passwords);
    }
}