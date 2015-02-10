package com.vorbisdemo;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class home extends Activity {


//	CoolMicSetting newSetting; 

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        //   newSetting=CoolMicSetting.getInstance();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.home:
                goHome();
                return true;
            // action with ID action_settings was selected
            case R.id.general_setting:
                generalSetting();
                return true;
            case R.id.server_settings:
                serverSetting();
                return true;
            case R.id.audio_settings:
                audioSetting();
                return true;
            default:
                break;
        }

        return true;
    }

    private void goHome() {
        Intent i = new Intent(home.this, MainActivity.class);
        startActivity(i);
    }

    private void generalSetting() {
        Intent i = new Intent(home.this, general.class);
        startActivity(i);
    }

    private void audioSetting() {
        Intent i = new Intent(home.this, audio.class);
        startActivity(i);
    }

    private void serverSetting() {
        Intent i = new Intent(home.this, server.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.home);
        } else {
            setContentView(R.layout.home_landscape);
        }


        // get the action bar
        ActionBar actionBar = getActionBar();

        // Enabling Back navigation on Action Bar icon
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
