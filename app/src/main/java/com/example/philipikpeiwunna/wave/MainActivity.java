package com.example.philipikpeiwunna.wave;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view that launches the playlist

        ImageView beginButton = findViewById(R.id.playButton);

        // Set a click listener on that View
        beginButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                // Start the new activity
                startActivity(playlistIntent);
            }
        });


    }
}
