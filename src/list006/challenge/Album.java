package list006.challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.name = title;
        this.artist = artist;
        this.songs = new ArrayList<Song>(); // 可以不用song,會自行推斷
    }

    public boolean addSong(String title, double duration) {
        Song newSong = new Song(title, duration);

        var song = findSong(title);
        if (song != null) {
            if (song.getTitle().equals(title)) {
                return false;
            }
        }

        songs.add(newSong);
        return true;
    }

    private Song findSong(String title) {
        if (songs.isEmpty()) {
            return null;
        }
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if (trackNumber > 0 && trackNumber < songs.size()) {
            playList.add(songs.get(trackNumber));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        var song = findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }

}
