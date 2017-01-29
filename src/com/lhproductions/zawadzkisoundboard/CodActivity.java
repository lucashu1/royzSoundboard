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

public class CodActivity extends Activity {

	MediaPlayer soundPlayer;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cod);
		// Show the Up button in the action bar.
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        	getActionBar().setDisplayHomeAsUpEnabled(true);
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_cod, menu);
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
	
	public void almostGotTriple(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.almost_got_triple);
		soundPlayer.start();
	}
	
	public void dropshotAccuracy(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.dropshot_accuracy);
		soundPlayer.start();
	}
	
	public void dropshotGun(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.dropshot1);
		soundPlayer.start();
	}
	
	public void gotReflexSight(View view){
		soundPlayer=MediaPlayer.create(CodActivity.this, R.raw.got_reflex_sight);
		soundPlayer.start();
	}
	
	public void lag(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.lag);
		soundPlayer.start();
	}
	
	public void madeMeDie(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.made_me_die);
		soundPlayer.start();
	}
	
	public void noLongBarrel(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.no_long_barrel);
		soundPlayer.start();
	}
	
	public void nobodyPlaysCod(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.nobody_plays_cod);
		soundPlayer.start();
	}
	
	public void ohNewHost(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.oh_new_host);
		soundPlayer.start();
	}
	
	public void oneVOneCod(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.onevone_cod);
		soundPlayer.start();
	}
	
	public void proneToDodge(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.prone_to_dodge);
		soundPlayer.start();
	}
	
	public void shotThemDown(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.shot_them_down);
		soundPlayer.start();
	}
	
	public void stealthChopper(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.stealth_chopper);
		soundPlayer.start();
	}
	
	public void surprisedICanPlay(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.surprised_i_can_play);
		soundPlayer.start();
	}
	
	public void shootStuffDown(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.shoot_stuff_down);
		soundPlayer.start();
	}
	
	public void uhHostPlease(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.uh_host_please);
		soundPlayer.start();
	}
	
	public void whyLvl21(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.why_lvl_21);
		soundPlayer.start();
	}
	
	public void wingsOfDeath(View view){
		soundPlayer = MediaPlayer.create(CodActivity.this, R.raw.i_know_who_wod);
		soundPlayer.start();
	}
	
	

}
