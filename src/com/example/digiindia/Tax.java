package com.example.digiindia;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tax extends Activity {
    //TextView t1,t2,t3,t4;
    Button b,b1;
    EditText e1,e2;
    int mynum;
    int myage;
    TextView t4;
    double tax;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	    WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    setContentView(R.layout.tax_layout);
	    //t1=(TextView) findViewById(R.id.textView1);
	    //t2=(TextView) findViewById(R.id.textView2);
	    //t3=(TextView) findViewById(R.id.textView3);
	    t4=(TextView) findViewById(R.id.textView4);
	    t4.setText("");
	    e1=(EditText) findViewById(R.id.editText1);
	    e2=(EditText) findViewById(R.id.editText2);
	    b=(Button) findViewById(R.id.button1);
	    b1=(Button) findViewById(R.id.button2);
	    
	    b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				//e2.setFocusable(false);
			       String t=e1.getText().toString();
			       mynum=Integer.parseInt(t);
			       t=e2.getText().toString();
			       myage=Integer.parseInt(t);
			       if(myage<60)
			       {
			    	   if(mynum>250000 && mynum<=500000){
			       
				   	     tax=(mynum-250000)*0.1;
						     String t1=Double.toString(tax);
						     t4.setText("The Income Tax Will be"+ t1);
						     //Toast.makeText(getApplicationContext(), , Toast.LENGTH_LONG).show();
					   }
				
				else if(mynum>500000 && mynum<=1000000){
						     tax=25000+(mynum-500000)*0.2;
						     String t1=Double.toString(tax);
						     t4.setText("The Income Tax Will be"+ t1);
						     //Toast.makeText(getApplicationContext(), "The Income Tax Will be"+ t1, Toast.LENGTH_LONG).show();
					   }
				
			  else if(mynum>1000000){
					     tax=100000+25000+(mynum-1000000)*0.3;
					     String t1=Double.toString(tax);
					     t4.setText("The Income Tax Will be"+ t1);
					     //Toast.makeText(getApplicationContext(), "The Income Tax Will be"+ t1, Toast.LENGTH_LONG).show();
				   	}
			  
			  else{
				  Toast.makeText(getApplicationContext(), "The Income Tax N/A", Toast.LENGTH_LONG).show();
			  }
			       }
			       else if(myage<80)
			       {
			    	   if(mynum>300000 && mynum<=500000){
					       
					   	     tax=(mynum-300000)*0.1;
							     String t1=Double.toString(tax);
							     t4.setText("The Income Tax Will be"+ t1);
							     //Toast.makeText(getApplicationContext(), , Toast.LENGTH_LONG).show();
						   }
					
					else if(mynum>500000 && mynum<=1000000){
							     tax=20000+(mynum-500000)*0.2;
							     String t1=Double.toString(tax);
							     t4.setText("The Income Tax Will be"+ t1);
							     //Toast.makeText(getApplicationContext(), "The Income Tax Will be"+ t1, Toast.LENGTH_LONG).show();
						   }
					
				  else if(mynum>1000000){
						     tax=100000+20000+(mynum-1000000)*0.3;
						     String t1=Double.toString(tax);
						     t4.setText("The Income Tax Will be"+ t1);
						     //Toast.makeText(getApplicationContext(), "The Income Tax Will be"+ t1, Toast.LENGTH_LONG).show();
					   	}
				  
				  else{
					  Toast.makeText(getApplicationContext(), "The Income Tax N/A", Toast.LENGTH_LONG).show();
				  } 
			       }

			       else if(myage>=80)
			       {
					
					 if(mynum>500000 && mynum<=1000000){
							     tax=(mynum-500000)*0.2;
							     String t1=Double.toString(tax);
							     t4.setText("The Income Tax Will be"+ t1);
							     //Toast.makeText(getApplicationContext(), "The Income Tax Will be"+ t1, Toast.LENGTH_LONG).show();
						   }
					
				  else if(mynum>1000000){
						     tax=100000+(mynum-1000000)*0.3;
						     String t1=Double.toString(tax);
						     t4.setText("The Income Tax Will be"+ t1);
						     //Toast.makeText(getApplicationContext(), "The Income Tax Will be"+ t1, Toast.LENGTH_LONG).show();
					   	}
				  
				  else{
					  Toast.makeText(getApplicationContext(), "The Income Tax N/A", Toast.LENGTH_LONG).show();
				  } 
			       }
			       
			}
		});
	    b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				e1.setText(null);
				e2.setText(null);
				t4.setText(null);
			}
		});
}}
