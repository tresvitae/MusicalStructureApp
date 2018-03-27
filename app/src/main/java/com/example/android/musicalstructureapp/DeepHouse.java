package com.example.android.musicalstructureapp;

public class DeepHouse {

    private String mArtistNameOfDeepHouse;
    private String mSongsNameOfDeepHouse;
    private int mImageAlbumOfDeepHouse;

    /**
     * For display data on particular song
     *
     * @param artistNameOfDeepHouse, songNameOfDeepHouse and imageAlbumOfDeepHouse
     */
    public DeepHouse(String artistNameOfDeepHouse, String songNameOfDeepHouse, int imageAlbumOfDeepHouse) {
        mArtistNameOfDeepHouse = artistNameOfDeepHouse;
        mSongsNameOfDeepHouse = songNameOfDeepHouse;
        mImageAlbumOfDeepHouse = imageAlbumOfDeepHouse;
    }

    /**
     * Get the artist, song name and image albunm.
     */
    public String getmArtistNameOfDeepHouse() {
        return mArtistNameOfDeepHouse;
    }

    public String getmSongsNameOfDeepHouse() {
        return mSongsNameOfDeepHouse;
    }

    public int getmImageAlbumOfDeepHouse() {
        return mImageAlbumOfDeepHouse;
    }
}
