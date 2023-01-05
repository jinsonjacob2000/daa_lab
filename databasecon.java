package com.example.databaseee;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databasecon extends SQLiteOpenHelper {
    public databasecon(@Nullable Context context) {
        super(context, "mydatabase.db", null, 1);}

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
       sqLiteDatabase.execSQL("create table mytbl(name TEXT,age TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists mytbl");
    }

    public boolean insertData(String name,String age){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name",name);
        cv.put("age",age);
        long result =db.insert("mytbl",null,cv);
        if (result==-1){
            return true;
        }
        else {
            return false;
        }


    }
}
