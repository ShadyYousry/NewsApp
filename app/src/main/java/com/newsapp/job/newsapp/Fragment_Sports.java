package com.newsapp.job.newsapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shady on 3/9/2018.
 */

public class Fragment_Sports extends Fragment {

    View v;
    private List<Items> items ;
    private RecyclerView my_rec ;

    public Fragment_Sports(){};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.page_sports,container,false);
        my_rec = (RecyclerView) v.findViewById(R.id.rec_spo);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(getContext(),items);
        my_rec.setLayoutManager(new LinearLayoutManager(getActivity()));
        my_rec.setAdapter(recycleViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        items = new ArrayList<>();
        items.add(new Items("first title","this is description in first item",R.drawable.img_news));
        items.add(new Items("second title","this is description in second item",R.drawable.img_news));
        items.add(new Items("Fourth title","this is description in Fourth item",R.drawable.img_news));
        items.add(new Items("Third title","this is description in Third item",R.drawable.img_news));
    }
}
