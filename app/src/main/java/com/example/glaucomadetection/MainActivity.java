package com.example.glaucomadetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btSubmit;
    EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10;
    EditText et11,et12,et13,et14,et15,et16,et17,et18,et19,et20;
    EditText et31,et32,et33,et34,et35,et36,et37,et38,et39,et40;
    EditText et21,et22,et23,et24,et25,et26,et27,et28,et29,et30;
    EditText et41,et42,et43,et44,et45,et46,et47,et48,et49,et50;
    EditText et51,et52,et53,et54,et55,et56,et57,et58,et59,et60;
    EditText et61,et62,et63,et64,et65,et66,et67,et68,et69,et70;
    EditText et71,et72,et73,et74,et75,et76,et77,et78,et79,et80;
    EditText et81,et82,et83,et84,et85,et86,et87,et88,et89,et90;
    EditText et91,et92,et93,et94,et95,et96,et97,et98,et99,et100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSubmit = findViewById(R.id.btSubmit);
        btSubmit.setOnClickListener(this);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        et6 = findViewById(R.id.et6);
        et7 = findViewById(R.id.et7);
        et8 = findViewById(R.id.et8);
        et9 = findViewById(R.id.et9);
        et10 = findViewById(R.id.et10);
        et11 = findViewById(R.id.et11);
        et12 = findViewById(R.id.et12);
        et13 = findViewById(R.id.et13);
        et14 = findViewById(R.id.et14);
        et15 = findViewById(R.id.et15);
        et16 = findViewById(R.id.et16);
        et17 = findViewById(R.id.et17);
        et18 = findViewById(R.id.et18);
        et19 = findViewById(R.id.et19);
        et20 = findViewById(R.id.et20);
        et61 = findViewById(R.id.et61);
        et62 = findViewById(R.id.et62);
        et63 = findViewById(R.id.et63);
        et64 = findViewById(R.id.et64);
        et65 = findViewById(R.id.et65);
        et66 = findViewById(R.id.et66);
        et67 = findViewById(R.id.et67);
        et68 = findViewById(R.id.et68);
        et69 = findViewById(R.id.et69);
        et70 = findViewById(R.id.et70);
        et21 = findViewById(R.id.et21);
        et22 = findViewById(R.id.et22);
        et23 = findViewById(R.id.et23);
        et24 = findViewById(R.id.et24);
        et25 = findViewById(R.id.et25);
        et26 = findViewById(R.id.et26);
        et27 = findViewById(R.id.et27);
        et28 = findViewById(R.id.et28);
        et29 = findViewById(R.id.et29);
        et30 = findViewById(R.id.et30);
        et31 = findViewById(R.id.et31);
        et32 = findViewById(R.id.et32);
        et33 = findViewById(R.id.et33);
        et34 = findViewById(R.id.et34);
        et35 = findViewById(R.id.et35);
        et36 = findViewById(R.id.et36);
        et37 = findViewById(R.id.et37);
        et38 = findViewById(R.id.et38);
        et39 = findViewById(R.id.et39);
        et40 = findViewById(R.id.et40);
        et41 = findViewById(R.id.et41);
        et42 = findViewById(R.id.et42);
        et43 = findViewById(R.id.et43);
        et44 = findViewById(R.id.et44);
        et45 = findViewById(R.id.et45);
        et46 = findViewById(R.id.et46);
        et47 = findViewById(R.id.et47);
        et48 = findViewById(R.id.et48);
        et49 = findViewById(R.id.et49);
        et50 = findViewById(R.id.et50);
        et51 = findViewById(R.id.et51);
        et52 = findViewById(R.id.et52);
        et53 = findViewById(R.id.et53);
        et54 = findViewById(R.id.et54);
        et55 = findViewById(R.id.et55);
        et56 = findViewById(R.id.et56);
        et57 = findViewById(R.id.et57);
        et58 = findViewById(R.id.et58);
        et59 = findViewById(R.id.et59);
        et60 = findViewById(R.id.et60);
        et71 = findViewById(R.id.et71);
        et72 = findViewById(R.id.et72);
        et73 = findViewById(R.id.et73);
        et74 = findViewById(R.id.et74);
        et75 = findViewById(R.id.et75);
        et76 = findViewById(R.id.et76);
        et77 = findViewById(R.id.et77);
        et78 = findViewById(R.id.et78);
        et79 = findViewById(R.id.et79);
        et80 = findViewById(R.id.et80);
        et81 = findViewById(R.id.et81);
        et82 = findViewById(R.id.et82);
        et83 = findViewById(R.id.et83);
        et84 = findViewById(R.id.et84);
        et85 = findViewById(R.id.et85);
        et86 = findViewById(R.id.et86);
        et87 = findViewById(R.id.et87);
        et88 = findViewById(R.id.et88);
        et89 = findViewById(R.id.et89);
        et90 = findViewById(R.id.et90);
        et91 = findViewById(R.id.et91);
        et92 = findViewById(R.id.et92);
        et93 = findViewById(R.id.et93);
        et94 = findViewById(R.id.et94);
        et95 = findViewById(R.id.et95);
        et96 = findViewById(R.id.et96);
        et97 = findViewById(R.id.et97);
        et98 = findViewById(R.id.et98);
        et99 = findViewById(R.id.et99);
        et100 = findViewById(R.id.et100);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,ReportActivity.class);
        startActivity(intent);
    }
}