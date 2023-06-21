package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.pboandroid.R;

public class HomeActivity extends AppCompatActivity {

    Button linearButton, relativeButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        loginButton = findViewById(R.id.loginButton);
        linearButton = findViewById(R.id.linearButton);
        relativeButton = findViewById(R.id.relativeButton);

        loginButton.setOnClickListener(view -> {
            Intent login = new Intent(HomeActivity.this, LoginFormActivity.class);
            startActivity(login);
        });

        linearButton.setOnClickListener(view -> {
            Intent linear = new Intent(HomeActivity.this, LinearActivity.class);
            startActivity(linear);
        });

        relativeButton.setOnClickListener(view -> {
            Intent relative = new Intent(HomeActivity.this, RelativeActivity.class);
            startActivity(relative);
        });
    }
}