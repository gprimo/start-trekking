package com.example.starttrekking;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DetalhesTrekActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
	    int trek_id = intent.getIntExtra(EncontreUmaTrekFragment.TREK_ID,0);
	    setContentView(R.layout.activity_detalhe_trek);
	    Trek trek_escolhida = null;
	    SQLiteDatabase db = DatabaseHelper.getSqlDatabase(this);
	    Cursor cursor = db.rawQuery("SELECT * FROM trekking where id=" + trek_id, null);
		if (cursor.moveToFirst()) {
			do {
				trek_escolhida = new Trek(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getFloat(5), cursor.getString(6));
			} while (cursor.moveToNext());
		}
	    TextView titulo = (TextView) findViewById(R.id.titulo_trek);
	    titulo.setText(trek_escolhida.getNome());
	    
	    TextView comprimento= (TextView) findViewById(R.id.comprimento);
	    comprimento.setText(trek_escolhida.getComprimento());
	    
	    TextView cidade= (TextView) findViewById(R.id.cidade);
	    cidade.setText(trek_escolhida.getCidade());
	    
	    TextView estado= (TextView) findViewById(R.id.estado);
	    estado.setText(trek_escolhida.getEstado());
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detalhe_trek, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
