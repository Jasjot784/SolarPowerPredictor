package com.jasjotsingh.solarpowerpredictor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CompareActivity extends AppCompatActivity implements View.OnClickListener {
    DialogFragment dialogFragment =  new LocationFragment();
    String location1,location2;
    TextView tvLocation1,tvLocation2;
    Button buttonPredict;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);

        tvLocation1 = findViewById(R.id.tvLoc1);
        tvLocation2 = findViewById(R.id.tvLoc2);
        buttonPredict = findViewById(R.id.buttonPredict);
        buttonPredict.setOnClickListener(this);
        dialogFragment.show(getSupportFragmentManager(),"location");
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

    }
}