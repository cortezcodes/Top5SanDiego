package com.example.android.top5sandiego;

/**
 * Class model that holds all information about each location in each fragment
 */
public class Location {
    private String mRank;
    private String mName;
    private int mImageSource;
    private String mUrl;

    /**
     * Constructor if the location does not have a corresponding website (mUrl = null)
     * @param rank String resource of the ranking number of this location
     * @param name Name of the location
     * @param imageSource Image Resource information
     */
    public Location(String rank, String name, int imageSource){
        mRank = rank;
        mName = name;
        mImageSource = imageSource;
        mUrl = null;
    }

    /**
     * Constructor if the location has a corresponding website
     * @param rank rank of the location in comparison to the other locations on its list
     * @param name Name of the location
     * @param imageSource Image Resource information
     */
    public Location(String rank, String name, int imageSource, String url){
        mRank = rank;
        mName = name;
        mImageSource = imageSource;
        mUrl = url;
    }

    /**
     * Retrieves the mRank variable
     * @return int mRank
     */
    public String getRank() {
        return mRank;
    }

    /**
     * Retrieves the mName variable
     * @return int mName
     */
    public String getName() {
        return mName;
    }

    /**
     * Retrieves the mImageSource variable
     * @return int mImageSource
     */
    public int getImageSource() {
        return mImageSource;
    }

    /**
     * Retrieves the mUrl variable
     * @return int mUrl
     */
    public String getUrl() {
        return mUrl;
    }
}
