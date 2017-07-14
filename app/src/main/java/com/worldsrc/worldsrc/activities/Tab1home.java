package com.worldsrc.worldsrc.activities;

/**
 * Created by Amro on 08/07/2017.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.worldsrc.worldsrc.R;
import com.worldsrc.worldsrc.classes.ImageAdapter;

public class Tab1home extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1home, container, false);
        GridView gridview = (GridView) rootView.findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(rootView.getContext()));


        GridView gridview2 = (GridView) rootView.findViewById(R.id.gridview2);
        gridview2.setAdapter(new ImageAdapter(rootView.getContext()));

        GridView gridview3 = (GridView) rootView.findViewById(R.id.gridview3);
        gridview3.setAdapter(new ImageAdapter(rootView.getContext()));


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
//                Book book = books[position];
//                book.toggleFavorite();
//
//                // This tells the GridView to redraw itself
//                // in turn calling your BooksAdapter's getView method again for each cell
//                booksAdapter.notifyDataSetChanged();

                Toast.makeText(getContext(),position+"",Toast.LENGTH_SHORT).show();
            }
        });

        gridview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
//                Book book = books[position];
//                book.toggleFavorite();
//
//                // This tells the GridView to redraw itself
//                // in turn calling your BooksAdapter's getView method again for each cell
//                booksAdapter.notifyDataSetChanged();

                Toast.makeText(getContext(),position+"",Toast.LENGTH_SHORT).show();
            }
        });

        gridview3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
//                Book book = books[position];
//                book.toggleFavorite();
//
//                // This tells the GridView to redraw itself
//                // in turn calling your BooksAdapter's getView method again for each cell
//                booksAdapter.notifyDataSetChanged();

                Toast.makeText(getContext(),position+"",Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
