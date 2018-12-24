package com.github.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void playMp4(String name) {
        System.out.println("play mp4 " + name);
    }

}
