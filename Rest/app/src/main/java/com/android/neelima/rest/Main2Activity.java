package com.android.neelima.rest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    TextView p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    Button bi1,bd1,b,bi2,bi3,bi4,bi5,bi6,bi7,bi8,bi9,bi10,bd2,bd3,bd4,bd5,bd6,bd7,bd8,bd9,bd10;
    String s;
    int count=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        p1=(TextView)findViewById(R.id.p1);
        p2=(TextView)findViewById(R.id.p2);
        p3=(TextView)findViewById(R.id.p3);
        p4=(TextView)findViewById(R.id.p4);
        p5=(TextView)findViewById(R.id.p5);
        p6=(TextView)findViewById(R.id.p6);
        p7=(TextView)findViewById(R.id.p7);
        p8=(TextView)findViewById(R.id.p8);
        p9=(TextView)findViewById(R.id.p9);
        p10=(TextView)findViewById(R.id.p10);
        t1 =(TextView) findViewById(R.id.t1);
        bi1= (Button) findViewById(R.id.bi1);
        bd1= (Button) findViewById(R.id.bd1);
        t2 =(TextView) findViewById(R.id.t2);
        bi2= (Button) findViewById(R.id.bi2);
        bd2= (Button) findViewById(R.id.bd2);
        t3 =(TextView) findViewById(R.id.t3);
        bi3= (Button) findViewById(R.id.bi3);
        bd3= (Button) findViewById(R.id.bd3);
        t4 =(TextView) findViewById(R.id.t4);
        bi4= (Button) findViewById(R.id.bi4);
        bd4= (Button) findViewById(R.id.bd4);
        t5 =(TextView) findViewById(R.id.t5);
        bi5= (Button) findViewById(R.id.bi5);
        bd5= (Button) findViewById(R.id.bd5);
        t6 =(TextView) findViewById(R.id.t6);
        bi6= (Button) findViewById(R.id.bi6);
        bd6= (Button) findViewById(R.id.bd6);
        t7 =(TextView) findViewById(R.id.t7);
        bi7= (Button) findViewById(R.id.bi7);
        bd7= (Button) findViewById(R.id.bd7);
        t8=(TextView) findViewById(R.id.t8);
        bi8= (Button) findViewById(R.id.bi8);
        bd8= (Button) findViewById(R.id.bd8);
        t9=(TextView) findViewById(R.id.t9);
        bi9= (Button) findViewById(R.id.bi9);
        bd9= (Button) findViewById(R.id.bd9);
        t10 =(TextView) findViewById(R.id.t10);
        bi10= (Button) findViewById(R.id.bi10);
        bd10= (Button) findViewById(R.id.bd10);
        b=(Button)findViewById(R.id.b);
        sw=(Switch)findViewById(R.id.sw);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Intent i=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(i);
                // do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
/*
        if(sw.isChecked())
        {

        }
*/



        bd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;

                t1.setText(String.valueOf(count));


            }
        });
        bi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                t1.setText(String.valueOf(count));
                // s=s+count;

            }
        });
        bd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1--;

                t2.setText(String.valueOf(count1));


            }
        });
        bi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;

                t2.setText(String.valueOf(count1));
                // s=s+count;

            }
        });
        bd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2--;

                t3.setText(String.valueOf(count2));


            }
        });
        bi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2++;

                t3.setText(String.valueOf(count2));
                // s=s+count;

            }
        });
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
        bd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count6--;

                t7.setText(String.valueOf(count6));


            }
        });
        bi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count6++;

                t7.setText(String.valueOf(count6));
                // s=s+count;

            }
        });
        bd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count7--;

                t8.setText(String.valueOf(count7));


            }
        });
        bi8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count7++;

                t8.setText(String.valueOf(count7));
                // s=s+count;

            }
        });
        bd9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count8--;

                t9.setText(String.valueOf(count8));


            }
        });
        bi9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count8++;

                t9.setText(String.valueOf(count8));
                // s=s+count;

            }
        });
        bd10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count9--;

                t10.setText(String.valueOf(count9));


            }
        });
        bi10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count9++;

                t10.setText(String.valueOf(count9));
                // s=s+count;

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              // int sum=((Integer.parseInt(t1.getText().toString()))*(Integer.parseInt(p1.getText().toString())))+((Integer.parseInt(t2.getText().toString()))*(Integer.parseInt(p2.getText().toString())))+((Integer.parseInt(t3.getText().toString())*(Integer.parseInt(p3.getText().toString())))+(Integer.parseInt(t4.getText().toString())*(Integer.parseInt(p4.getText().toString())))+(Integer.parseInt(t5.getText().toString())*(Integer.parseInt(p5.getText().toString())))+(Integer.parseInt(t6.getText().toString())*(Integer.parseInt(p6.getText().toString())))+(Integer.parseInt(t7.getText().toString())*(Integer.parseInt(p7.getText().toString())))+(Integer.parseInt(t8.getText().toString())*(Integer.parseInt(p8.getText().toString())))+(Integer.parseInt(t9.getText().toString())*(Integer.parseInt(p9.getText().toString())))+(Integer.parseInt(t10.getText().toString())*(Integer.parseInt(p10.getText().toString()))));
               // int sum=(((Integer.parseInt(t1.getText().toString())*(Integer.parseInt(p1.getText().toString()))))+((Integer.parseInt(t2.getText().toString())*(Integer.parseInt(p2.getText().toString()))))+((Integer.parseInt(t3.getText().toString())*(Integer.parseInt(p3.getText().toString()))))+((Integer.parseInt(t4.getText().toString())*(Integer.parseInt(p4.getText().toString()))))+((Integer.parseInt(t5.getText().toString())*(Integer.parseInt(p5.getText().toString()))))+((Integer.parseInt(t6.getText().toString())*(Integer.parseInt(p6.getText().toString()))))+((Integer.parseInt(t7.getText().toString())*(Integer.parseInt(p7.getText().toString()))))+((Integer.parseInt(t8.getText().toString())*(Integer.parseInt(p8.getText().toString()))))+((Integer.parseInt(t9.getText().toString())*(Integer.parseInt(p9.getText().toString()))))+((Integer.parseInt(t10.getText().toString())*(Integer.parseInt(p10.getText().toString())))));
                int sum=(((Integer.parseInt(t1.getText().toString())*(Integer.parseInt(p1.getText().toString()))))+((Integer.parseInt(t2.getText().toString())*(Integer.parseInt(p2.getText().toString()))))+((Integer.parseInt(t3.getText().toString())*(Integer.parseInt(p3.getText().toString()))))+((Integer.parseInt(t4.getText().toString())*(Integer.parseInt(p4.getText().toString()))))+((Integer.parseInt(t5.getText().toString())*(Integer.parseInt(p5.getText().toString()))))+((Integer.parseInt(t6.getText().toString())*(Integer.parseInt(p6.getText().toString()))))+((Integer.parseInt(t7.getText().toString())*(Integer.parseInt(p7.getText().toString()))))+((Integer.parseInt(t8.getText().toString())*(Integer.parseInt(p8.getText().toString()))))+((Integer.parseInt(t9.getText().toString())*(Integer.parseInt(p9.getText().toString()))))+((Integer.parseInt(t10.getText().toString())*(Integer.parseInt(p10.getText().toString())))));
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                i.putExtra("test",sum);
                startActivity(i);
            }
        });


    }
}
