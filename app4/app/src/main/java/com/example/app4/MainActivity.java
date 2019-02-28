package com.example.app4;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.app4.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ProgressDialog progress;
    String s1,s2,s3,s4,s5,s6,s7,s8;
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    EditText e1,e2,e3,e4,e5,e6,e7;
    RadioButton r1,r2;
    Button b;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     t1=(TextView)findViewById(R.id.t1);
     t2=(TextView)findViewById(R.id.t2);
     t3=(TextView)findViewById(R.id.t3);
     t4=(TextView)findViewById(R.id.t4);
     t5=(TextView)findViewById(R.id.t5);
     t6=(TextView)findViewById(R.id.t6);
     t7=(TextView)findViewById(R.id.t7);
     t8=(TextView)findViewById(R.id.t8);
     e1=(EditText)findViewById(R.id.e1);
     e2=(EditText)findViewById(R.id.e2);
     e3=(EditText)findViewById(R.id.e3);
     e4=(EditText)findViewById(R.id.e4);
     e5=(EditText)findViewById(R.id.e5);
     e6=(EditText)findViewById(R.id.e6);
     e7=(EditText)findViewById(R.id.e7);
     r1=(RadioButton)findViewById(R.id.r1);
     r2=(RadioButton)findViewById(R.id.r2);
     b=(Button)findViewById(R.id.b);
     b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             s1=e1.getText().toString();
             s2=e2.getText().toString();
             s3=e3.getText().toString();
             s4=e4.getText().toString();
             s5=e5.getText().toString();
             s6=e6.getText().toString();
             s7=e7.getText().toString();
             if(r1.isChecked())
             {
              s8="Male";
             }
             if(r2.isChecked())
             {
              s8="Female";
             }

        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("entry", "onResponse: "+response, null);
                try {
                    progress.hide();

                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success = jsonResponse.getBoolean("success");
                    if (success) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Saved successfully")
                                .setNegativeButton("OK", null)
                                .create()
                                .show();

                    }

                    else{
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Failed")
                                .setNegativeButton("Retry", null)
                                .create()
                                .show();

                    }

                }

                catch (JSONException e) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage(e.getMessage().toString())
                            .setNegativeButton("Retry", null)
                            .create()
                            .show();
                }
            }
        };
        progress=new ProgressDialog(MainActivity.this);
        progress.setIndeterminate(true);
        progress.setTitle("Validating");
        progress.setMessage("Please wait...");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.show();
        Data d=new Data(s1,s2,s3,s4,s5,s6,s7,s8);
        Entry registerRequest=new Entry(d,responseListener);
        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
        queue.add(registerRequest);

         }
     });
    }
}
