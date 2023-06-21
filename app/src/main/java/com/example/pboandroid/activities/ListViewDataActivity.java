package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pboandroid.R;

public class ListViewDataActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_data);
        ListView listView;
        ArrayAdapter<String> arrayAdapter;
        String[] programmingLanguage = {"java", "kotlin", "python"};

        listView = findViewById(R.id.programmingListView);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, programmingLanguage);
        listView.setAdapter(arrayAdapter);
    }
}