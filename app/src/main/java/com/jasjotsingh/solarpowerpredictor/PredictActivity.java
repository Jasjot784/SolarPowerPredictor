package com.jasjotsingh.solarpowerpredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PredictActivity extends AppCompatActivity implements View.OnClickListener {
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
        etTemp = findViewById(R.id.etTemp);
        etHumid = findViewById(R.id.etHumid);
        etPressure = findViewById(R.id.etPressure);
        etCloudCover = findViewById(R.id.etCloudCover);
        etMediumCloud = findViewById(R.id.etMediumCloud);
        etShortWaveRadiation = findViewById(R.id.etShortWaveRadiation);
        etWindSpeed80 = findViewById(R.id.etWindSpeed80);
        etWindSpeed900 = findViewById(R.id.etWindSpeed900);
        etIncidence  = findViewById(R.id.etIncidence);
        etZenith = findViewById(R.id.etZenith);
        etAzimuth = findViewById(R.id.etAzimuth);
        mPredict = findViewById(R.id.buttonPredict);
    }
    public void listen(){
        mPredict.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etTemp.getText().toString())||TextUtils.isEmpty(etHumid.getText().toString())||TextUtils.isEmpty(etPressure.getText().toString())
                ||TextUtils.isEmpty(etCloudCover.getText().toString())||TextUtils.isEmpty(etMediumCloud.getText().toString())
                ||TextUtils.isEmpty(etShortWaveRadiation.getText().toString())||TextUtils.isEmpty(etWindSpeed80.getText().toString())
                ||TextUtils.isEmpty(etWindSpeed900.getText().toString())||TextUtils.isEmpty(etIncidence.getText().toString())
                ||TextUtils.isEmpty(etZenith.getText().toString())||TextUtils.isEmpty(etAzimuth.getText().toString())){
            Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show();
        }else {
            double x1 = Double.parseDouble(etTemp.getText().toString());
            double x2 = Double.parseDouble(etHumid.getText().toString());
            double x3 = Double.parseDouble(etPressure.getText().toString());
            double x4 = Double.parseDouble(etCloudCover.getText().toString());
            double x5 = Double.parseDouble(etMediumCloud.getText().toString());
            double x6 = Double.parseDouble(etShortWaveRadiation.getText().toString());
            double x7 = Double.parseDouble(etWindSpeed80.getText().toString());
            double x8 = Double.parseDouble(etWindSpeed900.getText().toString());
            double x9 = Double.parseDouble(etIncidence.getText().toString());
            double x10 = Double.parseDouble(etZenith.getText().toString());
            double x11 = Double.parseDouble(etAzimuth.getText().toString());

            double output = x1*(-71.55809914771926) + x2*(-92.29129573539598) + x3*(93.59251753639236) + x4*(-123.05013603060362) + x5*(-1.1303277779387917) + x6*(460.92036418652435) + x7*(287.3479513223634) +
                    x8*(-364.21916023882716) + x9*(-470.662259480019) + x10*(-35.549093753806346) + x11*(-445.66042963406807);
            Intent intent = new Intent(PredictActivity.this,PowerOutputActivity.class);
            intent.putExtra("output",output);
            startActivity(intent);

        }
    }
}