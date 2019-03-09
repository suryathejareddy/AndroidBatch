package com.android.neelima.regisetration;


import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Entry extends StringRequest {
    private static final String URL="https://neelimac.000webhostapp.com/reg.php";
    private Map<String,String> params;
    public Entry( Data d,Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        params=new HashMap<>();
        params.put("name",d.name);
        params.put("sname",d.n2);
        params.put("dob",d.n3);
        params.put("mno",d.n4);
        params.put("email",d.n5);
        params.put("addr",d.n6);

    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }}

