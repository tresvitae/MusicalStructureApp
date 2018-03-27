package com.example.android.musicalstructureapp;

/**
 * Created by Lenovo on 2018-03-26.
 */

public class Jazz {

    private String mArtistNameOfJazz;
    private String mSongNameOfJazz;
    private int mImageAlbumOfJazz;


    public Jazz(String artistNameOfJazz, String songNameOfJazz, int imageAlbumOfJazz) {
        mArtistNameOfJazz = artistNameOfJazz;
        mSongNameOfJazz = songNameOfJazz;
        mImageAlbumOfJazz = imageAlbumOfJazz;
    }

    public String getmArtistNameOfJazz() {
        return mArtistNameOfJazz;
    }

    public String getmSongNameOfJazz() {
        return mSongNameOfJazz;
    }

    public int getmImageAlbumOfJazz() {
        return mImageAlbumOfJazz;
    }
}

