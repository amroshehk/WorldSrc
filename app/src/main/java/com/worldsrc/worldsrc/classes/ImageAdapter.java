package com.worldsrc.worldsrc.classes;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.content.Context;

import android.view.View;
import android.view.ViewGroup;

import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.worldsrc.worldsrc.R;

/**
 * Created by Amro on 08/07/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
       // final Movie book = books[position];

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.view1, null);
        }

        // 3
        final ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview_cover_art);
        final TextView nameTextView = (TextView)convertView.findViewById(R.id.textview_movie_name);
        final TextView authorTextView = (TextView)convertView.findViewById(R.id.textview_movie_year);
        final ImageView imageViewFavorite = (ImageView)convertView.findViewById(R.id.imageview_favorite);

        // 4
        imageView.setImageResource(R.drawable.london);
         nameTextView.setText("movie batman");
         authorTextView.setText("2017");
       // imageView.setImageResource(book.getImageResource());
       // nameTextView.setText(mContext.getString(book.getName()));
       // authorTextView.setText(mContext.getString(book.getAuthor()));

        return convertView;
//        ImageView imageView;
//
//        if (convertView == null) {
//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);
//        }
//        else
//        {
//            imageView = (ImageView) convertView;
//        }
//        imageView.setImageResource(mThumbIds[position]);
//        return imageView;
    }
//
//    // Keep all Images in array
    public Integer[] mThumbIds = {
            android.R.drawable.btn_default_small,  android.R.drawable.btn_default_small,android.R.drawable.btn_default_small
    };
}
