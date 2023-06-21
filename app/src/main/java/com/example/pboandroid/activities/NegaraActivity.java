package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.pboandroid.R;
import com.example.pboandroid.adapters.NegaraAdapter;

public class NegaraActivity extends AppCompatActivity {
    ListView lsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negara);

        lsv = findViewById(R.id.resultListView);

        String[][] dataNegara = {
                {"Indonesia", "ASIA", "Indonesia"},
                {"Malaysia", "ASIA", "Malaysia"},
                {"Singapore", "ASIA", "Singapore"},
                {"Italia", "EROPA", "Italia"},
                {"Inggris", "EROPA", "Inggris"},
                {"Belanda", "EROPA", "Belanda"},
                {"Argentina", "AMERIKA", "Argentina"},
                {"Chile", "EROPA", "Chile"},
                {"Mesir", "AFRIKA", "Mesir"},
                {"Uganda", "AFRIKA", "Uganda"},
        };

        NegaraAdapter negaraAdapter = new NegaraAdapter(dataNegara, NegaraActivity.this);
        lsv.setAdapter(negaraAdapter);

    }
}