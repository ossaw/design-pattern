package com.github.adapter;

import static com.github.adapter.Const.MP3;
import static com.github.adapter.Const.MP4;
import static com.github.adapter.Const.VLC;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter adapter;

    @Override
    public void play(String audioType, String name) {
        if (MP3.equals(audioType))
            System.out.println("play mp3 " + name);
        else if (MP4.equals(audioType) || VLC.equals(audioType)) {
            adapter = new MediaAdapter(audioType);
            adapter.play(audioType, name);
        } else
            System.out.println("unsuppotted audio type ...");

    }

}
