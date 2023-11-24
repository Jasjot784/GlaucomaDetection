package com.example.glaucomadetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {
    Button btSubmit;
    EditText etName;
    EditText etAge;
    EditText etGender;
    String name,age,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        btSubmit = findViewById(R.id.btSubmit);
        btSubmit.setOnClickListener(this);
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etGender = findViewById(R.id.etGender);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(DetailsActivity.this,MainActivity.class);
        name = etName.getText().toString();
        age = etAge.getText().toString();
        gender = etGender.getText().toString();
        intent.putExtra("Name",name);
        intent.putExtra("Age",age);
        intent.putExtra("Gender",gender);
        startActivity(intent);
    }
}