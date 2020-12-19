package com.jasjotsingh.solarpowerpredictor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CompareActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etTemp,etHumid,etPressure,etCloudCover,etMediumCloud,etShortWaveRadiation,etWindSpeed80,etWindSpeed900,etIncidence,etZenith,etAzimuth;
    EditText etTemp2,etHumid2,etPressure2,etCloudCover2,etMediumCloud2,etShortWaveRadiation2,etWindSpeed802,etWindSpeed9002,etIncidence2,etZenith2,etAzimuth2;
    DialogFragment dialogFragment =  new LocationFragment();
    String location1,location2;
    TextView tvLocation1,tvLocation2;
    Button buttonPredict;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);

        init();
        listen();


        dialogFragment.show(getSupportFragmentManager(),"location");
    }

    public void init(){
        tvLocation1 = findViewById(R.id.tvLoc1);
        tvLocation2 = findViewById(R.id.tvLoc2);
        buttonPredict = findViewById(R.id.buttonPredict);
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
        etTemp2 = findViewById(R.id.etTemp2);
        etHumid2 = findViewById(R.id.etHumid2);
        etPressure2 = findViewById(R.id.etPressure2);
        etCloudCover2 = findViewById(R.id.etCloudCover2);
        etMediumCloud2 = findViewById(R.id.etMediumCloud2);
        etShortWaveRadiation2 = findViewById(R.id.etShortWaveRadiation2);
        etWindSpeed802 = findViewById(R.id.etWindSpeed802);
        etWindSpeed9002 = findViewById(R.id.etWindSpeed9002);
        etIncidence2  = findViewById(R.id.etIncidence2);
        etZenith2 = findViewById(R.id.etZenith2);
        etAzimuth2 = findViewById(R.id.etAzimuth2);
    }

    public void listen(){
        buttonPredict.setOnClickListener(this);
    }

    public  void returnFromDialog(String loc1,String loc2){
        dialogFragment.dismiss();
        location1 = loc1;
        location2 = loc2;
        tvLocation1.setText(loc1);
        tvLocation2.setText(loc2);
        //displayToast(loc1);
    }
    public void displayToast(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etTemp.getText().toString())||TextUtils.isEmpty(etHumid.getText().toString())||TextUtils.isEmpty(etPressure.getText().toString())
                ||TextUtils.isEmpty(etCloudCover.getText().toString())||TextUtils.isEmpty(etMediumCloud.getText().toString())
                ||TextUtils.isEmpty(etShortWaveRadiation.getText().toString())||TextUtils.isEmpty(etWindSpeed80.getText().toString())
                ||TextUtils.isEmpty(etWindSpeed900.getText().toString())||TextUtils.isEmpty(etIncidence.getText().toString())
                ||TextUtils.isEmpty(etZenith.getText().toString())||TextUtils.isEmpty(etAzimuth.getText().toString())||
                TextUtils.isEmpty(etTemp2.getText().toString())||TextUtils.isEmpty(etHumid2.getText().toString())||TextUtils.isEmpty(etPressure2.getText().toString())
                ||TextUtils.isEmpty(etCloudCover2.getText().toString())||TextUtils.isEmpty(etMediumCloud2.getText().toString())
                ||TextUtils.isEmpty(etShortWaveRadiation2.getText().toString())||TextUtils.isEmpty(etWindSpeed802.getText().toString())
                ||TextUtils.isEmpty(etWindSpeed9002.getText().toString())||TextUtils.isEmpty(etIncidence2.getText().toString())
                ||TextUtils.isEmpty(etZenith2.getText().toString())||TextUtils.isEmpty(etAzimuth2.getText().toString())){
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

            double y1 = Double.parseDouble(etTemp2.getText().toString());
            double y2 = Double.parseDouble(etHumid2.getText().toString());
            double y3 = Double.parseDouble(etPressure2.getText().toString());
            double y4 = Double.parseDouble(etCloudCover2.getText().toString());
            double y5 = Double.parseDouble(etMediumCloud2.getText().toString());
            double y6 = Double.parseDouble(etShortWaveRadiation2.getText().toString());
            double y7 = Double.parseDouble(etWindSpeed802.getText().toString());
            double y8 = Double.parseDouble(etWindSpeed9002.getText().toString());
            double y9 = Double.parseDouble(etIncidence2.getText().toString());
            double y10 = Double.parseDouble(etZenith2.getText().toString());
            double y11 = Double.parseDouble(etAzimuth2.getText().toString());
            double output = x1*(-71.55809914771926) + x2*(-92.29129573539598) + x3*(93.59251753639236) + x4*(-123.05013603060362) + x5*(-1.1303277779387917) + x6*(460.92036418652435) + x7*(287.3479513223634) +
                    x8*(-364.21916023882716) + x9*(-470.662259480019) + x10*(-35.549093753806346) + x11*(-445.66042963406807);
            double output2 = y1*(-71.55809914771926) + y2*(-92.29129573539598) + y3*(93.59251753639236) + y4*(-123.05013603060362) + y5*(-1.1303277779387917) + y6*(460.92036418652435) + y7*(287.3479513223634) +
                    y8*(-364.21916023882716) + y9*(-470.662259480019) + y10*(-35.549093753806346) + y11*(-445.66042963406807);
            Intent intent = new Intent(CompareActivity.this,PowerOutputActivity.class);
            intent.putExtra("output",location1 +": " + output+"\n"+location2 +": " +output2);
            startActivity(intent);

        }
    }
}