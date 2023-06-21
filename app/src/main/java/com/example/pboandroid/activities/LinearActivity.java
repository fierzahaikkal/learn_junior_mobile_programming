package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pboandroid.R;

public class LinearActivity extends AppCompatActivity {
    EditText inputNama, inputAlamat;
    TextView hasil;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        inputNama = findViewById(R.id.inputNama);
        inputAlamat = findViewById(R.id.inputAlamat);
        hasil = findViewById(R.id.hasil);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(view -> {
            hasil.setText(String.format("Hello nama saya %s dan alamat saya di %s", inputNama.getText().toString(), inputAlamat.getText().toString()));
        });

    }
}