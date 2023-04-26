package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class SecondActivity extends AppCompatActivity {


    private ImageButton rakButton;
    private ImageButton meduseButton;
    private ImageButton starButton;
    private ImageButton kitButton;
    private View.OnClickListener Listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rakButton = findViewById(R.id.rakButton);
        meduseButton = findViewById(R.id.meduseButton);
        starButton = findViewById(R.id.starButton);
        kitButton = findViewById(R.id.kitButton);


        rakButton.setOnClickListener(Listener);
        meduseButton.setOnClickListener(Listener);
        starButton.setOnClickListener(Listener);
        kitButton.setOnClickListener(Listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.rakButton:
                    Intent intent = new Intent(getApplicationContext(), ThreeActivity.class);
                    startActivity(intent);
                    break;
                case R.id.meduseButton:
                    Intent intent2 = new Intent(getApplicationContext(), FourActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.starButton:
                    Intent intent3 = new Intent(getApplicationContext(), FiveActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.kitButton:
                    Intent intent4 = new Intent(getApplicationContext(), SixActivity.class);
                    startActivity(intent4);
                    break;

            }

        }
    };
}
