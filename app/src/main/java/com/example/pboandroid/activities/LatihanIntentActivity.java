package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pboandroid.R;

public class LatihanIntentActivity extends AppCompatActivity {

    EditText kata;
    Button submit;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_intent);

        kata = findViewById(R.id.kata);
        submit = findViewById(R.id.btnSubmit);
        hasil = findViewById(R.id.hasil);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil.setText(kata.getText().toString());
            }
        });

    }
}