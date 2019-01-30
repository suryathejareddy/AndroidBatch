package com.android.neelima.neelu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
ImageView i1,i;
TextView t;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        t=(TextView)findViewById(R.id.t) ;

        b=(Button)findViewById(R.id.b);
        i=(ImageView)findViewById(R.id.i) ;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main5Activity.this,Main6Activity.class);
                startActivity(i);
            }
        });


    }
}
