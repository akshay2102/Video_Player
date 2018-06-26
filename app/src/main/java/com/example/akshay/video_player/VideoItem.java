package com.example.akshay.video_player;

import android.graphics.Bitmap;

/**
 * Created by akshay on 10-03-2018.
 */

public class VideoItem {
    public Bitmap icon;
    public String title;

    public VideoItem(Bitmap icon, String title) {
        this.icon = icon;
        this.title = title;
    }
}
