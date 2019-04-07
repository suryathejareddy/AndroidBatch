package com.example.ticketbook;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Entry extends StringRequest {
    private static final String URL="http://proleptical-taps.000webhostapp.com/register.php";
    private Map<String,String> params;
    public Entry(Data d, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        params=new HashMap<>();
     params.put("a",d.name);
     params.put("b",d.pno);
     params.put("c",(d.d));
     params.put("d",d.tic);
    }
    @Override
    public Map<String, String> getParams()
    {
        return params;
    }}
