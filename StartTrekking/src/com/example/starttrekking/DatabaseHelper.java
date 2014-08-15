package com.example.starttrekking;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

public class DatabaseHelper extends SQLiteOpenHelper {
	 
	private static DatabaseHelper mInstance = null;

	  private static final String DATABASE_NAME = "database_name";
	  private static final String DATABASE_TABLE = "table_name";
	  private static final int DATABASE_VERSION = 1;

	  public static DatabaseHelper getInstance(Context ctx) {

	    // Use the application context, which will ensure that you 
	    // don't accidentally leak an Activity's context.
	    // See this article for more information: http://bit.ly/6LRzfx
	    if (mInstance == null) {
	      mInstance = new DatabaseHelper(ctx.getApplicationContext());
	    }
	    return mInstance;
	  }

	  /**
	   * Constructor should be private to prevent direct instantiation.
	   * make call to static factory method "getInstance()" instead.
	   */
	  private DatabaseHelper(Context ctx) {
	    super(ctx, DATABASE_NAME, null, DATABASE_VERSION);
	  }
}
