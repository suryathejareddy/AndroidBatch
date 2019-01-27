package com.example.sseggari.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // Bundle b=getIntent().getExtras();
      //  String s=b.get("test").toString();
        t=findViewById(R.id.textView4);
       // t.setText(s);
    }
}
