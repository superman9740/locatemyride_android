package com.dickson.locatemyride;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

import com.dickson.locatemyride.GPSTracker;

public class MainActivity extends Activity {

	GPSTracker tracker;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tracker = new GPSTracker(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void updateGPSText(String text)
	{
		  final TextView textView = (TextView) findViewById(R.id.textView2);
		  
		  textView.setText(text);
		  
	}
}
