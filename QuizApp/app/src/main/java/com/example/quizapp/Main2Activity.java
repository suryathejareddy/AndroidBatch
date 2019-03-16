package com.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.textView21);
        rg=findViewById(R.id.radioGroup2);
        rb1=findViewById(R.id.radioButton21);
        rb2=findViewById(R.id.radioButton22);
        rb3=findViewById(R.id.radioButton23);
        rb4=findViewById(R.id.radioButton24);
        button=findViewById(R.id.button2);
        Bundle b=getIntent().getExtras();
        int score =  b.get("score1");

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
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                i.putExtra("score2", score[0]);
                startActivity(i);
            }
        });
    }
}
