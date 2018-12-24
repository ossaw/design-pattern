package com.github.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String name) {
        System.out.println("plat vlc " + name);
    }

    @Override
    public void playMp4(String name) {
        throw new UnsupportedOperationException();
    }

}
