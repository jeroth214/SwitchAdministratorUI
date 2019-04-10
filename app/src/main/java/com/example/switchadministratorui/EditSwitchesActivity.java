package com.example.switchadministratorui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditSwitchesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_switches);

        //extract repository
        Bundle extras = getIntent().getExtras();
        final SwitchRepository switchRepository = (SwitchRepository) extras.get("repository");

        //get user's inputted values
        EditText currentName = findViewById(R.id.currentNameEditText);
        EditText newName = findViewById(R.id.switchNameEditText);
        EditText newNote = findViewById(R.id.switchNoteEditText);

        //convert to strings
        final String currentNameString = currentName.getText().toString();
        final String newNameString = newName.getText().toString();
        final String newNoteString = newNote.getText().toString();

        //set switch to be changed
        final Switch thisSwitch = new Switch(currentNameString);

        //set toast
        final Toast toast = Toast.makeText(getApplicationContext(), "Changes saved!", Toast.LENGTH_LONG);

        //button to remove old switch and save changes
        Button save = findViewById(R.id.saveChangesButton);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thisSwitch.setName(newNameString);
                thisSwitch.setNote(newNoteString);
                toast.show();
            }
        });

    }
}
