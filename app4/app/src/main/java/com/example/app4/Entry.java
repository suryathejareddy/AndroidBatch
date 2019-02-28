package com.example.app4;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Entry extends StringRequest {
    private static final String URL="https://proleptical-taps.000webhostapp.com/app4.php";
    private Map<String,String> params;
    public Entry(Data d, Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        params=new HashMap<>();
     params.put("a",d.first);
     params.put("b",d.last);
     params.put("c",(d.date));
     params.put("d",d.fname);
     params.put("e",d.mid);
     params.put("f",d.phone);
     params.put("g",d.address);
     params.put("h",d.gender);
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }}
