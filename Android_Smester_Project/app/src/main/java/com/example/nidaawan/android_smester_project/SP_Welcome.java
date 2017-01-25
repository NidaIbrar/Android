package com.example.nidaawan.android_smester_project;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SP_Welcome extends AppCompatActivity {
TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp__welcome);
        SharedPreferences shrdprf=getSharedPreferences("LoginInfo", Context.MODE_PRIVATE);

        String name=shrdprf.getString("Doc_Name","Got Nothing");
        v=(TextView) findViewById(R.id.textView_Result);
        v.setText("WELCOME DR."+name);


    }
}
