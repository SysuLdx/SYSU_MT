package com.example.wujiayi.sysu_mt.View;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wujiayi.sysu_mt.R;
import com.example.wujiayi.sysu_mt.Model.minfoAdapter;
import com.example.wujiayi.sysu_mt.Model.MovieData;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by wujiayi on 17/5/23.
 */
public class Fragment_movie extends ListFragment

{

    private List<com.example.wujiayi.sysu_mt.Model.MovieData> MovieData;
    private minfoAdapter adapter;
    private int ImgId;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MovieData = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ImgId = getDrawResourceID("ic_launcher.png");
            com.example.wujiayi.sysu_mt.Model.MovieData movie = new MovieData(ImgId,"123","123","123");
            MovieData.add(movie);
        }

        adapter = new minfoAdapter(this.getContext(), MovieData);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item1, null);

        this.setListAdapter(adapter);

        return view;
    }

    public int getDrawResourceID(String resourceName) {
        Context context = getContext();
        int id = context.getResources().getIdentifier(resourceName, "drawble", context.getPackageName());
        return id;
    }

}

