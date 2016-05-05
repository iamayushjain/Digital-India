package com.example.digiindia;


import java.io.IOException;
import java.util.Locale;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;





import android.R.string;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder.DeathRecipient;
import android.app.Activity;
import android.app.AlertDialog;
//import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.hardware.camera2.TotalCaptureResult;
import android.speech.tts.TextToSpeech;
//import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;

import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MyMainAct extends FragmentActivity implements TextToSpeech.OnInitListener{
	TextToSpeech speech;
	
	String[] menu;
	     DrawerLayout dLayout;
	     ListView dList;
	     ArrayAdapter<String> adapter;
	     private ActionBarDrawerToggle mDrawerToggle;
	     String s,p,ck;
	     ProgressDialog mProgressDialog;
	     String pass_value1[];
	     String deprt[]=null;
	     String deprt1[]=null;
		    
	     String deprt2[]=null;
		    
	     String deprt3[]=null;
	     String deprt5[]=null;
		        
	     String deprt4[]=null;
	     String deprt6[]=null;
			   String string; 
	     int lo=0;
	     private static final String TAG = MyMainAct.class.getSimpleName();
	       Integer[] imageId = {
	    		   R.drawable.profile,
R.drawable.settings48,R.drawable.listing12,R.drawable.phone325,R.drawable.phone325,R.drawable.phone325,R.drawable.phone325,R.drawable.rti1
	  		      };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		   setContentView(R.layout.activity_main);
		 String pass_value[]=new String[6];
		 //pass_value[0]=user;
			string="WELCOME";
			speech=new TextToSpeech(this,this);
		
		 lo++;

		   getActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
           
	     	menu = new String[]{"Chief Data Officers","Settings","Category","Ambulance","Police","Women's Helpline","Fire","RTI Request"};
	        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
	        
	        dList = (ListView) findViewById(R.id.left_drawer);

	       // adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
	        imagecustom2 adapter = new
	    	        imagecustom2(MyMainAct.this, menu, imageId);
	    	
			  dList.setAdapter(adapter);
	        dLayout.openDrawer(Gravity.START);
	       // dList.setSelector(android.R.color.holo_blue_dark);
			dList.setBackgroundColor(Color.BLACK);	
			
	        dList.setOnItemClickListener(new OnItemClickListener(){

				@Override
				public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
							
					Toast.makeText(getApplicationContext(), menu[position], 3000).show();
					navigateTo(position);
					
				}
	        	
	        });
	        getActionBar().setDisplayHomeAsUpEnabled(true);
	        getActionBar().setHomeButtonEnabled(true);
	 
	        mDrawerToggle = new ActionBarDrawerToggle(this, dLayout,
	                R.drawable.text1566, //nav menu toggle icon
	                R.string.app_name, // nav drawer open - description for accessibility
	                R.string.app_name // nav drawer close - description for accessibility
	        ){
	            public void onDrawerClosed(View view) {
	                getActionBar().setTitle("E GOV");
	                // calling onPrepareOptionsMenu() to show action bar icons
	                  invalidateOptionsMenu();
	            }
	 
	            public void onDrawerOpened(View drawerView) {
	                getActionBar().setTitle("OPTIONS");
	                // calling onPrepareOptionsMenu() to hide action bar icons
	                invalidateOptionsMenu();
	            }
	        };
	        dLayout.setDrawerListener(mDrawerToggle);
	        getActionBar().setDisplayHomeAsUpEnabled(true);
	        getActionBar().setHomeButtonEnabled(true);
	        mDrawerToggle.syncState();
	        pass_value1=pass_value;
    	     //dLayout.setDrawerListener(mDrawerToggle);
	 
	        if (savedInstanceState == null) {
	            // on first time display view for first nav item
	        //    displayView();
	        	navigateTo(2);
	        	
	        }
	}
	        private void navigateTo(int position) {
//	    		Log.v(TAG, "List View Item: " + position);
	    	//	Fragment detail =new DetailFragment();
	    		Log.v(TAG, "List View Item: " + position);
	    		dLayout.closeDrawers();			
    			position--;
	    	//	Fragment tbb =new TabbedActivity();
	    		//Bundle args = new Bundle();
	    		switch(position) {
	    		
	    		case 1:
	    			
	    		//dLayout.closeDrawers();
	    		Events ev=Events.newInstance();
	    		
	    		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.content_frame,ev).commit();
			
	    			break;
	    		
	    		case 2:
	    			
	    			String mydata2="tel:102" ;
	    			Intent myActivity2 = new Intent(Intent.ACTION_CALL,
	    					Uri.parse(mydata2));
	    			startActivity(myActivity2);
	    		
	    		   		break;
	    		case 3:String mydata3="tel:100" ;
    					Intent myActivity3 = new Intent(Intent.ACTION_CALL,
    					Uri.parse(mydata3));
    					startActivity(myActivity3);
    					break;
	    		case 4:String mydata4="tel:181" ;
     					Intent myActivity4 = new Intent(Intent.ACTION_CALL,
    					Uri.parse(mydata4));
     					startActivity(myActivity4);		
	    		        break;
	    		case 5:
	    			//finish();
	    			String mydata5="tel:101" ;
	    			Intent myActivity5 = new Intent(Intent.ACTION_CALL,
	    					Uri.parse(mydata5));
	    			startActivity(myActivity5);
	    		
	    			  break;
	    		case 0:
	    			Intent i=new Intent(MyMainAct.this,Settings_noti.class);
	    			startActivity(i);
	    			break;
	    		case -1:
	    			if(isNetworkAvailable())
					{
					new MyTask().execute();
					}
					else
					{
						alertbox();
					}
					
	    		   				break;
	    		
	    		case 6:
	    			if(isNetworkAvailable())
	    			{
Fb_page ev5=Fb_page.newInstance();
	
	 	    		getSupportFragmentManager()
	 				.beginTransaction()
	 				.replace(R.id.content_frame,ev5).commit();

	    			}
	    			else
	    			{
	    				alertbox();
	    			}
	    			break;
	    			
	    		}
	        
	    	
	}
	        
	    	public void alertbox()
	    	{
	    		AlertDialog.Builder builder = new AlertDialog.Builder(this);
				builder.setMessage("Internet Connection Not Available")
				       .setCancelable(false)
				       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
				           public void onClick(DialogInterface dialog, int id) {
				                //do things
				           }
				       });
				AlertDialog alert = builder.create();
				alert.show();	
	    	}
@Override
	        public boolean onOptionsItemSelected(MenuItem item) {
	            // Pass the event to ActionBarDrawerToggle, if it returns
	            // true, then it has handled the app icon touch event
	    		//Toast.makeText(getApplicationContext(),"CLick",3000).show();
	            if (mDrawerToggle.onOptionsItemSelected(item)) {
	              return true;
	            }
	            return super.onOptionsItemSelected(item);
	            
	        }
private boolean isNetworkAvailable() {
    ConnectivityManager connectivityManager 
          = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    
}



private class MyTask extends AsyncTask<Void, Void, String> {

String title ="";
 String sessionId="";
	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		mProgressDialog = new ProgressDialog(MyMainAct.this);
		mProgressDialog.setTitle("Chief Data Officers");
		mProgressDialog.setMessage("Loading...");
		mProgressDialog.setIndeterminate(false);
		mProgressDialog.show();
//		mProgressDialog.show();
	}

@Override
  protected String doInBackground(Void... params) {
    
    Document doc;
 
   


	//Document doc;
	try
	{
	    String urlLogin = "https://data.gov.in/datacontrollers";
         
        Connection.Response response = Jsoup.connect(urlLogin)
                .method(Connection.Method.GET).timeout(0)
                .execute();


        Document loginPage = response.parse();
title=loginPage.title();
//   Element eventValidation = loginPage.select("input[name=__EVENTVALIDATION]").first();
//        Element viewState = loginPage.select("input[name=__VIEWSTATE]").first();

		//System.out.println(loginPage.title());
Elements links = loginPage.select("div");
int i=0;
for (Element element : links) {
if(element.attr("class").toString().equals("controller-field controller-dept"))
{
i++;
}
}
deprt=new String[i];
deprt1=new String[i];
deprt2=new String[i];
deprt3=new String[i];
deprt4=new String[i];
deprt5=new String[i];
i=0;
int i1=0,i2=0;
for (Element element : links) {

	
if(element.attr("class").toString().equals("row"))
{
//deprt4[i]=element.text();
i1++;
}
}

for (Element element : links) {
if(element.attr("class").toString().equals("controller-field controller-dept"))
{
deprt[i]=element.text();
i++;
}
if(element.attr("class").toString().equals("controller-field controller-designation"))
{
deprt5[i2]=element.text();
i2++;
}
//i++;
}

deprt6=new String[i1];
i1=0;
for (Element element : links) {

	
if(element.attr("class").toString().equals("row"))
{
deprt6[i1]=element.text();
i1++;
}
}
i=0;
i1=0;

for(String strt: deprt6)
{
	if(strt.contains("Phone:"))
	{deprt4[i]=strt;
	i++;
		}
	if(strt.contains("Email:"))
	{deprt3[i1]=strt;
	i1++;
		}
	
}
int ob1=0,ob2=0,ob3=0;
for(String strt:deprt5)
{
	ob1=0;

for (String retval: strt.split(",", 0)){
//System.out.println(retval);
if(ob1==0)
	{
	deprt1[ob2]=retval;
	ob2++;
	ob1=1;
	}
else  if(ob1==1)
{

	deprt2[ob3]=retval;
	ob3++;
	ob1=2;
	}
}
}



}
	
	catch(IOException e)
	{
		e.printStackTrace();
	}
	return title;
	
}

  @Override
  protected void onPostExecute(String result){//
	  mProgressDialog.dismiss();
		Bundle arg=new Bundle();
		/*arg.putString("Menu", "1");
		arg.putString("User", s);
		arg.putString("Pass", p);
		arg.putString("Cook", ck);
		*/
		arg.putStringArray("Array",deprt);
		arg.putStringArray("Array1",deprt1);
		arg.putStringArray("Array2",deprt2);
		arg.putStringArray("Array3",deprt3);
		arg.putStringArray("Array4",deprt4);
		/*arg.putStringArray("Array1", day);
		arg.putIntArray("Array2",rpc);
		arg.putStringArray("Array3", cl_time);
		arg.putStringArray("Array4", sub_fac);
		arg.putStringArray("Array5", block);
		detail.setArguments(args);
		*/
		DetailFragment tb1=new DetailFragment();
		tb1.setArguments(arg);
		getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame,tb1,DetailFragment.TAG ).commit();
	
	//finish();
		
      
  }
}



@Override
public void onInit(int status) {
	// TODO Auto-generated method stub
	if(status==speech.SUCCESS)
	{
		int result=speech.setLanguage(Locale.US);
		if(result==TextToSpeech.LANG_MISSING_DATA||result==TextToSpeech.LANG_NOT_SUPPORTED)
		{
			Toast.makeText(getApplicationContext(), "Not Supported", 3000).show();
		}
		else
		{
			 speech.speak(string, TextToSpeech.QUEUE_FLUSH,null);
		}
		
	}	

}
}




