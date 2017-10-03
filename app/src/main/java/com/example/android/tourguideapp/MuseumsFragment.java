package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        //empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Creating the numbers array as a String
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place (getString(R.string.M_Name1), getString(R.string.M_Address1), getString(R.string.M_Descript1)));
        places.add(new Place (getString(R.string.M_Name2), getString(R.string.M_Address2), getString(R.string.M_Descript2)));
        places.add(new Place (getString(R.string.M_Name3), getString(R.string.M_Address3), getString(R.string.M_Descript3)));
        places.add(new Place (getString(R.string.M_Name4), getString(R.string.M_Address4), getString(R.string.M_Descript4)));
        places.add(new Place (getString(R.string.M_Name5), getString(R.string.M_Address5), getString(R.string.M_Descript5)));
        places.add(new Place (getString(R.string.M_Name6), getString(R.string.M_Address6), getString(R.string.M_Descript6)));
        places.add(new Place (getString(R.string.M_Name7), getString(R.string.M_Address7), getString(R.string.M_Descript7)));
        places.add(new Place (getString(R.string.M_Name8), getString(R.string.M_Address8), getString(R.string.M_Descript8)));

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.place_museums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}


