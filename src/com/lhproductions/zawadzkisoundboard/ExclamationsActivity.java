package com.lhproductions.zawadzkisoundboard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ExclamationsActivity extends Activity {

	MediaPlayer soundPlayer;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exclamations);
		// Show the Up button in the action bar.
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        	getActionBar().setDisplayHomeAsUpEnabled(true);
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_exclamations, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void ay(View view){
		soundPlayer = MediaPlayer.create(ExclamationsActivity.this, R.raw.ay);
		soundPlayer.start();
	}
	
	public void iCantSee(View view){
		soundPlayer = MediaPlayer.create(ExclamationsActivity.this, R.raw.i_cant_see);
		soundPlayer.start();
	}
	
	public void ohGod(View view){
		soundPlayer = MediaPlayer.create(ExclamationsActivity.this, R.raw.oh_god);
		soundPlayer.start();
	}
	
	public void ohWow(View view){
		soundPlayer = MediaPlayer.create(ExclamationsActivity.this, R.raw.oh_wow);
		soundPlayer.start();
	}
	
	public void thatsCool(View view){
		soundPlayer = MediaPlayer.create(ExclamationsActivity.this, R.raw.thats_cool);
		soundPlayer.start();
	}
	
	public void youDidIt(View view){
		soundPlayer = MediaPlayer.create(ExclamationsActivity.this, R.raw.you_did_it);
		soundPlayer.start();
	}

}
