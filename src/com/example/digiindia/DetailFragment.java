package com.example.digiindia;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.w3c.dom.ls.LSInput;


import android.app.ActionBar;
//import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ActionBar.LayoutParams;
import android.app.ActionBar.Tab;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class DetailFragment extends Fragment {
    TextView text;
    
    ListView view1;
    private View mFragmentContainerView;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private boolean mUserLearnedDrawer=false;
	private boolean mFromSavedInstanceState=false;
	public static final String TAG =DetailFragment.class.getSimpleName();
	

    private static final String PREF_USER_LEARNED_DRAWER = "navigation_drawer_learned";
	String username;
	String pass;
	String cokie;
	String dept[];
	String dept1[];String dept2[];String dept3[];
	String dept4[];
	public static DetailFragment newInstance() {
		return new DetailFragment();
		
	}
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
    	 dept = getArguments().getStringArray("Array1");
    	 dept1 = getArguments().getStringArray("Array2");
    	 dept2 = getArguments().getStringArray("Array");
    	 dept3 = getArguments().getStringArray("Array4");
    	 dept4 = getArguments().getStringArray("Array3");
    	 View view;
         	   view = inflater.inflate(R.layout.layout2, container, false);
              // String menu = getArguments().getString("Menu");
               //text= (TextView) view.findViewById(R.id.detail);
               //text.setText(menu);
        	   view1=(ListView)view.findViewById(R.id.listView1);
        	   imagecustom_minerals_lease adapter3=new imagecustom_minerals_lease(getActivity(), dept,dept1,dept2);
        		 view1.setAdapter(adapter3);
        	view1.setOnItemClickListener(new OnItemClickListener() {

        		@Override
        		public void onItemClick(AdapterView<?> parent, View view, int position,
        				long id) {

						// TODO Auto-generated method stub
						listview4 cdd1=new listview4(dept2[position],dept[position],dept1[position],dept3[position],dept4[position],getActivity());
						
					 	
						cdd1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00ffffff")));
						cdd1.show();
						Window window = cdd1.getWindow();
						window.setLayout(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
				  
					}
				});
//        	   new MyTask().execute();
                
                   return view;
          
    }
}
