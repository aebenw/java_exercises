package LinkedListChallenge;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Songs song1 = new Songs(420, "blazed");
        Songs song2 = new Songs(420, "confused");
        Songs song3 = new Songs(420, "hungry");

        LinkedList<Songs> firstSet = new LinkedList<Songs>();
        firstSet.add(song1);
        firstSet.add(song2);
        firstSet.add(song3);


        Album album1 = new Album("smokey the bear");
        Album album2 = new Album("riff raff");
        album1.setSongs(firstSet);
        Album.getAllAlbums();
        PlayList myPlaylist = new PlayList("Eben");
        myPlaylist.addAlbum("smokey the bear");
//        System.out.println(album1.getSongs());
//        Songs selected = album1.getSong("blazed");
//        System.out.println(selected.getTitle());



    }
}
