package com.example.akshay.video_player;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        String path = getIntent().getExtras().getString("path");
        if(path!=null && !path.isEmpty()){
            VideoView videoView = (VideoView) findViewById(R.id.videoView);
            android.widget.MediaController m = new android.widget.MediaController(this);
            m.setAnchorView(videoView);
            videoView.setMediaController(m);
            videoView.setVideoURI(Uri.parse(path));
            videoView.requestFocus();
            videoView.start();
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    finish();
                }
            });
        }
    }
}
