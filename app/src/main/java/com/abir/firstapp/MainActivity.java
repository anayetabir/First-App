package com.abir.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton;
        TextView tvDisplay;

        myButton = findViewById(R.id.myButton);
        tvDisplay = findViewById(R.id.tvDisplay);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvDisplay.setText("Thank you come back soon");
            }
        });

    }
}