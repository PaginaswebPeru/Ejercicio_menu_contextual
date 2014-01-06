package paginasweb.pe.ejercicio_menu_contextual;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	TextView texto;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		texto = (TextView) findViewById(R.id.textView1);
		
		registerForContextMenu(texto);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater inflador = getMenuInflater();
		inflador.inflate(R.menu.menu_contextual, menu);
	}
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.item01:
			Toast.makeText(getApplicationContext(), "Usted selecciono el item 01", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.item02:
			Toast.makeText(getApplicationContext(), "Usted selecciono el item 02", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.item03:
			Toast.makeText(getApplicationContext(), "Usted selecciono el item 03", Toast.LENGTH_SHORT).show();
			return true;
		default: 
		return super.onContextItemSelected(item);
		}
		
	}

}
