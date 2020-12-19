package com.jasjotsingh.solarpowerpredictor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cardPredict,cardCompare,cardCall, cardShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        init();
        listen();
    }

    public void listen(){
     cardPredict.setOnClickListener(this);
     cardShare.setOnClickListener(this);
     cardCall.setOnClickListener(this);
     cardCompare.setOnClickListener(this);
    }

    public void init(){
        cardPredict = findViewById(R.id.cardPredict);
        cardCompare = findViewById(R.id.cardCompare);
        cardCall = findViewById(R.id.cardAbout);
        cardShare = findViewById(R.id.cardShare);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cardPredict:
                Intent intent = new Intent(DashboardActivity.this,PredictActivity.class);
                startActivity(intent);
                break;
            case R.id.cardAbout:
                Intent intentAbout = new Intent(DashboardActivity.this,AboutActivity.class);
                startActivity(intentAbout);
                break;
            case R.id.cardShare:
                displayToast("You clicked share");
                break;
            case R.id.cardCompare:
                displayToast("You clicked Compare");
                break;
        }
    }

    public void displayToast(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}