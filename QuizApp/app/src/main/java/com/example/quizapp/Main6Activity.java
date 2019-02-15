package com.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        t1=findViewById(R.id.textView61);
        Bundle b=getIntent().getExtras();
        final int[] score = {(int) b.get("score5")};

        t1.setText("Score is "+score);
    }
}
