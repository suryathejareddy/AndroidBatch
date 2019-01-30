package com.android.neelima.neelu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {
ImageView i1,i2,i3,i4,i5,i6,i7,i8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        i1=(ImageView)findViewById(R.id.i1);

        i2=(ImageView)findViewById(R.id.i2);

        i3=(ImageView)findViewById(R.id.i3);

        i4=(ImageView)findViewById(R.id.i4);

        i5=(ImageView)findViewById(R.id.i5);

        i6=(ImageView)findViewById(R.id.i6);
        i7=(ImageView)findViewById(R.id.i7);

        i8=(ImageView)findViewById(R.id.i8);



    }
}
