package com.example.sseggari.day7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
SeekBar s;
Button b;
RatingBar r;
TimePicker t;
DatePicker d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.seekBar);
        b=findViewById(R.id.btn);
        r=findViewById(R.id.ratingBar);
        d=findViewById(R.id.date);
t=findViewById(R.id.time);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object o=r.getRating();
                String s=o.toString();

                StringBuilder builder=new StringBuilder();;
                builder.append((    d.getMonth() + 1)+"/");//month is 0 based
                builder.append(d.getDayOfMonth()+"/");
                builder.append(d.getYear());
                String currentTime="Current Time: "+t.getCurrentHour()+":"+t.getCurrentMinute();
                Toast.makeText(MainActivity.this,"On "+builder+"at"+currentTime+" has "+s+" rating",Toast.LENGTH_LONG).show();
            }
        });
        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this,"Progrees bar changed",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
Toast.makeText(MainActivity.this,"StartTrackingTouch",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
Toast.makeText(MainActivity.this,"StopTrackingTouch",Toast.LENGTH_LONG).show();
            }
        });

    }
}
