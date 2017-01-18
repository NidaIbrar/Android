package com.example.nidaawan.android_smester_project;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LOGIN extends AppCompatActivity {

    Database db;
    EditText TextV;
    String docname;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent n =getIntent();
        Intent o =getIntent();

        db= new Database(this, "DAS.db", null, 1);
        TextV=(EditText) findViewById(R.id.editTxt_DoctorName);

        btn=(Button) findViewById(R.id.btn_LOGin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                docname=TextV.getText().toString();
                Cursor cursor=db.DOCTORS_LOGIN(docname);
                if(cursor.getCount()!=0){
                    Toast.makeText(LOGIN.this,"Welcome", Toast.LENGTH_LONG).show();
                }
                if(cursor.getCount()==0){
                    Toast.makeText(LOGIN.this,"Not Welcome", Toast.LENGTH_LONG).show();
                }
            }
        });



    }}
