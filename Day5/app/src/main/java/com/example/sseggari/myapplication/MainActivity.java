package com.example.sseggari.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner s;
Switch sw;
TextView t;

String selected="",attendance="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
t=findViewById(R.id.textView5);
        ArrayAdapter<String>  ad=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.names));
       ArrayList<String> ar=new ArrayList<String>();
        for(int i=0;i<ad.getCount();i++)
        {
            ar.add(ad.getItem(i));
        }
        for (String c : ar)
        {

        }
        s=findViewById(R.id.spinner);
        s.setAdapter(ad);
        sw=findViewById(R.id.switch1);
       /* sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                selected= s.getSelectedItem().toString();
                if(isChecked)
                {
                   //selected= s.getSelectedItem().toString();
                    attendance="true";
                }
                else{
                    attendance="false";
                }
            }
        });*/

    }
    public void Eventchange(View v)
    {
        selected= s.getSelectedItem().toString();

        if(sw.isChecked())
        {
            attendance="present";
        }
        else
        {
            attendance="absent";
        }
        t.setText(selected+" is "+attendance);
    }

}
