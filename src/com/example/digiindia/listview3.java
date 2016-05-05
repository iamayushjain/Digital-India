package com.example.digiindia;



import android.R.string;
import android.app.Activity;
import android.app.Dialog;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.*;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;

public class listview3 extends Dialog 
{
	public Activity c;
	public String pos;
	public String t1,t2,t3,t4,t5,t6,t7,t8;
    public listview3(String tv1,String tv2,String tv3,String tv4,String tv5,String tv6,String tv7,String tv8,Activity a) {
		super(a);
		this.c=a;
		t1=tv1;
		t2=tv2;
		t3=tv3;
		t4=tv4;
		t5=tv5;
		t6=tv6;
		t7=tv7;
		t8=tv8;
		
		//System.out.print(c.)
		//Toast.makeText(a, pos, 3000).show();
		// TODO Auto-generated constructor stub
	}

	/** Called when the activity is first created. */
 GridView view3;
    ListView lview3;
    TextView text1,text2,text3,text4,text5,text6;
    // adapter;
	 
   // ListViewCustomAdapter adapter;
    Button b1;
 
   //String j[]=desc[pos][];
   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.gridlayout_demo);
               text1=(TextView)findViewById(R.id.textView1);
               text2=(TextView)findViewById(R.id.textView3);
               text3=(TextView)findViewById(R.id.textView5);
               text4=(TextView)findViewById(R.id.textView7);
               text5=(TextView)findViewById(R.id.textView9);
               text6=(TextView)findViewById(R.id.textView11);
               text1.setText(t1);
               text2.setText(t2);text3.setText(t3);text4.setText(t4);text5.setText(t5);
               text6.setText(t6);
               ImageButton b1=(ImageButton)findViewById(R.id.imageButton1);
               b1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					String geoCode= "geo:"+t7+","+t8;
	    			Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse(geoCode));
	    			c.startActivity(intent);
	    			
				}
			});
               //text6=(TextView)findViewById(R.id.textView13);
               //text7=(TextView)findViewById(R.id.textView15);
               
   }
   }
