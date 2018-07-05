package com.example.philipikpeiwunna.wave;

/**
 * {@link Song} represents a playlist item that the user wants to play.
 * It contains a song name and artist name for the song.
 */

public class Song {

    // String value: Name of Song
    private String mSongName;

    // String value: Name of Artist
    private String mArtistName;

    // Define the constructor for the class
    public Song(String songName, String artistName){
        mSongName = songName;
        mArtistName = artistName;
    }

    // Creates method for retrieving the playlist item with song name.

    public String getSongName() {
        return mSongName;
    }

    // Creates method for retrieving the artist name.

    public String getArtistName() {
        return mArtistName;
    }
}