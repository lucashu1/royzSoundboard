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

public class DepresskiActivity extends Activity {
	
	MediaPlayer soundPlayer;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_depresski);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        	getActionBar().setDisplayHomeAsUpEnabled(true);
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_depresski, menu);
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
	
	public void canYouStop(View view){
		soundPlayer = MediaPlayer.create(DepresskiActivity.this, R.raw.can_you_stop);
		soundPlayer.start();
	}
	
	public void dontLikeFilming(View view){
		soundPlayer = MediaPlayer.create(DepresskiActivity.this, R.raw.dont_like_filming);
		soundPlayer.start();
	}
	
	public void iAmTool(View view){
		soundPlayer = MediaPlayer.create(DepresskiActivity.this, R.raw.i_am_tool);
		soundPlayer.start();
	}
	
	public void longSigh(View view){
		soundPlayer = MediaPlayer.create(DepresskiActivity.this, R.raw.long_sigh);
		soundPlayer.start();
	}
	
	public void nobodyKnows(View view){
		soundPlayer = MediaPlayer.create(DepresskiActivity.this, R.raw.nobody_knows);
		soundPlayer.start();
	}
	
	public void imNotGood(View view){
		soundPlayer = MediaPlayer.create(DepresskiActivity.this, R.raw.not_very_good);
		soundPlayer.start();
	}
	
	public void sixHours(View view){
		soundPlayer = MediaPlayer.create(DepresskiActivity.this, R.raw.six_hours_of_this);
		soundPlayer.start();
	}
	
	public void wrongDecision(View view){
		soundPlayer = MediaPlayer.create(DepresskiActivity.this, R.raw.the_wrong_decision);
		soundPlayer.start();
	}
	
	public void whatever(View view){
		soundPlayer = MediaPlayer.create(DepresskiActivity.this, R.raw.whatever);
		soundPlayer.start();
	}
	
	public void whenImBsed(View view){
		soundPlayer = MediaPlayer.create(DepresskiActivity.this, R.raw.when_im_bsed);
		soundPlayer.start();
	}

}
