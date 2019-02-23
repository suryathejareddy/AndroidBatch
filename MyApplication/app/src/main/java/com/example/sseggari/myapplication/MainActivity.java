package com.example.sseggari.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView t1,t2,t3,t4,t;
Button b1;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.textView);
        t4=(TextView)findViewById(R.id.dummy);
        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               t.setVisibility(View.GONE);
               t4.setVisibility(View.GONE);
               t1.setText("I");
               t2.setText("LOVE");
               t2.setBackgroundColor(getResources().getColor(R.color.white));
               t3.setText("INDIA");
               b1.setVisibility(View.GONE);
              s=t2.getText().toString();
              Intent i=new Intent(MainActivity.this,Main2Activity.class);
              i.putExtra("test",s);
              startActivity(i);
              //Toast.LENGTH_LONG=1000;
              Toast.makeText(MainActivity.this,"Going into Activity 2",Toast.LENGTH_LONG).show();
            }
        });

    }
}
