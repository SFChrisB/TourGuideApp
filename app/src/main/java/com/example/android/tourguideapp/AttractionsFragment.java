package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays "Sight Seeing".
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        //required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Creating the numbers array as a String
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place (getString(R.string.A_Name1), getString(R.string.A_Address1), getString(R.string.A_Descript1)));
        places.add(new Place (getString(R.string.A_Name2), getString(R.string.A_Address2), getString(R.string.A_Descript2)));
        places.add(new Place (getString(R.string.A_Name3), getString(R.string.A_Address3), getString(R.string.A_Descript3)));
        places.add(new Place (getString(R.string.A_Name4), getString(R.string.A_Address4), getString(R.string.A_Descript4)));
        places.add(new Place (getString(R.string.A_Name5), getString(R.string.A_Address5), getString(R.string.A_Descript5)));
        places.add(new Place (getString(R.string.A_Name6), getString(R.string.A_Address6), getString(R.string.A_Descript6)));
        places.add(new Place (getString(R.string.A_Name7), getString(R.string.A_Address7), getString(R.string.A_Descript7)));
        places.add(new Place (getString(R.string.A_Name8), getString(R.string.A_Address8), getString(R.string.A_Descript8)));
        places.add(new Place (getString(R.string.A_Name9), getString(R.string.A_Address9), getString(R.string.A_Descript9)));
        places.add(new Place (getString(R.string.A_Name10), getString(R.string.A_Address10), getString(R.string.A_Descript10)));
        places.add(new Place (getString(R.string.A_Name11), getString(R.string.A_Address11), getString(R.string.A_Descript11)));
        places.add(new Place (getString(R.string.A_Name12), getString(R.string.A_Address12), getString(R.string.A_Descript12)));
        places.add(new Place (getString(R.string.A_Name13), getString(R.string.A_Address13), getString(R.string.A_Descript13)));
        places.add(new Place (getString(R.string.A_Name14), getString(R.string.A_Address14), getString(R.string.A_Descript14)));

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.place_attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

