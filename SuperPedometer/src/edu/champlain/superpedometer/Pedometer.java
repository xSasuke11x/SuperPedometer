package edu.champlain.superpedometer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Pedometer extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedometer);

        final ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
    	toggle.setOnClickListener(new OnClickListener() {
    		public void onClick(View v) {
    			Toast.makeText(getBaseContext(),
    			"Pedometer is "+toggle.getText().toString(),
   				Toast.LENGTH_LONG).show();
   	        }
   	    });
	}
}