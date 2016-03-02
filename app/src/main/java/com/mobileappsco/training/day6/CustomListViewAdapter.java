package com.mobileappsco.training.day6;

/**
 * Created by admin on 3/2/2016.
 */

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class CustomListViewAdapter extends ArrayAdapter<String> {

    private final Context context;
    private LayoutInflater inflater;
    private final String[] itemName;
    private final String[] itemImage;

    public CustomListViewAdapter(Activity context, String[] itemName, String[] itemImage) {
        super(context, R.layout.listview_item, itemName);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemName=itemName;
        this.itemImage=itemImage;
        inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View view, ViewGroup parent) {
        //LayoutInflater inflater= context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_item, null ,false);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.itemName);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.itemIcon);

        txtTitle.setText(itemName[position]);
        //imageView.setImageResource(itemImage[position]);

        Glide.with(context)
                .load(itemImage[position])
                .placeholder(android.R.drawable.ic_menu_gallery)
                .into((ImageView) rowView.findViewById(R.id.itemIcon));

        Log.d("MYAPP", "Image is "+itemImage[position]);
        return rowView;

    };
}
