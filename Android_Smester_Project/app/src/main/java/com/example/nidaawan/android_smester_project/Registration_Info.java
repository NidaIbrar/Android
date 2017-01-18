package com.example.nidaawan.android_smester_project;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration_Info extends AppCompatActivity {

    Database db;
    EditText E1,E2,E3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration__info);
        db= new Database(this, "DAS.db", null, 1);
        Intent j =getIntent();
        E1=(EditText) findViewById(R.id.editTxt_ClinicName);
        E2=(EditText) findViewById(R.id.editTxt_DoctorName);
        E3=(EditText) findViewById(R.id.editTxt_Address);
        Button btn1 =(Button) findViewById(R.id.btn_Save);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent k=new Intent(Registration_Info.this, Registration_Continue.class);
                startActivity(k);*/
                db.insert_DOCTORS_ACCOUNT(E1.getText().toString(),E2.getText().toString(),E3.getText().toString());;


                    Toast.makeText(Registration_Info.this,"Welcome", Toast.LENGTH_LONG).show();


            }
        });
    }
}
