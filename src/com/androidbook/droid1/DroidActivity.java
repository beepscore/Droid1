package com.androidbook.droid1;

import java.io.InputStream;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DroidActivity extends Activity {
	
    private static final String appTag = "Droid1";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	Log.i(appTag, "In onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
		InputStream myInputFile = getResources().openRawResource(R.raw.my_text);
		// Next convert myInputFile to a String
		// now log string
		//Log.v(appTag, myString);
    }

    // override Activity callback methods
    // Reference:
    // http://developer.android.com/reference/android/app/Activity.html
	@Override
	protected void onStart() {
    	Log.i(appTag, "In onStart()");
		super.onStart();
	}
	
	@Override
	protected void onPause() {
    	Log.i(appTag, "In onPause()");
		super.onPause();
	}

	@Override
	protected void onResume() {
    	Log.i(appTag, "In onResume()");
		super.onResume();
	}
	
	@Override
	protected void onStop() {
    	Log.i(appTag, "In onStop()");
		super.onStop();
	}

	@Override
	protected void onRestart() {
    	Log.i(appTag, "In onRestart()");
		super.onRestart();
	}
	
	@Override
	protected void onDestroy() {
    	Log.i(appTag, "In onDestroy()");
		super.onDestroy();
	}
       
}