package com.example.app1;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Entry extends StringRequest {
    private static final String URL="https://unsaturated-junctio.000webhostapp.com";
    private Map<String,String> params;
    public Entry( Data d,Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        params=new HashMap<>();
        params.put("name",d.name);
        params.put("dob",d.dob);
        params.put("age",d.age);
        params.put("gender",d.g);
        params.put("fname",d.fname);
        params.put("mname",d.mname);
        params.put("address",d.add);
        params.put("number",d.num);
        params.put("email",d.mail);
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }}
