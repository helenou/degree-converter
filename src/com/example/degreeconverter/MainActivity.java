package com.example.degreeconverter;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private EditText inputTemp;
	int result;
	int inputValue;

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
	public void toFahrenheit(View v) {
		 
			result=0;

			TextView displayResult;
			displayResult = (TextView) findViewById(R.id.conversion);

			inputTemp = (EditText) findViewById(R.id.edittext);
			
			
	  try 	{

		  if (inputTemp.getText().toString() == null)
			{
						inputTemp.setText("0");
			}  

		  inputValue = Integer.parseInt(inputTemp.getText().toString());

	  	}
	  	catch(NumberFormatException e)
	  {
	  		Log.e("NumbExc", "Exception: " + e.toString());
	  }
	  
	  
	  
	  
			// °C to °F	Multiply by 9, then divide by 5, then add 32
			result = inputValue * 9 / 5 + 32;
			//TextView view = (TextView) findViewById(R.id.counter);
			displayResult.setText( inputTemp.getText().toString() + "°C " +"equals to" + " " +String.valueOf(result)+" °F " + " " +"\nChange the digit and tap the desired function above to convert again.");
									}


	public void toCelsius(View v) { 

		result=0;

		TextView displayResult;
		displayResult = (TextView) findViewById(R.id.conversion);

		inputTemp = (EditText) findViewById(R.id.edittext);
		
						
		  try 	{

			  if (inputTemp.getText().toString() == null)
				{
							inputTemp.setText("0");
				}  

			  inputValue = Integer.parseInt(inputTemp.getText().toString());

		  	}
		  	catch(NumberFormatException e)
		  {
		  		Log.e("NumbExc", "Exception: " + e.toString());
		  }
		  

		// °F to °C	Deduct 32, then multiply by 5, then divide by 9
		result = (inputValue-32) * 5 / 9;

		displayResult.setText( inputTemp.getText().toString() + " °F " +"equals to" + " " +String.valueOf(result)+ " °C " +"\nChange the digit and tap the desired function above to convert again.");
							
								}    

}
