package com.example.digiindia;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.example.digiindia.hospitals.MyLocation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.ActionBar.LayoutParams;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filterable;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class mineral_mineral_lease extends Activity{
	int start1=0,start2=0,start3=0,start4=0,start5=0,start6=0,start7=0,start8=0;
	TextView tvv,tvv1,tvv2,tvv3,tvv4,tvv5,tvv6,tvv7;
	imagecustom_minerals_lease adapter3;
	ListView lv1;
	EditText e1;
	Button b1;
	ArrayAdapter<String> ad;
	AutoCompleteTextView tvb1;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
    WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.mineral_lease_layout);
	//Spinner dropdown1=(Spinner)findViewById(R.id.spinner1);
	//ArrayAdapter<String> adapter1 =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,category);
	//dropdown2=(Spinner)findViewById(R.id.spinner2);
//	dropdown1.setOnItemSelectedListener(this);
	//ArrayAdapter<String> adapter2 =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,distct);
	lv1=(ListView)findViewById(R.id.listView1);
	e1=(EditText)findViewById(R.id.editText1);
	tvv=(TextView)findViewById(R.id.textView1);
	//et1=(EditText)findViewById(R.id.editText1);
	tvb1=(AutoCompleteTextView)findViewById(R.id.editText1);
    //text1=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);
    
    
    //text1.setAdapter(adapter);
	tvv1=(TextView)findViewById(R.id.textView2);
	tvv2=(TextView)findViewById(R.id.textView3);
	tvv3=(TextView)findViewById(R.id.textView4);
	tvv4=(TextView)findViewById(R.id.textView5);
	tvv5=(TextView)findViewById(R.id.textView6);
	tvv6=(TextView)findViewById(R.id.textView7);
	tvv7=(TextView)findViewById(R.id.textView8);
	b1=(Button)findViewById(R.id.button1);
	try {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		DefaultHandler handler = new DefaultHandler() {
		boolean name = false;
		boolean salary = false;
		boolean salary1=false;
		boolean salary2 = false;
		boolean salary3=false;

		boolean salary4 = false;
		boolean salary5=false;
		boolean salary6=false;

		public void startElement(String uri, String localName,String qName,
		Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("Mineral")) {
		name = true;
		}
		if (qName.equalsIgnoreCase("NO_OF_LEASES")) {
		salary = true;
		}
		if (qName.equalsIgnoreCase("LEASE_AREA_HECT")) {
		salary1 = true;
		}
		}
		public void endElement(String uri, String localName,
		String qName) throws SAXException {
			

		}

		public void characters(char ch[], int start, int length) throws SAXException {
		if (name) {
		//tv.setText(tv.getText()+"\n\n Name : " + new String(ch, start, length));
			if(start1==0)
			{
				tvv.setText(new String(ch, start, length));
				start1=1;
				
			}
			else
			{
		 tvv.setText(tvv.getText()+"-" + new String(ch, start, length));
		 }
			
		//tv[i]=tvv.getText().toString();
		//Toast.makeText(getApplicationContext(),new String(ch, start, length)+"",3000).show();
		//i++;

		name= false;

		}
		if (salary) {
		//tv.setText(tv.getText()+"\n Salary : " + new String(ch, start, length));
			//tvv1.setText(tvv1.getText()+"-" + new String(ch, start, length));
			if(start2==0)
			{
				tvv1.setText(new String(ch, start, length));
				start2=1;
				
			}
			else
			{
		 tvv1.setText(tvv1.getText()+"-" + new String(ch, start, length));
		 }
			salary = false;
		}
		if (salary1) {
			//tv.setText(tv.getText()+"\n Salary : " + new String(ch, start, length));
			if(start3==0)
			{
				tvv2.setText(new String(ch, start, length));
				start3=1;
				
			}
			else
			{
		 tvv2.setText(tvv2.getText()+"-" + new String(ch, start, length));
		 }
			///tvv2.setText(tvv2.getText()+"-" + new String(ch, start, length));
			salary1 = false;
			}
		}
		};

		InputStream is = getAssets().open("mineral_lease_m.xml");
		saxParser.parse(is, handler);
		} catch (Exception e) {e.printStackTrace();}

	String Str=tvv.getText().toString();
	String Str1=tvv1.getText().toString();
	String Str2=tvv2.getText().toString();
	int h=0,h1=0,h2=0;
	for (String retval: Str.split("-", 0)){
	    //System.out.println(retval);
		//tv1[h]=retval;
		h++;
	 }
	for (String retval: Str1.split("-", 0)){
	    //System.out.println(retval);
		//tv1[h]=retval;
		h1++;
	 }for (String retval: Str2.split("-", 0)){
		    //System.out.println(retval);
			//tv1[h]=retval;
			h2++;
		 }
	 final String tv1[] =new String[h];
	 final String tv2[] =new String[h1];
	 final String tv3[] =new String[h2];
	 final String tvl1[] =new String[h];
	 final String tvl2[] =new String[h1];
	 final String tvl3[] =new String[h2];
	
		 h=0;
	 for (String retval: Str.split("-", 0)){
	     //System.out.println(retval);
	 	tv1[h]="Mineral              " +
	 		   
	 		   	retval;
	 	tvl1[h]=retval;
	 	h++;
	  }

	 h=0;
	 for (String retval: Str1.split("-", 0)){
	     //System.out.println(retval);
	 	tv2[h]="No. of Leases         "+retval;
	 	tvl2[h]=retval;
	 	h++;
	  }

	 h=0;
	 for (String retval: Str2.split("-", 0)){
	     //System.out.println(retval);
	 	tv3[h]="Lease Area(in ha)    "+ retval;
	 	tvl3[h]=retval;
	 	h++;
	  }

		 tvv.setVisibility(View.GONE);
	 tvv1.setVisibility(View.GONE);
	 tvv2.setVisibility(View.GONE);
	 tvv3.setVisibility(View.GONE);
	 tvv4.setVisibility(View.GONE);
	 tvv5.setVisibility(View.GONE);
	 tvv6.setVisibility(View.GONE);
	 tvv7.setVisibility(View.GONE);

	 		final int h9=h;
	 		
	 		 ad=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,tv1);
	 		
	 adapter3=new imagecustom_minerals_lease(mineral_mineral_lease.this, tv1, tv2,tv3);
	 lv1.setAdapter(adapter3);
	
	 ArrayAdapter adapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tvl1);
	    
	    tvb1.setAdapter(adapter2);
	    
	 	//dropdown1.setOnItemClickListener(clickb);
	 		//Toast.makeText(getApplicationContext(), dropdown1.getItemAtPosition(dropdown1.getSelectedItemPosition()).toString(),3000).show();
	 		//dropdown1.seto
	 	b1.setOnClickListener(new View.OnClickListener() {
	 			
	 			@Override
	 			public void onClick(View v) {
	 				// TODO Auto-generated method stub
	 			//imagecustom_pin adapter3=new imagecustom_pin(hospitals.this, name1, name2,name3);	
	 				int pos=-1;
	 				int pos1=0;
	 					String serch_str=tvb1.getText().toString();
	 					for(int i=0;i<h9;i++)
	 					{
	 						if(tvl1[i].contains(serch_str.trim()))
	 						{
	 							pos=i;
	 							pos1++;
	 						}
	 					}
	 					if(pos1!=0)
	 					{
	 						final String utt1[]=new String[pos1];
	 						final				String utt2[]=new String[pos1];

	 							final			String utt3[]=new String[pos1];
pos1=0;
	 							for(int i=0;i<h9;i++)
	 							{
	 								if(tvl1[i].contains(serch_str.trim()))
	 								{
	 									pos=i;
	 									utt1[pos1]=tv1[i];
	 									utt2[pos1]=tv2[i];
	 									utt3[pos1]=tv3[i];
	 									pos1++;
	 								}
	 							}
	 							adapter3=new imagecustom_minerals_lease(mineral_mineral_lease.this, utt1, utt2,utt3);
	 							 lv1.setAdapter(adapter3);
	 							
	 					}
	 					else
	 					{
	 					Toast.makeText(getApplicationContext(), "Search Result Not Found", 3000).show();
	 					}

	 			}});
	 	}
}