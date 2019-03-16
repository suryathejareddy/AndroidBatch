package com.android.stepinleads.sqllitedatabase;

import android.content.ContentValues;
import android.database.Cursor;
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
EditText e1,e2;
String s="",s1="";
TextView t;
Button b;
String S;
//private static final String S;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=findViewById(R.id.ll1);
        l2=findViewById(R.id.ll2);
        e1=(EditText)findViewById(R.id.editText2);

        e2=(EditText)findViewById(R.id.editText21);
        b=findViewById(R.id.button);
        t=findViewById(R.id.tv1);
        s="hello";
        s1="hello";
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase mydatabase = openOrCreateDatabase("StepinLeads",MODE_PRIVATE,null);
                mydatabase.execSQL("CREATE TABLE IF NOT EXISTS Validation(Username TEXT,Password TEXT);");
               /* S="INSERT INTO Validation \n" +
                        "(Username,Password)\n" +
                        "VALUES \n" +
                        "(?, ?);";*/
                mydatabase.execSQL("INSERT INTO Validation Values('hello','hello');");
                /*ContentValues values = new ContentValues();
                values.put("Username", s);
                values.put("Password", s1);
                long newRowId = mydatabase.insert("Validation", null, values);*/
                Cursor resultSet = mydatabase.rawQuery("Select * from Validation",null);
                resultSet.moveToFirst();
                String username = resultSet.getString(0);
                String password = resultSet.getString(1);


                l1.setVisibility(View.GONE);
                l2.setVisibility(View.GONE);
                t.setVisibility(View.VISIBLE);

                t.setText("Username:"+username+"\nPassword:"+password);
            }
        });


    }
}
