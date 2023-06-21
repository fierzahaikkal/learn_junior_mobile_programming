package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pboandroid.R;

public class PindahActivity extends AppCompatActivity {
    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah);

        pindah = findViewById(R.id.pindah);

       pindah.setOnClickListener(view -> {
           Intent pindahActivity = new Intent(PindahActivity.this, LatihanIntentActivity.class);
           startActivity(pindahActivity);
           finish(); // dispose pada desktop
       });
    }
}