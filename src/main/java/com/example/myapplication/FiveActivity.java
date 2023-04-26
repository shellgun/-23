package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FiveActivity extends AppCompatActivity {
    private ListView listView2;
    private  String[]      echinoderms ={"морские звёзды","морские лилии","морские ежи ","офиуры"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        listView2=findViewById(R.id.listView2);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,echinoderms);
        listView2.setAdapter(adapter);

    }
}