package com.example.ticketbook;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book extends AppCompatActivity {
    ProgressDialog progress;
EditText name,no,tic;
DatePicker d;
String s1,s2,s3,s4;
Button b;
int v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
       name=(EditText)findViewById(R.id.name);
        no=(EditText)findViewById(R.id.phone);
        d=(DatePicker)findViewById(R.id.d);
        tic=(EditText)findViewById(R.id.tk);
        b=(Button)findViewById(R.id.book);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=validate();
                if(v1==0)
                {
                    Toast.makeText(getApplicationContext(),"Please enter valid data.",Toast.LENGTH_SHORT).show();
                }
                else {
                    s1 = name.getText().toString();
                    s2 = no.getText().toString();
                    s3 = d.getDayOfMonth() + "-" + d.getMonth() + "-" + d.getYear();
                    s4 = tic.getText().toString();

                    Response.Listener<String> responseListener = new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            Log.e("entry", "onResponse: " + response, null);
                            try {
                                progress.hide();

                                JSONObject jsonResponse = new JSONObject(response);
                                boolean success = jsonResponse.getBoolean("success");
                                if (success) {
                                   Intent i4=new Intent(Book.this,Code.class);
                                    i4.putExtra("no",s2);
                                    i4.putExtra("date",s3);
                                   startActivity(i4);

                                } else {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Book.this);
                                    builder.setMessage("Failed")
                                            .setNegativeButton("Retry", null)
                                            .create()
                                            .show();

                                }

                            } catch (JSONException e) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Book.this);
                                builder.setMessage(e.getMessage().toString())
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        }
                    };
                    progress = new ProgressDialog(Book.this);
                    progress.setIndeterminate(true);
                    progress.setTitle("Validating");
                    progress.setMessage("Please wait...");
                    progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    progress.show();
                    Data d = new Data(s1, s2, s3, s4);
                    Entry registerRequest = new Entry(d, responseListener);
                    RequestQueue queue = Volley.newRequestQueue(Book.this);
                    queue.add(registerRequest);
                }
            }
        });
    }

    private int validate() {

        String MobilePattern = "[0-9]{10}";
        String t="[1-9]{1}";
        if (name.length() > 20) {
            name.setError("pls enter less the 20 character in user name");
            //Toast.makeText(getApplicationContext(), "pls enter less the 20 character in user name", Toast.LENGTH_SHORT).show();
            return 0;

        } else if (name.length() == 0 || no.length() == 0 || tic.length() == 0 ) {

            Toast.makeText(getApplicationContext(), "pls fill the empty fields", Toast.LENGTH_SHORT).show();
            return 0;

        }
        else if(!no.getText().toString().matches(MobilePattern)) {
            no.setError("Please enter valid 10 digit phone number");
            //Toast.makeText(getApplicationContext(), "Please enter valid 10 digit phone number", Toast.LENGTH_SHORT).show();
            return 0;
        }
        else if(!tic.getText().toString().matches(t)) {
            tic.setError("Please book 1 to 9 tickets.More than that is not allowed");
           // Toast.makeText(getApplicationContext(), "Please book 1 to 9 tickets.More than that is not allowed", Toast.LENGTH_SHORT).show();
            return 0;
        }
        return 1;
    }

}

