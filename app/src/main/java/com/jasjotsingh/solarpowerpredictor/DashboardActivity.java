package com.jasjotsingh.solarpowerpredictor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cardPredict,cardCompare,cardCall,card3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        init();
        listen();
    }

    public void listen(){
     cardPredict.setOnClickListener(this);
     card3.setOnClickListener(this);
     cardCall.setOnClickListener(this);
     cardCompare.setOnClickListener(this);
    }

    public void init(){
        cardPredict = findViewById(R.id.cardPredict);
        cardCompare = findViewById(R.id.cardCompare);
        cardCall = findViewById(R.id.cardCall);
        card3 = findViewById(R.id.card3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cardPredict:
                Intent intent = new Intent(DashboardActivity.this,PredictActivity.class);
                startActivity(intent);
                break;
            case R.id.cardCall:
                displayToast("You clicked call");
                break;
            case R.id.card3:
                displayToast("You clicked card3");
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