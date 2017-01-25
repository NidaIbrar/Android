package com.example.nidaawan.android_smester_project;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WelcomPage extends AppCompatActivity {
EditText e3, e4;
    Button b3 ,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom_page);

        e3=(EditText) findViewById(R.id.editTextName) ;
        e4=(EditText) findViewById(R.id.editTextPassword) ;
        b3=(Button) findViewById(R.id.btn_Save) ;
        b4=(Button) findViewById(R.id.btn_LogIn1) ;
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveinfo(v);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences shrdprf=getSharedPreferences("LoginInfo", Context.MODE_PRIVATE);

                String name=shrdprf.getString("User_Name","  ");
                String passs=shrdprf.getString("Password"," ");
                Intent intent= new Intent(WelcomPage.this, SP_Welcome.class);
                intent.putExtra("Welcome", name);
                startActivity(intent);

            }
        });
    }



    public void  saveinfo(View view)
    {

        SharedPreferences sharepref=getSharedPreferences("LoginInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharepref.edit();
        editor.putString("User_Name",e3.getText().toString());
        editor.putString("Password",e4.getText().toString());
        editor.apply();
        Toast.makeText(this,"Data Saved",Toast.LENGTH_LONG).show();
    }
}
