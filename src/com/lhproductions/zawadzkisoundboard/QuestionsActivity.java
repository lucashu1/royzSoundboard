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

public class QuestionsActivity extends Activity {

	MediaPlayer soundPlayer;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_questions);
		// Show the Up button in the action bar.
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        	getActionBar().setDisplayHomeAsUpEnabled(true);
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_questions, menu);
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
	
	public void areYouRecording(View view){
		soundPlayer = MediaPlayer.create(QuestionsActivity.this, R.raw.are_you_recording);
		soundPlayer.start();
	}
	
	public void waitHow(View view){
		soundPlayer = MediaPlayer.create(QuestionsActivity.this, R.raw.wait_how);
		soundPlayer.start();
	}
	
	public void wat(View view){
		soundPlayer = MediaPlayer.create(QuestionsActivity.this, R.raw.wat);
		soundPlayer.start();
	}
	
	public void whatYouDoing(View view){
		soundPlayer = MediaPlayer.create(QuestionsActivity.this, R.raw.what_you_doing);
		soundPlayer.start();
	}
	
	public void whatsHisName(View view){
		soundPlayer = MediaPlayer.create(QuestionsActivity.this, R.raw.whats_his_name);
		soundPlayer.start();
	}
	
	public void whichOne(View view){
		soundPlayer = MediaPlayer.create(QuestionsActivity.this, R.raw.which_one);
		soundPlayer.start();
	}
	
	public void whyOnNews(View view){
		soundPlayer = MediaPlayer.create(QuestionsActivity.this, R.raw.why_on_news);
		soundPlayer.start();
	}

}
