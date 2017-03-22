package com.example.myapplication;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 조성민 on 2017-02-21.
 */

public class RegisterRequest extends StringRequest {

    final static private String URL ="http://wnwjq9312.cafe24.com/Register.php";
    private Map<String, String> parameters;

    public RegisterRequest(String userID, String userPassword, String userName, String userMail /*int userAge*/, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userName", userName);
        parameters.put("userMail", userMail);

    }
    public Map<String, String> getParams() {
        return parameters;
    }
}
