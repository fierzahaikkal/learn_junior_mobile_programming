package com.example.pboandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputNama;
    Button proses;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNama = findViewById(R.id.nama);
        proses = findViewById(R.id.submit);
        hasil = findViewById(R.id.hasil);
        proses.setOnClickListener(view -> {
            hasil.setText(inputNama.getText().toString());
        });
    }
}