package com.example.djp217.cse214secondtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cse214 = (Button) findViewById(R.id.CSE214);
        cse214.setOnClickListener(new View.OnClickListener() {
            //Show an output message when the button is clicked
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();
            }
        };

        EditText username = (EditText) findViewById(R.id.username);
        username.setOnEditorActionListener(new TextView.OnEditorActionListener()

            {
                @Override
                public boolean onEditorAction (TextView v,int actionId, KeyEvent event){
                Toast.makeText(MainActivity.this, "Changing username", Toast.LENGTH_LONG).show();
                    return true;
            }
            };

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View v){
                Toast.makeText(MainActivity.this, "Rating chosen", Toast.LENGTH_LONG).show();
            }
            };

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause() {
        Log.e("CSE214", "OnPause");
        super.onPause();
    }

    @Override
    protected void onStart() {
        Log.e("CSE214", "OnStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("CSE214", "OnResume");
        super.onResume();
    }

    }
}
