package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThreeActivity extends AppCompatActivity {

    private ListView listView;
    private  String[] arthropods={"Раки","Пауки ","клещи ","муравьи","пчёлы"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        listView= findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arthropods);
         listView.setAdapter(adapter);





    }
}