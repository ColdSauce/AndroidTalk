package com.stefanaleksic.tickr;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickedTickTock(View v) {
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR);
        TextView tickTockTextView = ((TextView)findViewById(R.id.tickTockTime));
        tickTockTextView.setText(hour + "");
    }
}
