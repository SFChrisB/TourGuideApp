package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays "Food and Drink".
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        //empty public contructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Creating the places array as a String
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place (getString(R.string.R_Name1), getString(R.string.R_Address1), getString(R.string.R_Descript1),
                R.drawable.rpic1));
        places.add(new Place (getString(R.string.R_Name2), getString(R.string.R_Address2), getString(R.string.R_Descript2),
                R.drawable.rpic2));
        places.add(new Place (getString(R.string.R_Name3), getString(R.string.R_Address3), getString(R.string.R_Descript3),
                R.drawable.rpic3));
        places.add(new Place (getString(R.string.R_Name4), getString(R.string.R_Address4), getString(R.string.R_Descript4),
                R.drawable.rpic4));
        places.add(new Place (getString(R.string.R_Name5), getString(R.string.R_Address5), getString(R.string.R_Descript5),
                R.drawable.rpic5));
        places.add(new Place (getString(R.string.R_Name6), getString(R.string.R_Address6), getString(R.string.R_Descript6),
                R.drawable.rpic6));
        places.add(new Place (getString(R.string.R_Name7), getString(R.string.R_Address7), getString(R.string.R_Descript7),
                R.drawable.rpic7));
        places.add(new Place (getString(R.string.R_Name8), getString(R.string.R_Address8), getString(R.string.R_Descript8),
                R.drawable.rpic8));
        places.add(new Place (getString(R.string.R_Name9), getString(R.string.R_Address9), getString(R.string.R_Descript9),
                R.drawable.rpic9));
        places.add(new Place (getString(R.string.R_Name10), getString(R.string.R_Address10), getString(R.string.R_Descript10),
                R.drawable.rpic10));

        // Pictures are copyright of London TimeOut

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.place_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}