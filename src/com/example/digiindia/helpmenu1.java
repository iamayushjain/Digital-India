package com.example.digiindia;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class helpmenu1 extends Dialog 
{
	public Activity c;
	int pos;
    public helpmenu1(int pos,Activity a) {
		super(a);
		this.c=a;
		this.pos=pos;
		// TODO Auto-generated constructor stub
	}

	/** Called when the activity is first created. */
 
    ListView lview3;
   // ListViewHelp adapter;
    Button b1;
 String rti[]={" Which includes equality before law, prohibition of discrimination on grounds of religion, race, caste, gender or place of birth, and equality of opportunity in matters of employment, abolition of untouchability and abolition of titles.",
		 " Which includes speech and expression, assembly, association or union or cooperatives, movement, residence, and right to practice any profession or occupation (some of these rights are subject to security of the State, friendly relations with foreign countries, public order, decency or morality), right to life and liberty, right to education, protection in respect to conviction in offences and protection against arrest and detention in certain cases.",
		 "Which prohibits all forms of forced labour, child labour and traffic of human beings",
		 "Which includes freedom of conscience and free profession, practice, and propagation of religion, freedom to manage religious affairs, freedom from certain taxes and freedom from religious instructions in certain educational institutes.",
		 "Preserve the right of any section of citizens to conserve their culture, language or script, and right of minorities to establish and administer educational institutions of their choice.",
		 "Which is present for enforcement of Fundamental Rights.",
		 "Which gives the right to live with human dignity. This includes rights such as right to education, health, shelter and basic amenities that the state shall provide."," It is the latest addition to the fundamentals rights.","RTI stands for Right To Information and has been given the status of a fundamental right under Article 19(1) of the Constitution."};
     String desc[] =new String[1];
 
 
   // private static String month[] = {"Developer","Developer","Designer"};
    
    //Integer[] imageId = {
		//      R.drawable.dev1,R.drawable.dev2,R.drawable.dev3
		  //    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.listviewhelp);
        desc[0]=rti[pos];
        lview3 = (ListView) findViewById(R.id.listView1);
      //  adapter = new ListViewHelp(c,desc);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(c,android.R.layout.simple_list_item_1,desc);
		//lv1.setAdapter(adapter);
		
        lview3.setAdapter(adapter);
        b1=(Button)findViewById(R.id.button1);
 b1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	dismiss();	
	}
});
       
    }
 
}

