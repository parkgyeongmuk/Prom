package com.example.myapplication;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 조성민 on 2017-02-24.
 */



    public class ValidateRequest extends StringRequest {

        final static private String URL ="http://wnwjq9312.cafe24.com/Validate.php";
        private Map<String, String> parameters;

        public ValidateRequest(String userID,Response.Listener<String> listener) {
            super(Method.POST, URL, listener, null);
            parameters = new HashMap<>();
            parameters.put("userID", userID);


        }
        public Map<String, String> getParams() {
            return parameters;
        }
    }

