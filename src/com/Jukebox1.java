package com;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox1 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    //Создать "внешний" компаратор
    class ArtistCompare implements Comparator<Song> {

        @Override
        public int compare(Song o1, Song o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }

    public void go() {
        getSongs();
        System.out.println(songList);

        //Сортировать методом compareTo из класса Song (по title)
        Collections.sort(songList);
        System.out.println(songList);

        //сортировать внутреним классом ArtistCompare
        Collections.sort(songList, new ArtistCompare());
        System.out.println(songList);
    }

    public void getSongs() {
        try {
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null ) {
                addSong(line);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
