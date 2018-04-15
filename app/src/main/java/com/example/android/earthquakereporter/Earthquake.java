package com.example.android.earthquakereporter;

public class Earthquake {
    /** Magnitude of the earthquake */
    private String mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Date of the earthquake */
    private String mDate;


    /**
     * Constructs a new {Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param date is the date when the earthquake happened
     */
    public Earthquake(String magnitude, String location,String date ) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate= date;
    }


    /**
     * Returns the magnitude of the earthquake.
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getDate() {
        return mDate;
    }
}

