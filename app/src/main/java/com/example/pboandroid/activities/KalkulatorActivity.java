package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pboandroid.R;


public class KalkulatorActivity extends AppCompatActivity {

    EditText input1, input2;
    float temp;
    Button btnSubmit;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        input1 = findViewById(R.id.inputsatu);
        input2 = findViewById(R.id.inputdua);
        btnSubmit = findViewById(R.id.btnSubmit);
        hasil = findViewById(R.id.hasil);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                try {
                    temp = Float.parseFloat(input1.getText().toString()) + Float.parseFloat(input2.getText().toString());
                    hasil.setText(String.valueOf(temp));
                } catch(Exception e) {
                    hasil.setText("invalid input");
                }
            }
        });
    }
}