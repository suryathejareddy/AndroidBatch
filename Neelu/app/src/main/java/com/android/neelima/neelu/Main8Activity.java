package com.android.neelima.neelu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity {
    TextView t;
    ImageView i;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        t=(TextView)findViewById(R.id.t) ;

        b=(Button)findViewById(R.id.b);
        i=(ImageView)findViewById(R.id.i) ;
    }
}
