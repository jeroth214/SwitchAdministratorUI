package com.example.switchadministratorui;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize empty arraylist of switches and set to a switch repository
        ArrayList<Switch> switchRepositoryArray = new ArrayList<>();
        final SwitchRepository thisRepository = new SwitchRepository(switchRepositoryArray);

        //uploader still not working: add uploader and extract song name from the uploaded file
        //TextView songName = findViewById(R.id.songNameTextView);
        //        songName.setText(fileName);

        //play button
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

        //pause button
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

        //restart button
        Button restart = this.findViewById(R.id.restartButton);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * resets the media player on click
             * @param view the main activity layout
             */
            public void onClick(View view) {
                mediaPlayer.reset();
            }
        });

        //integrate bluetooth - when switch is on, start media player and play file getNote()+".wav"

        //add switch and edit switch intents
        final Intent addSwitchIntent = new Intent(this, AddSwitchActivity.class);
        final Intent editSwitchIntent = new Intent(this, EditSwitchesActivity.class);

        //add switch button - go to new screen with thisRepository data
        Button add = this.findViewById(R.id.addSwitchButton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * switches to add switch screen on click
             */
            public void onClick(View view) {
                addSwitchIntent.putExtra("repository",thisRepository);
                startActivity(addSwitchIntent);
            }
        });

        //edit switches button - go to new screen with thisRepository data
        Button edit = this.findViewById(R.id.editSwitchesButton);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * switches to edit switches screen on click
             */
            public void onClick(View view) {
                editSwitchIntent.putExtra("repository",thisRepository);
                startActivity(editSwitchIntent);
            }
        });

        //set switchList to be a list of all the switches in the repository
        TextView switchList = findViewById(R.id.switchListText);
        switchList.setText(thisRepository.printAll());
    }

}
