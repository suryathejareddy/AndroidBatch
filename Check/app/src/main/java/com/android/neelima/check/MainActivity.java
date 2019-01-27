package com.android.neelima.check;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    Button button;
    String s1,s,s2,s3;
    LinearLayout l1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);
        l1=(LinearLayout)findViewById(R.id.l1);
        button=(Button)findViewById(R.id.button);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
             s1=c1.getText().toString();
            // c1.setText("Blue");
                if(c1.isChecked() )
                {
                    l1.setBackgroundColor(getColor(R.color.blue));

             }
            else
                {
                    l1.setBackgroundColor(getColor(R.color.white));
                }
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                s2=c2.getText().toString();
               // c2.setText("Green");
                if(c2.isChecked())
                l1.setBackgroundColor(getColor(R.color.green));
             else
                {
                    l1.setBackgroundColor(getColor(R.color.white));
                }
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                s3=c3.getText().toString();
                //c3.setText("Yellow");
                if(c3.isChecked())
                l1.setBackgroundColor(getColor(R.color.yellow));
                else
                {
                    l1.setBackgroundColor(getColor(R.color.white));
                }

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=s1+"\n"+s2+"\n"+s3;
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("test",s);
                startActivity(i);
            }
        });
    }
}
