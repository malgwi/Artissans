package com.wess58.artissans.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wess58.artissans.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArtFeedFragment extends Fragment {


    public ArtFeedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_art_feed, container, false);
    }

}
