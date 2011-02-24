package com.androidbook.droid1;

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
    }
}