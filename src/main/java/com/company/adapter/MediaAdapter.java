package com.company.adapter;

import com.company.enums.TypeMedia;
import com.company.interfaces.AdvanceMediaPlayer;
import com.company.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    public AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String type){
        if (TypeMedia.MP4.name().equals(type)) advanceMediaPlayer = new Mp4Player();
        if (TypeMedia.VLC.name().equals(type)) advanceMediaPlayer = new VlcPlayer();
    }
    @Override
    public void play(String type) {
        if (TypeMedia.MP4.name().equals(type)) advanceMediaPlayer.playMp4();
        if (TypeMedia.VLC.name().equals(type)) advanceMediaPlayer.playVlc();
    }
}
