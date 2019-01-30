package com.android.neelima.neelu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
ImageView i1,i2,i3,i4,i5,i6,i7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i1=(ImageView)findViewById(R.id.i1);
        i1.setBackgroundResource(R.drawable.kiddo
        );
        i2=(ImageView)findViewById(R.id.i2);
        i2.setBackgroundResource(R.drawable.n2
        );
        i3=(ImageView)findViewById(R.id.i3);
        i3.setBackgroundResource(R.drawable.n3
        );
        i4=(ImageView)findViewById(R.id.i4);
        i4.setBackgroundResource(R.drawable.ne

        );
        i5=(ImageView)findViewById(R.id.i5);
        i5.setBackgroundResource(R.drawable.n5

        );
        i6=(ImageView)findViewById(R.id.i6);
        i6.setBackgroundResource(R.drawable.n6

        );i7=(ImageView)findViewById(R.id.i6);
        i7.setBackgroundResource(R.drawable.neelu1);

    }
}
