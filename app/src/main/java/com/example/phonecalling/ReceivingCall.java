package com.example.phonecalling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ReceivingCall extends AppCompatActivity implements View.OnClickListener {

    private Button bt1, bt2, bt3;
    //text


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receiving_call);

        bt1 = (Button) findViewById(R.id.buttonReject);
        bt2 = (Button) findViewById(R.id.buttonAccept);
        bt3 = (Button) findViewById(R.id.buttonMessage);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonReject:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.buttonAccept:
                startActivity(new Intent(this, CallingScreen.class));
                break;
            case R.id.buttonMessage:
                startActivity(new Intent(this, MessageScreen.class));
                break;

        }
    }
}