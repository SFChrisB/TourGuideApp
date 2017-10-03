package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AgiChrisPC on 26/05/2017.
 */


public class PlaceAdapter extends ArrayAdapter<Place> {

    private int colorResourceID;

    public PlaceAdapter(Activity context, ArrayList<Place> words, int cResourceID) {

        super(context, 0, words);
        this.colorResourceID = cResourceID;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getPlaceName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentPlace.getPlaceAddress());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.desc_text_view);
        descTextView.setText(currentPlace.getPlaceDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceID());

            //needed as the previous image may have been a hidden image and would still have the GONE visibility state
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceID);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}