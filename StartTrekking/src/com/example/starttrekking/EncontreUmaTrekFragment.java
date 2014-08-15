package com.example.starttrekking;

import java.io.IOException;

import android.app.Fragment;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EncontreUmaTrekFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) 
	{

		//Inflate the layout for this fragment
		
		DatabaseHelper myDbHelper = DatabaseHelper.getInstance(container.getContext());
	    try {
	          myDbHelper.createDatabase();
	    } catch (IOException ioe) {
	          throw new Error("Unable to create database");
	    }
	    try {
	          myDbHelper.openDatabase();
	    }catch(SQLException sqle){
	          throw sqle;
	    }
	    
	    SQLiteDatabase db = myDbHelper.getWritableDatabase();
	    Cursor cursor = db.rawQuery("SELECT * FROM trekking", null);
	    if (cursor.moveToFirst()) {
	    	do {
	    		System.out.println(cursor.getString(1));
	    	} while (cursor.moveToNext());
	    }
	    
		
		return inflater.inflate(
				R.layout.encontre_uma_trek, container, false);
	}

}
