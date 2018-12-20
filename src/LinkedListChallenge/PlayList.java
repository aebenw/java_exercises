package LinkedListChallenge;

import java.util.LinkedList;
import java.util.ListIterator;

public class PlayList {
    private LinkedList<Songs> songs = new LinkedList<>();
    private LinkedList<Album> albums = new LinkedList<>();
    private String title;

    public PlayList(String title) {
        this.title = title;
    }

    public void addAlbum(String album){
        Album selected = Album.getSpecific(album);
        System.out.println(selected.toString());
        this.albums.add(selected);
        this.songs.addAll(selected.getSongs());
    }

    public void addSong(Songs song){
        this.songs.add(song);
        System.out.println(this.songs);
    }

    private void removeSong(Songs song){
        this.songs.remove(song);
    }

    private void removeAlbum(Album album){
        this.albums.remove(album);
        LinkedList<Songs> songsOnAlbum = album.getSongs();
        ListIterator<Songs> albumSongsListIterator = songsOnAlbum.listIterator();

        while (albumSongsListIterator.hasNext()){
            Songs current = albumSongsListIterator.next();
            this.songs.remove(current);
        }
    }
}
