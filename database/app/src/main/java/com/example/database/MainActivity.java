package com.example.database;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
LinearLayout l1,l2;
TextView t1,t2;
EditText e1,e2;
String s1,s2;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=findViewById(R.id.linlay1);
        l2=findViewById(R.id.linlay2);
        t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.textView2);
        e1=findViewById(R.id.editText1);
        e2=findViewById(R.id.editText2);
        s1=e1.getText().toString();
        s2=e2.getText().toString();
        b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                l1.setVisibility(View.GONE);
                l2.setVisibility(View.GONE);
                b.setVisibility(View.GONE);
                
            }
        });
    }
}
