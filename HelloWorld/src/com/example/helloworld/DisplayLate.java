package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.SuppressLint;

public class DisplayLate extends Activity {

    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String message = "Oh my fur and whiskers! I\'m late! I\'m late! For a very important date!";
        message = message + " No time to say hello, GOODBYE! I\'m late, I\'m late, I\'m late!";
       
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        setContentView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
