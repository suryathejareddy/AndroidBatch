package com.android.neelima.rest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle bundle=getIntent().getExtras();

        String s=bundle.get("test").toString();
        t=findViewById(R.id.t);
        t.setText(s);
    }
}
