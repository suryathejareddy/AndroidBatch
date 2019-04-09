package cloneapps.androidcourse.stepinleads.jdbcapp;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {
    EditText e;
    Button b;
    String s;
    ProgressDialog progress;
    Connection con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.edt);
        b=findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e.getText().toString();
                CheckLogin checkLogin = new CheckLogin();// this is the Asynctask, which is used to process in background to reduce load on app process
                checkLogin.execute("");
                progress=new ProgressDialog(MainActivity.this);
                progress.setIndeterminate(true);
                progress.setTitle("Basic Registration");
                progress.setMessage("Please wait...");
                progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress.show();


            }
        });


    }
    public class CheckLogin extends AsyncTask<String,String,String>
    {
        String z = "";
        Boolean isSuccess = false;

        @Override
        protected void onPreExecute()

        {

        }

        @Override
        protected void onPostExecute(String r)
        {


            if(isSuccess)
            {
                progress.hide();


                //finish();
            }
        }
        @Override
        protected String doInBackground(String... params)
        {
            try
            {
                con = connectionclass();        // Connect to database
                if (con == null)
                {
                    z = "Check Your Internet Access!";
                }
                else
                {

                    String query = "insert into Testing(Name)" +
                            "values('"+s+"')";
                    PreparedStatement stmt = con.prepareStatement(query);
                    int rs = stmt.executeUpdate();
                    if(rs>0)
                    {
                        z = "Inserted";
                        isSuccess=true;
                        con.close();
                    }
                    else
                    {
                        z = "Not Inserted";
                        isSuccess = false;
                    }
                }
            }
            catch (Exception ex)
            {
                isSuccess = false;
                z = ex.getMessage();
                Log.e("sql msg",ex.getMessage());
            }

            return z;
        }
    }


    @SuppressLint("NewApi")
    public Connection connectionclass()
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;
        try
        {
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            ConnectionURL = "jdbc:jtds:sqlserver://sql7001.site4now.net;database=DB_A465EF_TelanganaSainik;user=DB_A465EF_TelanganaSainik_admin;password=Sairam@123";
            //ConnectionURL = "jdbc:jtds:sqlserver://sql7001.site4now.net;database=DB_A465EF_TelanganaSainik;user=DB_A465EF_TelanganaSainik_admin;password=Sairam@123";
//            ConnectionURL = "jdbc:jtds:sqlserver://192.168.1.9;database=msss;instance=SQLEXPRESS;Network Protocol=NamedPipes" ;


            connection = DriverManager.getConnection(ConnectionURL);
        }
        catch (SQLException se)
        {
            Log.e("error here 1 : ", se.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            Log.e("error here 2 : ", e.getMessage());
        }
        catch (Exception e)
        {
            Log.e("error here 3 : ", e.getMessage());
        }
        return connection;
    }
}

