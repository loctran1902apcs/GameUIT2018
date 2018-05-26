package com.example.blu.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicActivity extends AppCompatActivity {

    private final MusicPlayer musicPlayer = new MusicPlayer(this);
    public static final int MEDIA_RES_ID = R.raw.track;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        musicPlayer.loadMedia(MEDIA_RES_ID);

    }
    public void playSong(View v){
        musicPlayer.play();
    }

    public void pauseSong(View v) {
        musicPlayer.pause();
    }

    public void stopSong(View v) {
        musicPlayer.reset();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        musicPlayer.release();
    }
}
