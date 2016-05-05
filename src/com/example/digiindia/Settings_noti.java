package com.example.digiindia;


import android.support.v4.app.Fragment;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;
import android.os.Build;
import android.preference.PreferenceManager;

public class Settings_noti extends Activity implements OnItemSelectedListener {

	String category[]={"Women's Helpline","Police","Ambulance","Fire"};
	
	CheckBox c1,c2;
	Button b1;
	int pos=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        Spinner dropdown1=(Spinner)findViewById(R.id.spinner1);
		ArrayAdapter<String> adapter1 =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,category);
		//dropdown2=(Spinner)findViewById(R.id.spinner2);
		dropdown1.setOnItemSelectedListener(this);
		dropdown1.setAdapter(adapter1);
		
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		
				
		        
		     NotificationManager   nm=(NotificationManager)getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
		      
		     /*Notification n=	new Notification(android.R.drawable.stat_sys_headset,"HEADPHONE PLUGGED IN",System.currentTimeMillis()); 
		        n.defaults=Notification.DEFAULT_ALL;
		        
		       */ Intent i=new Intent(getApplicationContext(),Mynotification.class);
		        Intent i1=new Intent(getApplicationContext(),Mynotification2.class);
		       i.putExtra("User",pos+"");
				
		        PendingIntent p=PendingIntent.getActivity(getApplicationContext(),0,i,0);
		        PendingIntent q=PendingIntent.getActivity(getApplicationContext(),0,i1,0);
		        Notification n=new Notification.Builder(getApplicationContext())
		        .setContentTitle("NEW MAIL FROM"+"test@gmail.com").setContentTitle(category[pos]).setSmallIcon(R.drawable.turn20).setContentIntent(p).setAutoCancel(true).addAction(R.drawable.phone325, "Call", p).addAction(android.R.drawable.ic_delete, "CLOSE", q).build();
		        n.flags |=Notification.FLAG_NO_CLEAR;
				nm.notify(0,n);
		         
		        Toast.makeText(getApplicationContext(), "Notification Created", 3000).show();
		        finish();
			

						}
		
        
    });
    }
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		pos=position;
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}}





