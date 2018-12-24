package com.github.adapter;

import static com.github.adapter.Const.MP4;
import static com.github.adapter.Const.VLC;;

public class MediaAdapter implements MediaPlayer {
    private final AdvancedMediaPlayer amp;

    public MediaAdapter(String audioType) {
        if (audioType == null)
            throw new NullPointerException();

        if (VLC.equals(audioType))
            amp = new VlcPlayer();
        else if (MP4.equals(audioType))
            amp = new Mp4Player();
        else
            throw new IllegalArgumentException("audioTyoe illegal ...");
    }

    @Override
    public void play(String audioType, String name) {
        if (audioType == null || name == null)
            throw new IllegalArgumentException();

        if (VLC.equals(audioType))
            amp.playVlc(name);
        else if (MP4.equals(audioType))
            amp.playMp4(name);
        else
            System.out.println("not support " + name);
    }
}
