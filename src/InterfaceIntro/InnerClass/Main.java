package InterfaceIntro.InnerClass;

import InterfaceIntro.InnerClassGearBox.Button;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
//        Album myAlbum = new Album("the best music");
//        Album.SongList trackListing = myAlbum.new SongList();
//
//        Song firstSong = new Song(300, "hip");
//        Song secondSong = new Song(300, "real nice");
//        Song thirdSong = new Song(300, "very great song");
//        Song fourthSong = new Song(300, "fantastic");
//
//        myAlbum.setSongList(trackListing);
//
//
//        trackListing.addSong(firstSong);
//        trackListing.addSong(secondSong);
//        trackListing.addSong(thirdSong);
//        trackListing.addSong(fourthSong);
//
//
//        myAlbum.getSongList();

        Album myAlbum = new Album("the best music");

        Song firstSong = new Song(300, "hip");
        Song secondSong = new Song(300, "real nice");
        Song thirdSong = new Song(300, "very great song");
        Song fourthSong = new Song(300, "fantastic");



        myAlbum.addSong(firstSong);
        myAlbum.addSong(secondSong);
        myAlbum.addSong(thirdSong);
        myAlbum.addSong(fourthSong);


        myAlbum.getSongList();
    }


}
