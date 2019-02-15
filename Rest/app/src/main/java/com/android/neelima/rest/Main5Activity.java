package com.android.neelima.rest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    TextView t4,t5,t6,p4,p5,p6;
    Button bd4,bd5,bd6,bi4,bi5,bi6,b;
    int count3=0,count4=0,count5=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        t4 =(TextView) findViewById(R.id.t4);
        bi4= (Button) findViewById(R.id.bi4);
        bd4= (Button) findViewById(R.id.bd4);
        t5 =(TextView) findViewById(R.id.t5);
        bi5= (Button) findViewById(R.id.bi5);
        bd5= (Button) findViewById(R.id.bd5);
        t6 =(TextView) findViewById(R.id.t6);
        bi6= (Button) findViewById(R.id.bi6);
        bd6= (Button) findViewById(R.id.bd6);
        p4=(TextView)findViewById(R.id.p4);
        p5=(TextView)findViewById(R.id.p5);
        p6=(TextView)findViewById(R.id.p6);
        b=(Button)findViewById(R.id.b);
        bd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3--;

                t4.setText(String.valueOf(count3));


            }
        });
        bi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3++;

                t4.setText(String.valueOf(count3));
                // s=s+count;

            }
        });
        bd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count4--;

                t5.setText(String.valueOf(count4));


            }
        });
        bi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count4++;

                t5.setText(String.valueOf(count4));
                // s=s+count;

            }
        });
        bd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count5--;

                t6.setText(String.valueOf(count5));


            }
        });
        bi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count5++;

                t6.setText(String.valueOf(count5));
                // s=s+count;

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int sum=10;
               // int sum=((Integer.parseInt(t4.getText().toString()))*(Integer.parseInt(p4.getText().toString())));
                int sum=(((Integer.parseInt(t4.getText().toString())*(Integer.parseInt(p4.getText().toString()))))+((Integer.parseInt(t5.getText().toString())*(Integer.parseInt(p5.getText().toString()))))+((Integer.parseInt(t6.getText().toString())*(Integer.parseInt(p6.getText().toString())))));
                Intent i=new Intent(Main5Activity.this,Main3Activity.class);
                i.putExtra("test",sum);
                startActivity(i);
            }
        });

    }
}
