package com.example.digiindia;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

public class Right_to_informtion extends Activity {
	ListView l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	    WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    
		setContentView(R.layout.fragment_right_to_informtion);
        String head[]={"Right to Equality ","Right to Freedom","Right Against Exploitation","Right to Freedom of Religion","Cultural and Educational Rights","Right to Constitutional Remedies","Right to Life","Right to education","Right to Information"};
		ListView lv1=(ListView)findViewById(R.id.listView1);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,head);
		lv1.setAdapter(adapter);
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				helpmenu1 cdd1=new helpmenu1(arg2,Right_to_informtion.this);
				cdd1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
				cdd1.show();
				Window window = cdd1.getWindow();
				window.setLayout(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
	
			}
		});
	}

	
}
