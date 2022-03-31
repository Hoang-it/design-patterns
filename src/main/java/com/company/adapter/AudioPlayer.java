package com.company.adapter;

import com.company.enums.TypeMedia;
import com.company.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    public MediaAdapter mediaAdapter;
    @Override
    public void play(String type) {
        if (TypeMedia.MP3.name().equals(type)) System.out.println("File played with default");
        if (TypeMedia.MP4.name().equals(type)) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type);
        }
        if (TypeMedia.VLC.name().equals(type)) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type);
        }
    }
}
