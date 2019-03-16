package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView t1;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        t1=findViewById(R.id.textView41);
        rg=findViewById(R.id.radioGroup4);
        rb1=findViewById(R.id.radioButton41);
        rb2=findViewById(R.id.radioButton42);
        rb3=findViewById(R.id.radioButton43);
        rb4=findViewById(R.id.radioButton44);
        button=findViewById(R.id.button4);
        Bundle b=getIntent().getExtras();
        final int[] score = {(int) b.get("score3")};

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(rb3.isSelected())
                {
                    score[0] = score[0] +1;
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                i.putExtra("score4", score[0]);
                startActivity(i);
            }
        });
    }
}
