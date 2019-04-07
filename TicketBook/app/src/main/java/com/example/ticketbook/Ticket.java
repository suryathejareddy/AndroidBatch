package com.example.ticketbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ticket extends AppCompatActivity {
TextView t1,t2,t3,t4,t5;
String s1,s2,s3,s4;
int s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        Bundle b=getIntent().getExtras();
        s1=b.getString("name").toString();
        s2=b.getString("phone").toString();
        s3=b.getString("date").toString();
        s4=b.getString("tic").toString();
        t1=(TextView)findViewById(R.id.nm);
        t2=(TextView)findViewById(R.id.pn);
        t3=(TextView)findViewById(R.id.dt);
        t4=(TextView)findViewById(R.id.tc);
        t5=(TextView)findViewById(R.id.amnt);
        t1.setText("Name: "+s1);
        t2.setText("Phone no: "+s2);
        t3.setText("Date: "+s3);
        t4.setText("Tickets: "+s4);
        s= Integer.parseInt(s4);
        t5.setText("Amount to be paid: Rs."+(s*100));

    }
}
