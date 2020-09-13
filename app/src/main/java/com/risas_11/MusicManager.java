package com.risas_11;

import android.content.Context;
import android.media.MediaPlayer;

public class MusicManager {
    private static MusicManager mInstance;
    private MediaPlayer mMediaPlayer;

    private MusicManager() {
    }
    public static MusicManager getInstance() {
        if (mInstance == null) {
            mInstance = new MusicManager();
        }
        return mInstance;
    }
    public synchronized void play(final Context context, final int soundResourceId) {
        mMediaPlayer = MediaPlayer.create(context.getApplicationContext(), soundResourceId);
        mMediaPlayer.start();
    }
}
