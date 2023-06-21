package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pboandroid.R;

public class LoginFormActivity extends AppCompatActivity {

    EditText username, password;
    Button buttonLogin;
    TextView signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        username = findViewById(R.id.editTextUsername);
        password = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        signUp = findViewById(R.id.signUp);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equalsIgnoreCase("rafli") && password.getText().toString().equalsIgnoreCase("password")) {
                    Toast.makeText(LoginFormActivity.this, "Login berhasil" ,Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(LoginFormActivity.this, "username atau password salah", Toast.LENGTH_LONG).show();
                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(LoginFormActivity.this, RegisterActivity.class);
                startActivity(register);
//                finish();
            }
        });
    }
}