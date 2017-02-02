package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText password = (EditText) findViewById(R.id.passwordText);


        Button loginButton = (Button) findViewById(R.id.loginbutton);
        TextView registerButton = (TextView) findViewById(R.id.registerButon);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(Login1.this, RegisterActivity.class);
                Login1.this.startActivity(registerIntent);
            }
        });

    }
}
