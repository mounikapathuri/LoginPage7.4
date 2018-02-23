package com.example.mounikapathuri.loginpage74;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mounikapathuri on 23-02-2018.
 */

class Username  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        Bundle extras = getIntent().getExtras();

        TextView text = (TextView) findViewById(R.id.username);
        String username = getIntent().getStringExtra("USERNAME");
        text.setText("Welcome " + username.toString());
    }
}