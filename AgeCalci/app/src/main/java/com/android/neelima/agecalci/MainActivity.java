package com.android.neelima.agecalci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6;
String s1,s2,s,s3,s4,s5,s6;
Button button;
int d, d1,d2,d3,d4,d5,d6,days,mnth,yr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);
        e5=(EditText)findViewById(R.id.e5);
        e6=(EditText)findViewById(R.id.e6);
         button=(Button)findViewById(R.id.button);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                 s3=e3.getText().toString();
                 s4=e4.getText().toString();
                 s5=e5.getText().toString();
                 s6=e6.getText().toString();
                 d1= Integer.parseInt(s1);
                 d2=Integer.parseInt(s2);
                 d3=Integer.parseInt(s3);
                 d4=Integer.parseInt(s4);
                 d5=Integer.parseInt(s5);
                 d6=Integer.parseInt(s6);
                //MainActivity m=new MainActivity();
                //s=m.sub(s1,s2);
                 if(d3>=d6) {
                     days = d3 - d6;
                     if (d2 >=d5) {
                         mnth = d2 - d5;
                         yr = d1 - d4;
                     }
                     else
                     {
                         mnth=d2+12-d5;
                         d1=d1-1;
                         yr=d1-d4;
                     }
                 }
                     else
                     {
                         days=d3+31-d6;
                         d2=d2-1;
                         if(d2>d5)
                         {
                             mnth=d2-d5;
                             yr=d1-d4;
                         }
                         else
                         {
                             mnth=d2+12-d5;
                             yr=d1-1-d4;
                         }
                     }

                 s=Integer.toString(yr)+"Years"+" "+Integer.toString(mnth)+"Months"+" "+Integer.toString(days)+"Days";
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                 i.putExtra("test",s);

                 startActivity(i);
                 e1.setText("");
                 e2.setText("");
                 e3.setText("");
                 e4.setText("");
                 e5.setText("");
                 e6.setText("");
             }
            /* public int sub(String a,String b)
             {
                 String c=b-a;
             }*/
         });
    }
}
