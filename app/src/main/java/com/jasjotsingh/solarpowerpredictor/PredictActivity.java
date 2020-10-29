package com.jasjotsingh.solarpowerpredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PredictActivity extends AppCompatActivity {
    EditText etTemp,etHumid,etPressure,etCloudCover,etMediumCloud,etShortWaveRadiation,etWindSpeed80,etWindSpeed900,etIncidence,etZenith,etAzimuth;
    Button mPredict;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predict);

        init();
        listen();
    }
    public void init(){

    }
    public void listen(){

    }
}