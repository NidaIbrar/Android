package com.example.nidaawan.android_smester_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button btn,btnn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       Button btn =(Button) findViewById(R.id.btn_SignUp);
        Button btnn =(Button) findViewById(R.id.btn_Login);
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
;}




}