package com.thoughtworks.ranjukr.listview;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] movies = {"Now you see me", "Ratatouille", "Knowing", "Inception","Harry Potter","Ted","Rio","Zootopia","The Angry Bird"};

        ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,movies);
        ListView view = (ListView) findViewById(R.id.listViewer);
        view.setAdapter(adapter);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String moviePicked = "You have choosen " + String.valueOf(parent.getItemAtPosition(position));

                Toast.makeText(MainActivity.this, moviePicked,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
