package com.company.adapter;

import com.company.interfaces.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc() {
        System.out.println("Played from " + this.getClass().getName());
    }

    @Override
    public void playMp4() {

    }
}
