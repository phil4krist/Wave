package com.example.philipikpeiwunna.wave;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);

        //Create a list of songs
        ArrayList <Song> songs = new ArrayList<Song>();
        songs.add(new Song("Chukwu Ebuka", "Frank Edwards"));
        songs.add(new Song("Great I am", " Sinach"));
        songs.add(new Song("Reckless Love", "Cory Ashbury"));
        songs.add(new Song("Nightingale", "Yanni"));
        songs.add(new Song("All Is Not Lost", "Brilliance"));
        songs.add(new Song("Victory", "Eben"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
       SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // play_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}
