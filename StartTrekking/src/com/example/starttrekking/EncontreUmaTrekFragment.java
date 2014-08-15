package com.example.starttrekking;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Fragment;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EncontreUmaTrekFragment extends Fragment {
	private DatabaseHelper myDbHelper;
	ArrayList<Trek> treks_array;
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) 
	{
		treks_array = new ArrayList<Trek>();
		//Inflate the layout for this fragment
		
		myDbHelper = DatabaseHelper.getInstance(container.getContext());
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
				Trek temp_trek = new Trek(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getFloat(6), cursor.getString(7));
				treks_array.add(temp_trek);
			} while (cursor.moveToNext());
		}

		View view = inflater.inflate(
				R.layout.encontre_uma_trek, container, false);
		
		ListView treks_listview = (ListView)view.findViewById(R.id.treks_list);
		PopulateList(treks_listview, container.getContext());
		
		return view;
	}


	void PopulateList(ListView list, Context context)
	{
		
		ArrayList<String> arraylist_treks = new ArrayList<String>();
		for (Trek trek : treks_array)
		{
			arraylist_treks.add(trek.getNome());
		}
		ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, arraylist_treks); 
		list.setAdapter(listAdapter);
	}
}
