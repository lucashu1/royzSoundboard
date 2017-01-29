package com.lhproductions.zawadzkisoundboard;

import com.lhproductions.zawadzkisoundboard.util.SystemUiHider;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class SplashActivity extends Activity {
	Intent splashIntent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_splash);
		Thread splashTimer = new Thread(){
			public void run(){
				try{
					sleep(3000);
					splashIntent = new Intent(SplashActivity.this, CategoryActivity.class);
					startActivity(splashIntent);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				finally{
					finish();
				}
			}
		};
		splashTimer.start();
	}
}
