package com.example.android.miwok;

import android.media.MediaPlayer;
import android.widget.ListView;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public int mSongId;

    private int mImageResourceId = NO_DATA_PROVIDED;
    private static final int NO_DATA_PROVIDED = -1;



    public Word (String defaultTranslation, String miwokTranslation, int songId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSongId = songId;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int songId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSongId = songId;
    }

    public String getDefaultTranslation() {
        return  mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_DATA_PROVIDED;
    }

    public int getAudioResourceId() {
        return mSongId;
    }

}
