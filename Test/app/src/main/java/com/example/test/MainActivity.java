package com.example.test;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
     CheckBox r1,b1,g1;
     LinearLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(LinearLayout)findViewById(R.id.L);
        r1=(CheckBox)findViewById(R.id.R);
        g1=(CheckBox)findViewById(R.id.G);
        b1=(CheckBox)findViewById(R.id.B);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(r1.isChecked()) {
                    l.setBackgroundColor(getResources().getColor(R.color.red));
                }
                else
                    l.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });
        g1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(g1.isChecked()) {
                    l.setBackgroundColor(getResources().getColor(R.color.green));
                }
                else
                    l.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });
        b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b1.isChecked()) {
                    l.setBackgroundColor(getResources().getColor(R.color.blue));
                }
                else
                    l.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });
    }
}
