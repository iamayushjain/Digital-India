package com.example.digiindia;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class Mynotification extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_mynotification);
		Bundle bund=getIntent().getExtras();
		String s=bund.getString("User");
		String category[]={"181","100","101","102"};
		String mydata2="tel:"+category[Integer.parseInt(s)] ;
		Intent myActivity2 = new Intent(Intent.ACTION_CALL,
				Uri.parse(mydata2));
		startActivity(myActivity2);
		finish();
	
	}

	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

	}

}
