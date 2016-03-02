package com.mobileappsco.training.day6;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView1;
    public static String[] eatFoodyImages = {
            "http://i.imgur.com/rFLNqWI.jpg",
            "http://i.imgur.com/C9pBVt7.jpg",
            "http://i.imgur.com/rT5vXE1.jpg",
            "http://i.imgur.com/aIy5R2k.jpg",
            "http://i.imgur.com/MoJs9pT.jpg",
            "http://i.imgur.com/S963yEM.jpg",
            "http://i.imgur.com/rLR2cyc.jpg",
            "http://i.imgur.com/SEPdUIx.jpg",
            "http://i.imgur.com/aC9OjaM.jpg",
            "http://i.imgur.com/76Jfv9b.jpg",
            "http://i.imgur.com/fUX7EIB.jpg",
            "http://i.imgur.com/syELajx.jpg",
            "http://i.imgur.com/COzBnru.jpg",
            "http://i.imgur.com/Z3QjilA.jpg",
    };

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

            //listView1.setAdapter(new ImageListAdapter(this, eatFoodyImages));

        } catch (Exception e) {
            Log.e("MYAPP", "Error reading string arrays >> "+e.getMessage());
        }

    }

}
