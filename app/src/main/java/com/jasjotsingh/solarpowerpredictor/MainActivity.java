package com.jasjotsingh.solarpowerpredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import me.wangyuwei.particleview.ParticleView;

public class MainActivity extends AppCompatActivity implements ParticleView.ParticleAnimListener {
    ParticleView mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        init();
        animate();
        listen();
    }

    public void listen(){
        mView.setOnParticleAnimListener(this);
    }

    public void init(){
        mView = findViewById(R.id.pv_1);
    }

    public void animate(){
        mView.startAnim();
    }

    @Override
    public void onAnimationEnd() {
        Intent intent = new Intent(this,DashboardActivity.class);
        startActivity(intent);
        finish();
    }
}