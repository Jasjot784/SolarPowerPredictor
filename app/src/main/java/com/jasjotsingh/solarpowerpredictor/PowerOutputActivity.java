package com.jasjotsingh.solarpowerpredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PowerOutputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_output);
        //Toast.makeText(this, Double.toString(getIntent().getExtras().getDouble("output")), Toast.LENGTH_SHORT).show();
        TextView tvoutput = findViewById(R.id.tvOutput);
        tvoutput.setText(Double.toString(getIntent().getExtras().getDouble("output")));
    }
}