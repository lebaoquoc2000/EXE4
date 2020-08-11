package com.example.phatnhac1;

import com.example.phatnhac1.model.ZSong;

import java.util.ArrayList;
import java.util.List;


public class SongManager {
    private List<ZSong> songs;

    public SongManager() {
        songs = new ArrayList<>();
    }

    public List<ZSong> getSongs() {
        return songs;
    }

    public void loadSongs() {
        ZSong song = new ZSong();
        song.setPerformer("Martin Garrix & Brooks");
        song.setTitle("Byte");
        song.setSource("Songs/Byte.mp3");
        song.setThumbnail(R.drawable.player);
        songs.add(song);
        song = new ZSong();
        song.setPerformer("徐梦圆");
        song.setTitle("Color-X");
        song.setSource("Songs/color.mp3");
        song.setThumbnail(R.drawable.player);
        songs.add(song);
        song = new ZSong();
        song.setPerformer("Sơn Beat");
        song.setTitle("Freedom");
        song.setSource("Songs/free dom.mp3");
        song.setThumbnail(R.drawable.player);
        songs.add(song);
        song = new ZSong();
        song.setPerformer("Lã. x Duy Phúc x TiB");
        song.setTitle("Hẹn em kiếp sau");
        song.setSource("Songs/hen em kiep sau.mp3");
        song.setThumbnail(R.drawable.player);
        songs.add(song);
    }
}
