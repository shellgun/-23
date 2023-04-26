package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SixActivity extends AppCompatActivity {
    private ListView listView3;

    private  String[] chordal = {"миноги " ,"амфибии","рептилии","рыбы"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        listView3=findViewById(R.id.listView3);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,chordal);
        listView3.setAdapter(adapter);
    }
}