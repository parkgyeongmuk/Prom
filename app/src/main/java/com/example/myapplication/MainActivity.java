package com.example.myapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button managementButton = (Button) findViewById(R.id.managementbButton);
        Button UsermanagementButton = (Button) findViewById(R.id.UsermanagementButton);
        Intent intent = getIntent();


        String userID = intent.getStringExtra("userID");


        if (!userID.equals("joseongmin"))
        {
            UsermanagementButton.setVisibility(View.GONE);
        }

        managementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Backgroundfask().execute();
            }
        });


    }

        class Backgroundfask extends  AsyncTask<Void, Void, String>
        {
            String target;

            @Override
            protected void onPreExecute() {
                target ="http://wnwjq9312.cafe24.com/List.php";

            }
            @Override
            protected String doInBackground(Void... voids) {
                try {
                    URL url = new URL(target);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    String temp;
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((temp = bufferedReader.readLine()) != null)
                    {
                        stringBuilder.append(temp+"\n");
                    }
                    bufferedReader.close();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    return  stringBuilder.toString().trim();
                } catch (Exception e) {
                    e.printStackTrace();
            }
                return null;
        }

            @Override
            protected  void onProgressUpdate(Void... values) {
                super.onProgressUpdate(values);
            }

            @Override
            public void onPostExecute(String result) {
                Intent intent = new Intent(MainActivity.this, ManagementActivity.class);
                intent.putExtra("userList", result);
                MainActivity.this.startActivity(intent);
            }
        }

}
