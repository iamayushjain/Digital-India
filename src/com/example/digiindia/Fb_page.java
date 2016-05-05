package com.example.digiindia;





import java.lang.reflect.Field;


import android.app.ActionBar.LayoutParams;
import android.app.Activity;
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
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Fb_page extends Fragment{
	 public static Fb_page newInstance() {
			return new Fb_page();
		}
		
	    
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
	    	//setContentView(R.layout.activity_my_main);
		View view1;
  	   view1 = inflater.inflate(R.layout.web_layout, container, false);
  	 WebView browser = (WebView)view1.findViewById(R.id.webView1);
  	 TextView tv1=(TextView)view1.findViewById(R.id.textView1);
  	 final ProgressBar pb=(ProgressBar)view1.findViewById(R.id.progressBar1);
  	 browser.setWebViewClient(new MyBrowser());
  	browser.getSettings().setLoadsImagesAutomatically(true);
    browser.getSettings().setJavaScriptEnabled(true);
    browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
    //int ob1=getArguments().getInt("No");
    //browser.loadUrl(url);
      	//browser.loadUrl("https://m.facebook.com/metacognitionfest?fref=ts");
  	  browser.loadUrl("https://rtionline.gov.in/request/request.php");
    tv1.setText(browser.getProgress()+""); 
    	
  	browser.setWebChromeClient(new WebChromeClient() {
        public void onProgressChanged(WebView view, int progress)   
        {
        	//Make the bar disappear after URL is loaded, and changes string to Loading...
        	//MyActivity.setTitle("Loading...");
        	//MyActivity.setProgress(progress * 100); //Make the bar disappear after URL is loaded

        	// Return the app name after finish loading
            if(progress >= 90)
            	pb.setVisibility(View.GONE);
     	 }
        });

  		 
  		 
  		 return view1;
	}
	private class MyBrowser extends WebViewClient {
	      @Override
	      public boolean shouldOverrideUrlLoading(WebView 
	    		  view, String url) {
	         view.loadUrl(url);
	         return true;
	      }
	      
	   }
	   
	   	}
		
