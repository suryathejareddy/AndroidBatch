package com.android.stepinleads.myapplication;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Entry extends StringRequest {
    private static final String URL="http://192.168.0.111/Tbl_BasicRegistration_Entry.php";
    private Map<String,String> params;
    public Entry( String s,Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        params=new HashMap<>();
        params.put("name",s);

    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }}
