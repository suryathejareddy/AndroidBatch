package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView t1;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        t1=findViewById(R.id.textView51);
        rg=findViewById(R.id.radioGroup5);
        rb1=findViewById(R.id.radioButton51);
        rb2=findViewById(R.id.radioButton52);
        rb3=findViewById(R.id.radioButton53);
        rb4=findViewById(R.id.radioButton54);
        button=findViewById(R.id.button5);
        Bundle b=getIntent().getExtras();
        final int[] score = {(int) b.get("score4")};

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
                Intent i=new Intent(Main5Activity.this,Main6Activity.class);
                i.putExtra("score4", score[0]);
                startActivity(i);
            }
        });
    }
}
