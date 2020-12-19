package com.jasjotsingh.solarpowerpredictor;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class LocationFragment extends DialogFragment implements View.OnClickListener {
    Button buttonSubmit;
    EditText etLocation1;
    EditText etLocation2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setCancelable(false);
        View v = inflater.inflate(R.layout.fragment_location, container, false);
        etLocation1 = v.findViewById(R.id.etLoc1);
        etLocation2 = v.findViewById(R.id.etLoc2);
        buttonSubmit = v.findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        CompareActivity compareActivity = (CompareActivity) getActivity();
        compareActivity.returnFromDialog(etLocation1.getText().toString(),etLocation2.getText().toString());
    }
}