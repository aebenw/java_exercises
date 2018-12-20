package InterfaceIntro.InnerClass;

import java.util.ArrayList;
import java.util.ListIterator;

public class Album {
//    private String name;
//    private Album.SongList songList;
//
//
//    public Album(String name) {
//        this.name = name;
////        SongList albumSongs = new SongList();
////        this.songList = albumSongs;
//    }
//
//    public Album(Album.SongList songList) {
//        this.name = name;
//        this.songList = songList;
//
//    }
//
//    public void setSongList(SongList songList) {
//        this.songList = songList;
//    }
//
//    public ArrayList<Song> getSongList() {
//        System.out.println("in song list getter");
//        ArrayList<Song> trackList = this.songList.getSongs();
//        for(int i = 0; i < trackList.size(); i++){
//            System.out.println(trackList.get(i).getTitle());
//        }
//
//        System.out.println();
//        return trackList;
//    }
//
//    public class SongList {
//        private ArrayList<Song> songs = new ArrayList<>();
//
//        public void addSong(Song song){
//            this.songs.add(song);
//        }
//
//        public Song findSong(String title){
////            ListIterator<Song> songListIterator = this.songs.listIterator();
//            for(Song song : this.songs){
//                if(song.getTitle() == title){
//                    return song;
//                }
//            }
//            return null;
//        }
//
//        public ArrayList<Song> getSongs() {
//            return songs;
//        }
//    }
//

    private String name;
    private SongList songList;


    public Album(String name) {
        this.name = name;
        SongList albumSongs = new SongList();
        this.songList = albumSongs;
    }

    public Album(Album.SongList songList) {
        this.name = name;
        this.songList = songList;

    }

    public void addSong(Song song){
        this.songList.addSong(song);
    }

    public void setSongList(SongList songList) {
        this.songList = songList;
    }

    public ArrayList<Song> getSongList() {
        System.out.println("in song list getter");
        ArrayList<Song> trackList = this.songList.getSongs();
        for(int i = 0; i < trackList.size(); i++){
            System.out.println(trackList.get(i).getTitle());
        }

        System.out.println();
        return trackList;
    }

    public class SongList {
        private ArrayList<Song> songs = new ArrayList<>();

        public void addSong(Song song){
            this.songs.add(song);
        }

        public Song findSong(String title){
//            ListIterator<Song> songListIterator = this.songs.listIterator();
            for(Song song : this.songs){
                if(song.getTitle() == title){
                    return song;
                }
            }
            return null;
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }
    }



}
