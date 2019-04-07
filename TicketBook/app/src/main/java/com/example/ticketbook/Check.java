package com.example.ticketbook;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

public class Check extends AppCompatActivity {
    private Button scan_btn;
    ProgressDialog progress1;
    String dr,no,d,s,n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        scan_btn = (Button) findViewById(R.id.scan_btn);
        final Activity activity = this;
        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setPrompt("Scan");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
            if(result.getContents()==null){
                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();
            }
            else {
              //  Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                s=result.getContents();
                no=s.substring(0,10);
                d=s.substring(11);
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("entry", "onResponse: " + response, null);
                        try {
                            progress1.hide();

                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                               n=jsonResponse.getString("Name");
                               dr=jsonResponse.getString("Tickets");
                               Intent i5=new Intent(Check.this,Ticket.class);
                                i5.putExtra("name",n);
                                i5.putExtra("phone",no);
                                i5.putExtra("date",d);
                                i5.putExtra("tic",dr);
                                startActivity(i5);
                               //Toast.makeText(getApplicationContext(),n+"//"+no+"//"+d+"//"+dr,Toast.LENGTH_LONG).show();
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Check.this);
                                builder.setMessage("Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }

                        } catch (JSONException e) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(Check.this);
                            builder.setMessage(e.getMessage().toString())
                                    .setNegativeButton("Retry", null)
                                    .create()
                                    .show();
                        }
                    }
                };
                progress1 = new ProgressDialog(Check.this);
                progress1.setIndeterminate(true);
                progress1.setTitle("Validating");
                progress1.setMessage("Please wait...");
                progress1.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress1.show();
                Codecheck registerRequest = new Codecheck(no,d,responseListener);
                RequestQueue queue1 = Volley.newRequestQueue(Check.this);
                queue1.add(registerRequest);


            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
