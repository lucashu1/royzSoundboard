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

public class IDontCareActivity extends Activity {

	MediaPlayer soundPlayer;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_i_dont_care);
		// Show the Up button in the action bar.
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        	getActionBar().setDisplayHomeAsUpEnabled(true);
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_i_dont_care, menu);
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
	
	public void iDontCare(View view){
		soundPlayer = MediaPlayer.create(IDontCareActivity.this, R.raw.i_dont_care);
		soundPlayer.start();
	}
	
	public void iDontCare2(View view){
		soundPlayer = MediaPlayer.create(IDontCareActivity.this, R.raw.i_dont_care2);
		soundPlayer.start();
	}
	
	public void iDontMind(View view){
		soundPlayer = MediaPlayer.create(IDontCareActivity.this, R.raw.i_dont_mind);
		soundPlayer.start();
	}
	
	public void idkButIdc(View view){
		soundPlayer = MediaPlayer.create(IDontCareActivity.this, R.raw.idk_but_idc);
		soundPlayer.start();
	}

}
