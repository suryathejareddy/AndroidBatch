package com.example.ticketbook;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class Code extends AppCompatActivity {
    Button g;
    String text2Qr,no,d;
ImageView imv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
        Bundle b=getIntent().getExtras();
        no=b.getString("no").toString();
        d=b.getString("date").toString();
        g=(Button)findViewById(R.id.g);
        imv=(ImageView)findViewById(R.id.imv);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2Qr = no+"/"+d;

                MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                try{
                    BitMatrix bitMatrix = multiFormatWriter.encode(text2Qr, BarcodeFormat.QR_CODE,200,200);
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                    imv.setImageBitmap(bitmap);
                    Toast.makeText(getApplicationContext(),"Take screenshot of this qrcode",Toast.LENGTH_LONG).show();
                }
                catch (WriterException e){
                    e.printStackTrace();
                }
            }

        });
        Toast.makeText(getApplicationContext(),"Use this code as ticket",Toast.LENGTH_LONG).show();
    }
}
