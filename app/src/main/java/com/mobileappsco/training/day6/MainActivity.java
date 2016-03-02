package com.mobileappsco.training.day6;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            listView1=(ListView)findViewById(R.id.listView1);
            Resources res = getResources();
            String[] names = res.getStringArray(R.array.media_names);
            String[] images = res.getStringArray(R.array.media_uris);
            for (int i = 0; i < names.length; i++)
                Log.d("MYAPP", "Name: " + names[i] + "\nImage: " + images[i]);

            CustomListViewAdapter adapter=new CustomListViewAdapter(this, names, images);
            listView1.setAdapter(adapter);

        } catch (Exception e) {
            Log.e("MYAPP", "Error reading string arrays >> "+e.getMessage());
        }

    }

    public void gotoCardsActivity(View view) {
        Intent i = new Intent(this, CardsActivity.class);
        startActivity(i);
    }
}
