package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FourActivity extends AppCompatActivity {
    private ListView listView1;
    private  String[] meduse={"медузы","полипы"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        listView1= findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,meduse);
        listView1.setAdapter(adapter);

    }
}