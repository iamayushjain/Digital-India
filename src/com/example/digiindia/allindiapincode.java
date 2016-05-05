package com.example.digiindia;


import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class allindiapincode extends Activity  implements OnItemSelectedListener{
	String category[]={"Search By Pincode","Search by District"};
	//String distct[]={"All","KLD"};
	Spinner dropdown2;
	ListView lv1;
	TextView tvv,tvv1,tvv2;
	String name1[],name2[],name3[];
	int start1=0,start2=0,start3=0;
	int get_pos=0;
	EditText et1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	    WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    setContentView(R.layout.allindialayout);
		Spinner dropdown1=(Spinner)findViewById(R.id.spinner1);
		ArrayAdapter<String> adapter1 =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,category);
		dropdown2=(Spinner)findViewById(R.id.spinner2);
		dropdown1.setOnItemSelectedListener(this);
		lv1=(ListView)findViewById(R.id.listView1);
		dropdown1.setAdapter(adapter1);
		//dropdown1.setOnItemClickListener(clickb);
		tvv=(TextView)findViewById(R.id.textView1);
		et1=(EditText)findViewById(R.id.editText1);
		tvv1=(TextView)findViewById(R.id.textView2);
		tvv2=(TextView)findViewById(R.id.textView3);
		dropdown2.setVisibility(View.GONE);
		
		

try {
SAXParserFactory factory = SAXParserFactory.newInstance();
SAXParser saxParser = factory.newSAXParser();
DefaultHandler handler = new DefaultHandler() {
boolean name = false;
boolean salary = false;
boolean salary1=false;
public void startElement(String uri, String localName,String qName,
Attributes attributes) throws SAXException {
if (qName.equalsIgnoreCase("pincode")) {
name = true;
}
if (qName.equalsIgnoreCase("Districtname")) {
salary = true;
}
if (qName.equalsIgnoreCase("statename")) {
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

}//end of characters
};//end of DefaultHandler

InputStream is = getAssets().open("pincode.xml");
saxParser.parse(is, handler);
} catch (Exception e) {e.printStackTrace();}
//Toast.makeText(getApplicationContext(),tvv.getText().toString(),3000).show();
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

h=0;
for (String retval: Str.split("-", 0)){
    //System.out.println(retval);
	tv1[h]=retval;
	h++;
 }

h=0;
for (String retval: Str1.split("-", 0)){
    //System.out.println(retval);
	tv2[h]=retval;
	h++;
 }

h=0;
for (String retval: Str2.split("-", 0)){
    //System.out.println(retval);
	tv3[h]=retval;
	h++;
 }
tvv.setVisibility(View.GONE);
tvv1.setVisibility(View.GONE);
tvv2.setVisibility(View.GONE);
//ArrayAdapter<String> adapter3 =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,tv3);
//lv1.setAdapter(adapter3);
//ArrayAdapter<String> adapter2 =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,tv1);
//dropdown2.setAdapter(adapter2);
imagecustom_pin adapter3=new imagecustom_pin(allindiapincode.this, tv1, tv2,tv3);
lv1.setAdapter(adapter3);

		name1=tv1;
		
		
		
		final int h4=h;
		
		
		Toast.makeText(getApplicationContext(), dropdown1.getItemAtPosition(dropdown1.getSelectedItemPosition()).toString(),3000).show();
		//dropdown1.seto
		Button b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stubtv
				int pos=-1;
				if(get_pos==0)
				{
					String serch_str=et1.getText().toString();
					for(int i=0;i<h4;i++)
					{
						if(tv1[i].equalsIgnoreCase(serch_str))
						{
							pos=i;
						}
					}
				}
				if(get_pos==1)
				{
					String serch_str=et1.getText().toString();
					for(int i=0;i<h4;i++)
					{
						if(tv2[i].contains(serch_str))
						{
							pos=i;
						}
					}
				}
			
if(pos!=-1)
	{
	String utt1[]={tv1[pos]};
	String utt2[]={tv2[pos]};
	String utt3[]={tv3[pos]};
	imagecustom_pin adapter3=new imagecustom_pin(allindiapincode.this, utt1, utt2,utt3);
	lv1.setAdapter(adapter3);
	}	
else
	{
	Toast.makeText(getApplicationContext(), "Search Result Not Found", 3000).show();
	}
	}
		});
		
	}
	
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		
if(position==0)
{
	get_pos=0;
	
}
else if(position==1)
{
	get_pos=1;
}
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}	}
		
	

