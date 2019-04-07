package com.example.ticketbook;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Codecheck extends StringRequest {
    private static final String URL="http://proleptical-taps.000webhostapp.com/getdata.php";
    private Map<String,String> params;
    public Codecheck(String s1,String s2, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        params=new HashMap<>();
        params.put("a",s1);
        params.put("b",s2);
    }
    @Override
    public Map<String, String> getParams()
    {
        return params;
    }}