package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText password = (EditText) findViewById(R.id.passwordText);
        EditText nameText = (EditText) findViewById(R.id.nameText);
        EditText nicnameText = (EditText) findViewById(R.id.nicknameText);
        EditText phonenumberText = (EditText) findViewById(R.id.phonenumberText);
        EditText emailText = (EditText) findViewById(R.id.emailText);

        Button registerButton = (Button) findViewById(R.id.registerButon);
    }
}
