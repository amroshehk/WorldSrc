package com.worldsrc.worldsrc.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.worldsrc.worldsrc.R;
import com.worldsrc.worldsrc.classes.RecyclerAPKAdapter;
import com.worldsrc.worldsrc.classes.RecyclerMovieAdapter;

/**
 * Created by Amro on 08/07/2017.
 */

public class Tab4hotapk extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab4hotapk, container, false);
        recyclerView=(RecyclerView)rootView.findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerAPKAdapter();
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
