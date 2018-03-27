package com.example.android.musicalstructureapp;

/**
 * Created by Lenovo on 2018-03-26.
 */

public class Party {

    private String mArtistNameOfParty;
    private String mSongNameOfParty;
    private int mImageAlbumOfParty;

    public Party(String artistNameOfParty, String songNameOfParty, int imageAlbumOfParty) {
        mArtistNameOfParty = artistNameOfParty;
        mSongNameOfParty = songNameOfParty;
        mImageAlbumOfParty = imageAlbumOfParty;
    }

    public String getArtistNameOfParty() {
        return mArtistNameOfParty;
    }

    public String getSongNameOfParty() {
        return mSongNameOfParty;
    }

    public int getImageAlbumOfParty() {
        return mImageAlbumOfParty;
    }
}
