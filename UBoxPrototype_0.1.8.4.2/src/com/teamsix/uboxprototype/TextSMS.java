package com.teamsix.uboxprototype;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TextSMS extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_text_sms);
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
		{
			// Inflate the menu; this adds items to the action bar if it is
			// present.
			getMenuInflater().inflate(R.menu.text_sm, menu);
			return true;
		}

}
