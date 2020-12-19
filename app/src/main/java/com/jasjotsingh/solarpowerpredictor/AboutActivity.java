package com.jasjotsingh.solarpowerpredictor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;

import com.jasjotsingh.solarpowerpredictor.adapter.RecyclerAboutAdapter;
import com.jasjotsingh.solarpowerpredictor.data.About;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {
    private RecyclerView mRecycle;
    private ArrayList<About> mAboutArrayList;
    private RecyclerAboutAdapter mAdapter;
    String[] mTitle;
    String[] mInfo;
    String[] mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        recycle();
    }

    public void recycle(){
        mRecycle = findViewById(R.id.recyclerAbout);
        mAboutArrayList = new ArrayList<>();
        mAboutArrayList.clear();
        mTitle = getResources().getStringArray(R.array.title);
        mInfo = getResources().getStringArray(R.array.info);
        mEmail = getResources().getStringArray(R.array.email);
        TypedArray profileImages = getResources().obtainTypedArray(R.array.images);

        for (int i = 0;i<mTitle.length;++i){
            mAboutArrayList.add(new About(mTitle[i],mInfo[i],mEmail[i],profileImages.getResourceId(i,i)));
        }
        profileImages.recycle();
        mAdapter = new RecyclerAboutAdapter(this,mAboutArrayList);
        mRecycle.setAdapter(mAdapter);
    }
}