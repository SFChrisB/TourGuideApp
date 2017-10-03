package com.example.android.tourguideapp;

/**
 * Created by AgiChrisPC on 26/05/2017.
 */

public class Place {
    private String placeName;

    private String placeAddress;

    private String placeDescription;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    //A constant created to signal no image allocated. -1 represents it being out of zone of valid
    //int numbers to be calculated with
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String namePlace, String addressPlace, String descriptPlace) {
        placeName = namePlace;
        placeAddress = addressPlace;
        placeDescription = descriptPlace;
    }


    //Calling the lines that require an image
    public Place(String namePlace, String addressPlace, String descriptPlace, int iResourceID) {
        placeName = namePlace;
        placeAddress = addressPlace;
        placeDescription = descriptPlace;
        mImageResourceID = iResourceID;
    }

    //Get the name of the place
    public String getPlaceName() {
        return placeName;
    }

    //Get the address of the place
    public String getPlaceAddress() {
        return placeAddress;
    }

    //Get the description of the place
    public String getPlaceDescription() {
        return placeDescription;
    }

    //Get the Image ID Resource for the word
    public int getImageResourceID() {
        return mImageResourceID;
    }

    //returns true if there is an image and false if there isn't
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

}