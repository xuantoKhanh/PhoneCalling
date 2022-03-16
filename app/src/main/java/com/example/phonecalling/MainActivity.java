package com.example.phonecalling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get notification data info
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            //bundle must contain all info sent in "data" field of the notification
        }
    }
}