package com.example.sseggari.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox c;
    TextView t;
    LinearLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.linearlayout);
        t=findViewById(R.id.textview);
        c=findViewById(R.id.checkBox);
        c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                t.setTextColor(getColor(R.color.colorPrimaryDark));
                t.setTextSize(20);
                t.setBackgroundColor(getColor(R.color.colorPrimary));
                t.setText( c.getText().toString());
                l.setBackgroundColor(getColor(R.color.colorPrimaryDark));
            }
        });

    }
}
