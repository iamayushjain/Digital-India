package com.example.digiindia;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class AdharScan extends Activity {

	static final String ACTION_SCAN = "com.google.zxing.client.android.SCAN";

	Button b1,b2,b3;
	EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;
	SQLiteDatabase db;
	String details;
	int n=0;
	Cursor c;
	String name,fname,pc,state,comadd,id,user;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	    WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    setContentView(R.layout.fragment_signup);

		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		e3=(EditText)findViewById(R.id.editText3);
		e4=(EditText)findViewById(R.id.editText4);
		e5=(EditText)findViewById(R.id.editText5);
		e6=(EditText)findViewById(R.id.editText6);
		e7=(EditText)findViewById(R.id.editText7);
		e8 = (EditText)findViewById(R.id.editText8);
		//e9 = (EditText)findViewById(R.id.editText9);
		
		//b2=(Button)findViewById(R.id.button1);
		//b3=(Button)findViewById(R.id.button3);
		//b1=(Button)findViewById(R.id.button2);
	//final String name="hell";//=e1.getText().toString();
	 //final String pass="hell";//=e2.getText().toString();
				//startActivity(new Intent(getApplicationContext(),Barcode.class));
				try {
					//start the scanning activity from the com.google.zxing.client.android.SCAN intent
					Intent intent = new Intent(ACTION_SCAN);
					intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
					startActivityForResult(intent, 0);
				} catch (ActivityNotFoundException anfe) {
					//on catch, show the download dialog
					showDialog(AdharScan.this, "No Scanner Found", "Download a scanner code activity?", "Yes", "No").show();
				}

			}
		
	public void scanQR(View v) {
		try {
			//start the scanning activity from the com.google.zxing.client.android.SCAN intent
			Intent intent = new Intent(ACTION_SCAN);
			intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
			startActivityForResult(intent, 0);
		} catch (ActivityNotFoundException anfe) {
			//on catch, show the download dialog
			showDialog(AdharScan.this, "No Scanner Found", "Download a scanner code activity?", "Yes", "No").show();
		}
	}

	//alert dialog for downloadDialog
	private static AlertDialog showDialog(final Activity act, CharSequence title, CharSequence message, CharSequence buttonYes, CharSequence buttonNo) {
		AlertDialog.Builder downloadDialog = new AlertDialog.Builder(act);
		downloadDialog.setTitle(title);
		downloadDialog.setMessage(message);
		downloadDialog.setPositiveButton(buttonYes, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialogInterface, int i) {
				Uri uri = Uri.parse("market://search?q=pname:" + "com.google.zxing.client.android");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				try {
					act.startActivity(intent);
				} catch (ActivityNotFoundException anfe) {

				}
			}
		});
		downloadDialog.setNegativeButton(buttonNo, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialogInterface, int i) {
			}
		});
		return downloadDialog.show();
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		if (requestCode == 0) {
			if (resultCode == RESULT_OK) {
				//get the extras that are returned from the intent
				String contents = intent.getStringExtra("SCAN_RESULT");
				String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
				//Toast.makeText(this, "Content:" + contents , Toast.LENGTH_LONG).show();
				int pos1=contents.indexOf("uid=");
				pos1=pos1+5;
				String id;
				TextView t;
			//	t=(TextView)findViewById(R.id.textView1);
				id="";
			     //id=contents.substring(pos1, pos1+12);
			     while(contents.charAt(pos1)!='"')
			     {
			    	 id=id+contents.charAt(pos1);
			    	 pos1++;
			    	 
			     }
			     name=id;
			     e1.setText(id);
				    
			     pos1=contents.indexOf("name=");
				 pos1=pos1+6;
					id="";
				     //id=contents.substring(pos1, pos1+12);
				     while(contents.charAt(pos1)!='"')
				     {
				    	 id=id+contents.charAt(pos1);
				    	 pos1++;
				    	 
				     } 
				      user=id; 
			    e2.setText(id);
			    
			     pos1=contents.indexOf("co=");
				 pos1=pos1+4;
					id="";
				     //id=contents.substring(pos1, pos1+12);
				     while(contents.charAt(pos1)!='"')
				     {
				    	 id=id+contents.charAt(pos1);
				    	 pos1++;
				    	 
				     }
				     fname=id;
			    e7.setText(id);
			    
			     pos1=contents.indexOf("house=");
				 pos1=pos1+7;
					id="";
				     //id=contents.substring(pos1, pos1+12);
				     while(contents.charAt(pos1)!='"')
				     {
				    	 id=id+contents.charAt(pos1);
				    	 pos1++;
				    	 
				     }
				    String add=id;
			    e3.setText(id);
			    pos1=contents.indexOf("street=");
				 pos1=pos1+8;
					id="";
				     //id=contents.substring(pos1, pos1+12);
				     while(contents.charAt(pos1)!='"')
				     {
				    	 id=id+contents.charAt(pos1);
				    	 pos1++;
				    	 
				     }
				     add=add + id;
			    e4.setText(id);
			    pos1=contents.indexOf("dist=");
				 pos1=pos1+6;
					id="";
				     //id=contents.substring(pos1, pos1+12);
				     while(contents.charAt(pos1)!='"')
				     {
				    	 id=id+contents.charAt(pos1);
				    	 pos1++;
				    	 
				     }
				     add=add+id;
				      comadd=add;
			    e5.setText(id);
			    pos1=contents.indexOf("state=");
				 pos1=pos1+7;
					id="";
				     //id=contents.substring(pos1, pos1+1);
				     while(contents.charAt(pos1)!='"')
				     {
				    	 id=id+contents.charAt(pos1);
				    	 pos1++;
				    	 
				     }
				     state=id;
			    e6.setText(id);
			    pos1=contents.indexOf("pc=");
				 pos1=pos1+4;
					id="";
				     //id=contents.substring(pos1, pos1+12);
				     while(contents.charAt(pos1)!='"')
				     {
				    	 id=id+contents.charAt(pos1);
				    	 pos1++;
				    	 
				     }
				     pc=id;
			    e8.setText(id);
			    details="Aadhar No."+e1.getText().toString()+"\nName:"+e2.getText().toString()+"\nCO:"+e3.getText().toString()+"\nHouse:"+e4.getText().toString()+"\nStreet:"+e5.getText().toString()+"\nDistrict:"+e6.getText().toString()+"\nState"+e7.getText().toString()+"\nPincode:"+e8.getText().toString();
			    ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE); 
			    ClipData clip = ClipData.newPlainText("label", details);
			    clipboard.setPrimaryClip(clip);
			    /*try {
			    	db.execSQL("insert into login (username,address,fathers_name,state,pincode)values('"+user+"','"+comadd+"','"+fname+"','"+state+"','"+pc+"')");
				} catch (Exception e) {
					// TODO: handle exception
				}*/
				
				//toast.show();
			}
		}
	}



	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_signup,
					container, false);
			return rootView;
		}
	}

}
