package com.example.android.musicalstructureapp;

/**
 * Created by Lenovo on 2018-03-26.
 */

public class Sleep {

    private String mArtistNameOfSleep;
    private String mSongNameOfSleep;
    private int mImageAlbumOfSleep;

    public Sleep(String artistNameOfSleep, String songNameOfSleep, int imageAlbumOfSleep) {
        mArtistNameOfSleep = artistNameOfSleep;
        mSongNameOfSleep = songNameOfSleep;
        mImageAlbumOfSleep = imageAlbumOfSleep;
    }

    public String getArtistNameOfSleep() {
        return mArtistNameOfSleep;
    }

    public String getSongNameOfSleep() {
        return mSongNameOfSleep;
    }

    public int getImageAlbumOfSleep() {
        return mImageAlbumOfSleep;
    }
}
