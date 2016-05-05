package com.example.digiindia;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class Mynotification2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_mynotification);
		if (Context.NOTIFICATION_SERVICE!=null) {
			
	        String ns = Context.NOTIFICATION_SERVICE;

	            NotificationManager nMgr = (NotificationManager) getApplicationContext().getSystemService(ns);

	            nMgr.cancel(0);
	            finish();

	}
	}
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

	}

}
