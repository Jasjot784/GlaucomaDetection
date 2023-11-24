package com.example.glaucomadetection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ReportActivity extends AppCompatActivity {
    TextView tvPrevent,tvPreventText,tvTreat,tvTreattext;
    TextView tvAge,tvName,tvGender;
    TextView tvPercent,tvResult;
    String name,age,gender;
    @SuppressLint("DefaultLocale")
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
        tvName = findViewById(R.id.tvName);
        tvGender = findViewById(R.id.tvGender);
        tvAge = findViewById(R.id.tvAge);

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

        name = getIntent().getStringExtra("Name");
        age = getIntent().getStringExtra("Age");
        gender = getIntent().getStringExtra("Gender");
        tvName.setText(name);
        tvAge.setText(age);
        tvGender.setText(gender);
        Double ans = getIntent().getDoubleExtra("Severity",60.000);
//        String a = Double.toString(ans);
        String a = String.format("%.2f", ans);
        tvPercent.setText(a);

        if(ans>50.00){
            tvTreattext.setVisibility(View.VISIBLE);
            tvTreat.setVisibility(View.VISIBLE);
            tvPrevent.setVisibility(View.GONE);
            tvPreventText.setVisibility(View.GONE);
            tvResult.setTextColor(getResources().getColor(R.color.red));
            tvResult.setText("Positive");
        }else{
            tvTreattext.setVisibility(View.GONE);
            tvTreat.setVisibility(View.GONE);
            tvPrevent.setVisibility(View.VISIBLE);
            tvPreventText.setVisibility(View.VISIBLE);
            tvResult.setTextColor(getResources().getColor(R.color.green));
            tvResult.setText("Negative");
        }

//        Toast.makeText(this, name+age+gender, Toast.LENGTH_SHORT).show();
    }
}