package com.example.glaucomadetection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {
    TextView tvPrevent,tvPreventText,tvTreat,tvTreattext;
    TextView tvPercent,tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        tvResult = findViewById(R.id.tvRes);
        tvPercent = findViewById(R.id.tvPercent);
        tvPrevent = findViewById(R.id.tvPrevent);
        tvPreventText = findViewById(R.id.tvPreventive);
        tvTreat = findViewById(R.id.tvTreatment);
        tvTreattext = findViewById(R.id.tvTreatments);

        int integer = Integer.parseInt(tvPercent.getText().toString());
        if(integer>50){
            tvTreattext.setVisibility(View.VISIBLE);
            tvTreat.setVisibility(View.VISIBLE);
            tvPrevent.setVisibility(View.GONE);
            tvPreventText.setVisibility(View.GONE);
        }else{
            tvTreattext.setVisibility(View.GONE);
            tvTreat.setVisibility(View.GONE);
            tvPrevent.setVisibility(View.VISIBLE);
            tvPreventText.setVisibility(View.VISIBLE);
        }
    }
}