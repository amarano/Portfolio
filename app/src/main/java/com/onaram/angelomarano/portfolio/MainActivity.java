package com.onaram.angelomarano.portfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String formatString = "This button will launch my %s app!";

        Button spotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamerButton);
        spotifyStreamerButton.setOnClickListener(new ClickListener(String.format(formatString, "Spotify Streamer")));

        Button buildItButton = (Button) findViewById(R.id.buildItBiggerButton);
        buildItButton.setOnClickListener(new ClickListener(String.format(formatString, "Build It Bigger")));

        Button scoresButton = (Button) findViewById(R.id.scoresButton);
        scoresButton.setOnClickListener(new ClickListener(String.format(formatString, "Scores")));

        Button libraryButton = (Button) findViewById(R.id.libraryButton);
        libraryButton.setOnClickListener(new ClickListener(String.format(formatString, "Library")));

        Button xyzButton = (Button) findViewById(R.id.xyzButton);
        xyzButton.setOnClickListener(new ClickListener(String.format(formatString, "XYZ Button")));

        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(new ClickListener(String.format(formatString, "Capstone")));

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

    public class ClickListener implements Button.OnClickListener {

        private String toastMessage;

        public ClickListener(String toastMessage){
            this.toastMessage = toastMessage;
        }

        public void onClick(View view){
            Context context = getApplicationContext();
            CharSequence text = toastMessage;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

    }

}
