package com.thoughtworks.ranjukr.nameapp;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button goodButton,badButton;
    private EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        goodButton = (Button) findViewById(R.id.feelingGoodButton);
        badButton = (Button) findViewById(R.id.feelingBadButton);
        userName = (EditText) findViewById(R.id.userName);
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

    public void feelingWell(View view) {
        String name = String.valueOf(userName.getText());

        String yourFeelingResponse = "Hello "+name+", You are feeling well today!";
        Toast.makeText(this,yourFeelingResponse,Toast.LENGTH_SHORT).show();
    }

    public void NotFeelingWell(View view) {
        String name = String.valueOf(userName.getText());

        String yourFeelingResponse = "Hello "+name+", You are not feeling good! Please take rest for today";
        Toast.makeText(this,yourFeelingResponse,Toast.LENGTH_LONG).show();
    }
}
