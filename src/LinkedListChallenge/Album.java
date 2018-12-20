package LinkedListChallenge;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Album {
    private LinkedList<Songs> songs;
    private String title;
    private static LinkedList<Album> allAlbums = new LinkedList<>();

    public Album(String title) {
        this.title = title;
        allAlbums.add(this);
    }



    public static LinkedList<Album> getAllAlbums(){
        ListIterator<Album> albumListIterator = allAlbums.listIterator();
        while(albumListIterator.hasNext()){
            System.out.println(albumListIterator.next().getTitle());
        }
        return allAlbums;
    }

    public static Album getSpecific(String title){
        ListIterator<Album> albumListIterator = allAlbums.listIterator();
        while(albumListIterator.hasNext()){
            Album current = albumListIterator.next();
            if(current.getTitle() == title){
                return current;
            }
        }
        return null;
    }

    public LinkedList<Songs> getSongs() {
        return songs;
    }

    public void setSongs(LinkedList<Songs> songs) {
        this.songs = songs;
    }

    public String getTitle() {
        return title;
    }


    public Songs getSong(String title){
        ListIterator<Songs> songIterator = this.songs.listIterator();
        while(songIterator.hasNext()){
            Songs current = songIterator.next();
            if(current.getTitle().equals(title)){
                return current;
            }

        }
        return null;
    }
}
