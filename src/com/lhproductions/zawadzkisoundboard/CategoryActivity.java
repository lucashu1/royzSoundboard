package com.lhproductions.zawadzkisoundboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class CategoryActivity extends Activity {

	Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_category, menu);
		return true;
	}
	
	public void codButton(View view){
		intent = new Intent(CategoryActivity.this, CodActivity.class);
		startActivity(intent);
	}
	
	public void depresskiButton(View view){
		intent = new Intent(CategoryActivity.this, DepresskiActivity.class);
		startActivity(intent);
	}
	
	public void dubstepButton(View view){
		intent = new Intent(CategoryActivity.this, DubstepActivity.class);
		startActivity(intent);
	}
	
	public void exclamationsButton(View view){
		intent = new Intent(CategoryActivity.this, ExclamationsActivity.class);
		startActivity(intent);
	}
	
	public void getOutButton(View view){
		intent = new Intent(CategoryActivity.this, GetOutActivity.class);
		startActivity(intent);
	}
	
	public void iDontCareButton(View view){
		intent = new Intent(CategoryActivity.this, IDontCareActivity.class);
		startActivity(intent);
	}
	
	public void laughButton(View view){
		intent = new Intent(CategoryActivity.this, LaughActivity.class);
		startActivity(intent);
	}
	
	public void questionsButton(View view){
		intent = new Intent(CategoryActivity.this, QuestionsActivity.class);
		startActivity(intent);
	}
	
	public void threatsInsultsButton(View view){
		intent = new Intent(CategoryActivity.this, ThreatsInsultsActivity.class);
		startActivity(intent);
	}
	
	public void yesNoButton(View view){
		intent = new Intent(CategoryActivity.this, YesNoActivity.class);
		startActivity(intent);
	}
	
	public void otherButton(View view){
		intent = new Intent(CategoryActivity.this, OtherActivity.class);
		startActivity(intent);
	}

}
