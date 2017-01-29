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

public class YesNoActivity extends Activity {

	MediaPlayer soundPlayer;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_yes_no);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        	getActionBar().setDisplayHomeAsUpEnabled(true);
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_yes_no, menu);
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
	
	public void no(View view){
		soundPlayer = MediaPlayer.create(YesNoActivity.this, R.raw.no);
		soundPlayer.start();
	}
	
	public void noYouDont(View view){
		soundPlayer = MediaPlayer.create(YesNoActivity.this, R.raw.no_you_dont);
		soundPlayer.start();
	}
	
	public void ohYeah(View view){
		soundPlayer = MediaPlayer.create(YesNoActivity.this, R.raw.oh_yeah);
		soundPlayer.start();
	}
	
	public void ok(View view){
		soundPlayer = MediaPlayer.create(YesNoActivity.this, R.raw.ok);
		soundPlayer.start();
	}
	
	public void uhOkay(View view){
		soundPlayer = MediaPlayer.create(YesNoActivity.this, R.raw.uh_okay);
		soundPlayer.start();
	}
	
	public void wellNoBecause(View view){
		soundPlayer = MediaPlayer.create(YesNoActivity.this, R.raw.well_no_because);
		soundPlayer.start();
	}
	
	public void yeah(View view){
		soundPlayer = MediaPlayer.create(YesNoActivity.this, R.raw.yeah);
		soundPlayer.start();
	}
	
	public void yeahExactly(View view){
		soundPlayer = MediaPlayer.create(YesNoActivity.this, R.raw.yeah_exactly);
		soundPlayer.start();
	}
	
	public void youDont(View view){
		soundPlayer = MediaPlayer.create(YesNoActivity.this, R.raw.you_dont);
		soundPlayer.start();
	}
	
	public void yup(View view){
		soundPlayer = MediaPlayer.create(YesNoActivity.this, R.raw.yup);
		soundPlayer.start();
	}

}
