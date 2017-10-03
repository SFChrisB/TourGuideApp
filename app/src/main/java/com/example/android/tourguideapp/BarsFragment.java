package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays "Transport".
 */
public class BarsFragment extends Fragment {

    public BarsFragment() {
        //empty public contructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Creating the numbers array as a String
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place (getString(R.string.B_Name1), getString(R.string.B_Address1), getString(R.string.B_Descript1), R.drawable.bpic1));
        places.add(new Place (getString(R.string.B_Name2), getString(R.string.B_Address2), getString(R.string.B_Descript2), R.drawable.bpic2));
        places.add(new Place (getString(R.string.B_Name3), getString(R.string.B_Address3), getString(R.string.B_Descript3), R.drawable.bpic3));
        places.add(new Place (getString(R.string.B_Name4), getString(R.string.B_Address4), getString(R.string.B_Descript4), R.drawable.bpic4));
        places.add(new Place (getString(R.string.B_Name5), getString(R.string.B_Address5), getString(R.string.B_Descript5), R.drawable.bpic5));
        places.add(new Place (getString(R.string.B_Name6), getString(R.string.B_Address6), getString(R.string.B_Descript6), R.drawable.bpic6));

        // Pictures are copyright of London TimeOut

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.place_bars);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
