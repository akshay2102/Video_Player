package com.example.akshay.video_player;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by akshay on 10-03-2018.
 */

public class VideoAdapter extends ArrayAdapter<VideoItem>{

    private Context context;
    private int layoutResourceId;
    private List<VideoItem> data = null;

    public VideoAdapter(@NonNull Context context, int resource, @NonNull List<VideoItem> objects) {
        super(context, resource, objects);
        this.layoutResourceId = resource;
        this.context = context;
        this.data = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId,parent,false);
        }
        ImageView imgIcon = (ImageView)convertView.findViewById(R.id.ivThumbnail);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.tvTitle);

        VideoItem video = data.get(position);
        txtTitle.setText(video.title);
        imgIcon.setImageBitmap(video.icon);
        return convertView;
    }
}

