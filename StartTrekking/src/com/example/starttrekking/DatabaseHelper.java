package com.example.starttrekking;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

public class DatabaseHelper extends SQLiteOpenHelper {
	 
    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "db_st";
 
    DatabaseHelper (Context context) {
    	super(context, Environment.getExternalStorageDirectory().getAbsolutePath() + "/start-trekking/database/" + DATABASE_NAME, null, DATABASE_VERSION);
    }

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
}
