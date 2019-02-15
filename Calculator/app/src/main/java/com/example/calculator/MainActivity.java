package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    TextView t1;
    float a,b ,t;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b10=(Button)findViewById(R.id.b10);
        b11=(Button)findViewById(R.id.b11);
        b12=(Button)findViewById(R.id.b12);
        b13=(Button)findViewById(R.id.b13);
        b14=(Button)findViewById(R.id.b14);
        b15=(Button)findViewById(R.id.b15);
        b16=(Button)findViewById(R.id.b16);
        b17=(Button)findViewById(R.id.b17);
       t1=(EditText)findViewById(R.id.t);
        b1.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
               t1.setText(t1.getText()+"3");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"2");
             }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               t1.setText(t1.getText()+"1");
              }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"6");
              }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    t1.setText(t1.getText()+"5");
                }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               t1.setText(t1.getText()+"4");
               }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    t1.setText(t1.getText()+"9");
                }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"8");
               }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 t1.setText(t1.getText()+"7");
                }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 t1.setText(t1.getText()+"0");
               }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+".");
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {   //Add +
            @Override
            public void onClick(View v) {
               add = true;
                    a = Float.parseFloat(t1.getText()+"");
                    t1.setText(" ");
                }
        });
        b12.setOnClickListener(new View.OnClickListener() {   //Sub -
            @Override
            public void onClick(View v) {
                sub = true;
                a = Float.parseFloat(t1.getText()+"");
                t1.setText(" ");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {   //Mul *
            @Override
            public void onClick(View v) {
                mul = true;
                a = Float.parseFloat(t1.getText()+"");
                t1.setText(" ");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {   //Div /
            @Override
            public void onClick(View v) {
                div = true;
                a = Float.parseFloat(t1.getText()+"");
                t1.setText(" ");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+".");
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = Float.parseFloat(t1.getText()+"");
                if(add == true)
                {
                  t1.setText((a+b) +"");
                  add = false;
                }
                if(sub == true)
                {
                  t1.setText((a-b) +"");
                  sub = false;
                }
                if(mul == true)
                {
                  t1.setText((a*b) +"");
                  mul = false;
                }
                if(div == true)
                {
                  t1.setText((a/b) +"");
                  div = false;
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() { //clear
            @Override
            public void onClick(View v) {
               t1.setText("");
            }
        });

    }
}
