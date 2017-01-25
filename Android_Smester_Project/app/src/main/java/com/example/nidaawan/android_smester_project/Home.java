package com.example.nidaawan.android_smester_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button btn,btnn, btnl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       Button btn =(Button) findViewById(R.id.btn_SignUp);
        Button btnn =(Button) findViewById(R.id.btn_Login);
        btnl =(Button) findViewById(R.id.buttonl);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, Registration_Info.class);
                startActivity(intent);

            }
        });
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(Home.this, LOGIN.class);
                startActivity(m);

            }
        });
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp= getSharedPreferences("LogInfo",MODE_PRIVATE);
                SharedPreferences.Editor editor= sp.edit();
                editor.remove("Doc_Name");
                editor.apply();
                

            }
        });
;}




}