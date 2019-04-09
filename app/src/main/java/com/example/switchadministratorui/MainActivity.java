package com.example.switchadministratorui;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button play = this.findViewById(R.id.playButton);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song);
        play.setOnClickListener(new View.OnClickListener(){

            /**
             * plays a song when the play button is clicked
             * @param view the main activity layout
             */
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });

        Button pause = this.findViewById(R.id.pauseButton);
        pause.setOnClickListener(new View.OnClickListener(){

            /**
             * pauses a song when the pause button is clicked
             * @param view the main activity layout
             */
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });

        Button add = this.findViewById(R.id.addSwitchButton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }

}
