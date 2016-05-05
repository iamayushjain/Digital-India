package com.example.digiindia;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainSecond extends Activity implements OnItemSelectedListener{
    Spinner sp;
    GraphView graph;
    String Path[]={"Coal","Manganese Ore","Bauxite","Iron Ore","Copper Ore","Dolomite","Limestone","Diamond"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	    WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    setContentView(R.layout.fragment_main_second);
		graph = (GraphView) findViewById(R.id.graph);
		sp=(Spinner) findViewById(R.id.spinner1);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>( MainSecond.this,android.R.layout.simple_spinner_item,Path);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setOnItemSelectedListener(this);
		sp.setAdapter(adapter);
	}
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
		graph.refreshDrawableState();
		graph.removeAllSeries();
		switch(arg2)
		{
		case 0:LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
		          new DataPoint(1, 525.11),
		          new DataPoint(3, 555.79),
		          new DataPoint(5,597.26),
		          new DataPoint(7, 678.41),
		          new DataPoint(9, 713.25),
		          new DataPoint(11, 740.74),
		          new DataPoint(13,711.04),
		          new DataPoint(14,711.23 ),
		          new DataPoint(15,774.33)
		          });
				  graph.addSeries(series);
				  
				  break;
		case 1:LineGraphSeries<DataPoint> series1 = new LineGraphSeries<DataPoint>(new DataPoint[] {
		          new DataPoint(1, 4.45),
		          new DataPoint(3,4.25),
		          new DataPoint(5,4.75),
		          new DataPoint(7, 6.74),
		          new DataPoint(9, 7.26),
		          new DataPoint(11,6.07),
		          new DataPoint(13,7.16),
		          new DataPoint(14,6.08),
		          new DataPoint(15,7.06)
		          });
				  graph.addSeries(series1);
				  break;		  
		case 2:LineGraphSeries<DataPoint> series2 = new LineGraphSeries<DataPoint>(new DataPoint[] {
		          new DataPoint(1, 1.93),
		          new DataPoint(3, 1.02),
		          new DataPoint(5,1.96),
		          new DataPoint(7, 5.34),
		          new DataPoint(9, 10.38),
		          new DataPoint(11,10.57),
		          new DataPoint(13,6.16),
		          new DataPoint(14,8.13),
		          new DataPoint(15,8.22)
		          });
				  graph.addSeries(series2);
				  break;		  
		case 3:LineGraphSeries<DataPoint> series3 = new LineGraphSeries<DataPoint>(new DataPoint[] {
		          new DataPoint(1, 2.16),
		          new DataPoint(3, 4.64),
		          new DataPoint(5,12.12),
		          new DataPoint(7, 22.56),
		          new DataPoint(9, 4.12),
		          new DataPoint(11,10.58),
		          new DataPoint(13,17.62),
		          new DataPoint(14,12.37 ),
		          new DataPoint(15,14.21)
		          });
		
				  graph.addSeries(series3);
				  break;		  
		case 4:LineGraphSeries<DataPoint> series4 = new LineGraphSeries<DataPoint>(new DataPoint[] {
		          new DataPoint(1, 20.52),
		          new DataPoint(3,17.06),
		          new DataPoint(5,22.70),
		          new DataPoint(7, 21.93),
		          new DataPoint(9, 20.74),
		          new DataPoint(11,19.76),
		          new DataPoint(13,22.34),
		          new DataPoint(14,20.83),
		          new DataPoint(15,22.57)
		          });
				  graph.addSeries(series4);
				  break;		  
		case 5:LineGraphSeries<DataPoint> series5 = new LineGraphSeries<DataPoint>(new DataPoint[] {
		          new DataPoint(1, 1.38),
		          new DataPoint(3,1.29),
		          new DataPoint(5,1.67),
		          new DataPoint(7, 1.92),
		          new DataPoint(9, 1.99),
		          new DataPoint(11,2.77),
		          new DataPoint(13,2.80),
		          new DataPoint(14,4.60),
		          new DataPoint(15,5.85)
		          });
				  graph.addSeries(series5);
				  break;		  		 
		case 6:LineGraphSeries<DataPoint> series6 = new LineGraphSeries<DataPoint>(new DataPoint[] {
		          new DataPoint(1,269.55),
		          new DataPoint(3,252.74),
		          new DataPoint(5,284.11),
		          new DataPoint(7, 288.00),
		          new DataPoint(9,305.65),
		          new DataPoint(11,289.67),
		          new DataPoint(13,332.76),
		          new DataPoint(14,340.72),
		          new DataPoint(15,339.42)
		          });
				  graph.addSeries(series6);
				  break;		  
		case 7:LineGraphSeries<DataPoint> series7 = new LineGraphSeries<DataPoint>(new DataPoint[] {
		          new DataPoint(1, 783.16),
		          new DataPoint(3,441.70),
		          new DataPoint(5,21.80),
		          new DataPoint(7, 5.86),
		          new DataPoint(9, 5.36),
		          new DataPoint(11,168.91),
		          new DataPoint(13,112.22),
		          new DataPoint(14,184.90),
		          new DataPoint(15,319.89)
		          });
				  graph.addSeries(series7);
				  break;		  		  
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
}
