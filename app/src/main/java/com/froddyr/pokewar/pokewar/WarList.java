package com.froddyr.pokewar.pokewar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class WarList extends Activity {

    private WarItemAdapter theAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war_list);

        ArrayList<WarItem> test = new ArrayList<WarItem>();

        for (int i = 0; i < 30; i++) {
            WarItem item = new WarItem("Frode Dyrseth ( " + (i + 1) + " )");
            item.setMyTimeRemaining((int) (Math.random() * 10000));
            item.setOponentTimeRemaining((int) (Math.random() * 10000));
            test.add(item);
        }

        theAdapter = new WarItemAdapter(this, test);
        ListView theListView = (ListView) findViewById(R.id.war_list);
        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(WarList.this, "You poked " + ((WarItem) parent.getItemAtPosition(position)).getOponentName(), Toast.LENGTH_SHORT).show();
                //System.out.println(String.valueOf(((WarItem) parent.getItemAtPosition(position)).getOponentName()));
                System.out.println("Test");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.war_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
