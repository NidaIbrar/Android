package com.example.nidaawan.android_smester_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LOGIN extends AppCompatActivity {

    Database db;
    EditText TextV;
    String docname;
    Button btn;
    TextView Vi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent n =getIntent();
        Intent o =getIntent();

        db= new Database(this, "DAS.db", null, 1);
        TextV=(EditText) findViewById(R.id.editTxt_DocName);
       Vi=(TextView) findViewById(R.id.txtV_Result);

        btn=(Button) findViewById(R.id.btn_LOGin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                docname=TextV.getText().toString();
                String Fdocname=db.DOCTORS_LOGIN(docname);


               if(docname.equals(Fdocname)){
                   SharedPreferences sharepref= getSharedPreferences("LoginInfo",MODE_PRIVATE);
                   SharedPreferences.Editor editor=sharepref.edit();
                   editor.putString("Doc_Name",TextV.getText().toString());
                   editor.apply();
                   Toast.makeText(LOGIN.this, "You Are Sweetely Welcome!!!!",Toast.LENGTH_LONG).show();
                   Intent intent=new Intent(LOGIN.this, SP_Welcome.class);
                   startActivity(intent);
               }
                else{
                   Toast.makeText(LOGIN.this, "Not Welcome", Toast.LENGTH_SHORT).show();
               }

            }
        });



    }}
