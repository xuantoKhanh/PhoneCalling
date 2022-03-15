package com.example.phonecalling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ReceivingCall extends AppCompatActivity implements View.OnClickListener {

    private Button bt1, bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receiving_call);

        bt1 = (Button) findViewById(R.id.button1);
        bt1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(this, MainActivity.class));
                break;

        }
    }
}