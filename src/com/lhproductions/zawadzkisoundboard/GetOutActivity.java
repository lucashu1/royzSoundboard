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

public class GetOutActivity extends Activity {

	MediaPlayer soundPlayer;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_get_out);
		// Show the Up button in the action bar.
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        	getActionBar().setDisplayHomeAsUpEnabled(true);
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_get_out, menu);
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
	
	public void getOut(View view){
		soundPlayer = MediaPlayer.create(GetOutActivity.this, R.raw.get_out);
		soundPlayer.start();
	}
	
	public void getOut2(View view){
		soundPlayer = MediaPlayer.create(GetOutActivity.this, R.raw.get_out2);
		soundPlayer.start();
	}
	
	public void getOuttaHere(View view){
		soundPlayer = MediaPlayer.create(GetOutActivity.this, R.raw.get_outta_here);
		soundPlayer.start();
	}
	
	public void getOuttaHere2(View view){
		soundPlayer = MediaPlayer.create(GetOutActivity.this, R.raw.get_outta_here2);
		soundPlayer.start();
	}
	
	public void getAway(View view){
		soundPlayer = MediaPlayer.create(GetOutActivity.this, R.raw.haha_get_away);
		soundPlayer.start();
	}
	
	public void lockMyRoom(View view){
		soundPlayer = MediaPlayer.create(GetOutActivity.this, R.raw.lock_my_room);
		soundPlayer.start();
	}

}
