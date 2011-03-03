package com.androidbook.droid1;

import java.io.*;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DroidActivity extends Activity {
	
    private static final String appTag = "Droid1";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    	Log.i(appTag, "In onCreate() callback method");
        setContentView(R.layout.main);
        
		InputStream myInputStream = getResources().openRawResource(R.raw.my_text);
		InputStreamReader myInputStreamReader = new InputStreamReader(myInputStream);
		BufferedReader myBufferedReader = new BufferedReader(myInputStreamReader);
		
		// use string builder for efficiency
		StringBuilder myStringBuilder = new StringBuilder();
		
		String aString = "";
		try {
			while ((aString = myBufferedReader.readLine()) != null)
			{ 
				myStringBuilder.append(aString);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}		
		Log.v(appTag, myStringBuilder.toString());
    }

    // override Activity callback methods
    // Reference:
    // http://developer.android.com/reference/android/app/Activity.html
	@Override
	protected void onStart() {
		super.onStart();
    	Log.i(appTag, "In onStart() callback method");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
    	Log.i(appTag, "In onPause() callback method");
	}

	@Override
	protected void onResume() {
		super.onResume();
    	Log.i(appTag, "In onResume() callback method");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
    	Log.i(appTag, "In onStop() callback method");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
    	Log.i(appTag, "In onRestart() callback method");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
    	Log.i(appTag, "In onDestroy() callback method");
	}
       
}