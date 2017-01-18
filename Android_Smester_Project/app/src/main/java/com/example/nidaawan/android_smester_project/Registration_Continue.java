package com.example.nidaawan.android_smester_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Registration_Continue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration__continue);
        Intent l =getIntent();
           Button btn2=(Button) findViewById(R.id.btn_SaveRegistration);
           Spinner spn= (Spinner) findViewById(R.id.spinner);
           btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Registration_Continue.this, LOGIN.class);
                startActivity(k);

            }
        });
    }
}
