package com.company.adapter;

import com.company.interfaces.AdvanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc() {

    }

    @Override
    public void playMp4() {
        System.out.println("Played from " + this.getClass().getName());
    }
}
