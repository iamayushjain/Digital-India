package com.example.digiindia;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class mygpsact extends Activity {
int j=0;
ProgressDialog mProgressDialog;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	//setContentView(R.layout.mygpslay);
	 mProgressDialog = new ProgressDialog(this);
		mProgressDialog.setTitle("Location");
		mProgressDialog.setMessage("Fetching...");
		mProgressDialog.setIndeterminate(false);
		mProgressDialog.show();
	
	LocationManager lm=(LocationManager)getSystemService(LOCATION_SERVICE);
	LocationListener ll=new MyLocation();
	lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,ll);
}
public class MyLocation implements LocationListener
{

	@Override
	public void onLocationChanged(Location arg0) {
		// TODO Auto-generated method stub
		arg0.getLatitude();
		arg0.getLongitude();
		String str="Latitude:"+arg0.getLatitude()+"\nLongitude:"+arg0.getLongitude();
	//Toast.makeText(getApplicationContext(), str, 7000).show();
	//	String myData= text1.getText().toString();
		//String mydata2=text2.getText().toString();
		if(j==0)
			{String mydata3="sms:";			
		Intent intent= new Intent( Intent.ACTION_SENDTO, Uri.parse(mydata3));
		intent.putExtra("sms_body", str);
		j=1;
		mProgressDialog.dismiss();
		
		startActivity(intent);
		finish();
			}
	}

	@Override
	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub

		Toast.makeText(getApplicationContext(), "GPS Disabled", 3000).show();
	}

	@Override
	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "GPS Enabled", 3000).show();
	}

	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub
		
	}
	
	}
}
