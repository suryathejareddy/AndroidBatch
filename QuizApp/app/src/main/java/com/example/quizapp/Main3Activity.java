package com.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView t1;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1=findViewById(R.id.textView31);
        rg=findViewById(R.id.radioGroup3);
        rb1=findViewById(R.id.radioButton31);
        rb2=findViewById(R.id.radioButton32);
        rb3=findViewById(R.id.radioButton33);
        rb4=findViewById(R.id.radioButton34);
        button=findViewById(R.id.button3);
        Bundle b=getIntent().getExtras();
        final int[] score = {(int) b.get("score2")};

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(rb1.isSelected())
                {
                    score[0] = score[0] +1;
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main3Activity.this,Main4Activity.class);
                i.putExtra("score3", score[0]);
                startActivity(i);
            }
        });
    }
}
