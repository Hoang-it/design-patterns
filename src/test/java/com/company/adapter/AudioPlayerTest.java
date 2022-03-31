package com.company.adapter;

import com.company.enums.TypeMedia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudioPlayerTest {

    @Test
    void play() {
        AudioPlayer audio = new AudioPlayer();
        audio.play(TypeMedia.MP3.name());
        audio.play(TypeMedia.MP4.name());
        audio.play(TypeMedia.VLC.name());
    }
}