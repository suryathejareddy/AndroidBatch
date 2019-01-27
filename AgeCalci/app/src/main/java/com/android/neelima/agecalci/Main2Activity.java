package com.android.neelima.agecalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView t;
    CheckBox c;
    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle=getIntent().getExtras();

        String s=bundle.get("test").toString();
        t=findViewById(R.id.t);
        t.setText(s);
        //Toast.makeText(Main2Activity.this,"going to next page",Toast.LENGTH_LONG).show();

        }
    }

