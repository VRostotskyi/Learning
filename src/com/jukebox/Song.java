package com.jukebox;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private String rating;
    private String bpm;

    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    @Override
    public boolean equals(Object obj) {
        Song s = (Song) obj;
        return getTitle().equals(s.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString() {
//        return artist + ": " + title;
        return title;
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.getTitle());
    }
}