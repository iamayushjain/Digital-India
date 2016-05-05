package com.example.digiindia;





import java.lang.reflect.Field;


import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
//import android.app.Fragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Events extends Fragment{
	 String[] contacts={"Aadhar Card","Hospitals","Minerals","Income Tax","Pincode","Blood Bank","Location Messesging","Mineral Lease","Rights"};
	 Integer[] imageId = {
		      R.drawable.qr_code_logo,R.drawable.egov1,R.drawable.egov11,R.drawable.egov3,R.drawable.egov4,R.drawable.bloodbank,R.drawable.egov9,R.drawable.lease,R.drawable.egov6,
		      };
	 public static Events newInstance() {
			return new Events();
		}
	 ProgressDialog	 mProgressDialog ;
	    
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
	    	//setContentView(R.layout.activity_my_main);
		View view1;
  	   view1 = inflater.inflate(R.layout.activity_my_main, container, false);
  ListView view=(ListView)view1.findViewById(R.id.listView1);
	       view.setBackgroundColor(Color.BLACK
	    		   );
	     imagecustom adapter = new
    	        imagecustom(getActivity(), contacts, imageId);
    	/* final imagecustom adapter1 = new
    	        imagecustom(raceingpart.this, contacts3, imageId);
    	*/
		view.setAdapter(adapter);
		view.setSelector(android.R.color.black);
    	registerForContextMenu(view);
    	view.setOnItemClickListener(clickb);
    	
	return view1;
	}
	OnItemClickListener clickb = new OnItemClickListener() 
	{
	public void onItemClick(android.widget.AdapterView<?> arg0, View arg1, int arg2, long arg3) 
	{
		String info = arg2+"";//((TextView) arg1).getText().toString();
	/* 	//listview3 cdd1=new listview3(info,getActivity());
	 	Bundle arg=new Bundle();
		arg.putString("Menu",info);
		
		cdd1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#40000000")));
		cdd1.show();
		Window window = cdd1.getWindow();
		window.setLayout(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
  
		*/
 	//Toast.makeText(getApplicationContext(), info, 3000).show();
arg2--;
		if(arg2==-1)
		{
			Intent i=new Intent(getActivity(),AdharScan.class);
		mProgressDialog = new ProgressDialog(getActivity());
				mProgressDialog.setTitle("Location");
				mProgressDialog.setMessage("Fetching...");
				mProgressDialog.setIndeterminate(false);
				mProgressDialog.show();
			
			startActivity(i);
			mProgressDialog.dismiss();
			
		}
		if(arg2==0)
			{Intent i=new Intent(getActivity(),hospitals.class);
			startActivity(i);
			}
		if(arg2==1)
		{		
			Intent i=new Intent(getActivity(),MainSecond.class);
			startActivity(i);
		}
		if(arg2==2)
		{
			Intent i=new Intent(getActivity(),Tax.class);
			startActivity(i);
		}
		if(arg2==7)
		{
			Intent i=new Intent(getActivity(),Right_to_informtion.class);
			startActivity(i);
		}
		if(arg2==3)
		{
			Intent i=new Intent(getActivity(),allindiapincode.class);
			startActivity(i);
		}
		if(arg2==4)
		{
			Intent i=new Intent(getActivity(),bloodbank.class);
			startActivity(i);
		}
		
		if(arg2==5)
		{
			Intent i=new Intent(getActivity(),mygpsact.class);
			startActivity(i);
		}
		if(arg2==6)
		{
			Intent i=new Intent(getActivity(),mineral_mineral_lease.class);
			startActivity(i);
		}
 	
}
	};
	}
