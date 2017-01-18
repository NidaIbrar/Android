package com.example.nidaawan.android_smester_project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Nida Awan on 1/17/2017.
 */

public class Database extends SQLiteOpenHelper {

    SQLiteDatabase db;
    private static String DATABASE_NAME="DAS.db";

    private static String TABLE_NAME="Doctors";

    public static final String COL_1="CLINIC_NAME";
    public static final String COL_2="ADDRESS";
    public static final String COL_3="DOCTOR_NAME";


    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "DAS.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, CLINIC_NAME TEXT,DOCTOR_NAME TEXT,ADDRESS TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert_DOCTORS_ACCOUNT(String clinicname, String doctorname,String address )
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1 , clinicname);
        contentValues.put(COL_2, doctorname);
        contentValues.put(COL_3 , address);




         this.getWritableDatabase().insertOrThrow("Doctors", "", contentValues);

    }
    public Cursor  DOCTORS_LOGIN(String doctorname )
    {
        SQLiteDatabase db= this.getReadableDatabase();
        Cursor cursor=db.rawQuery("SELCET * FROM Doctors WEHRE DOCTOR_NAME="+doctorname,null);
        cursor.close();
        return cursor;


    }

}
