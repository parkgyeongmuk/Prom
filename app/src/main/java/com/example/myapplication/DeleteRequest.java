package com.example.myapplication;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.RequestFuture;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 조성민 on 2017-03-21.
 */

public class DeleteRequest extends StringRequest {

    final  static private String URL ="http://wnwjq9312.cafe24.com/Delete.php";
    private Map<String, String> paramters;

    public  DeleteRequest(String userID, Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        paramters = new HashMap<>();
        paramters.put("userID", userID);
    }

    @Override
    public Map<String, String> getParams() {
        return  paramters;

    }


}