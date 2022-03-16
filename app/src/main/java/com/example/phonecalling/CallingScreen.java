package com.example.phonecalling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CallingScreen extends AppCompatActivity implements View.OnClickListener {

    private Button button1, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calling_screen);

        button1 = (Button) findViewById(R.id.buttonEndCall);
        button1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonEndCall:
                startActivity(new Intent(this, EndingCall.class));
                break;
        }
    }
}
