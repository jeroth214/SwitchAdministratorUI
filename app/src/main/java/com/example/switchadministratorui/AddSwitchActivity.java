package com.example.switchadministratorui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddSwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_switch);

        //extract repository from main screen
        Bundle extras = getIntent().getExtras();
        final SwitchRepository switchRepository = (SwitchRepository) extras.get("repository");

        //get user's inputted values for name and note
        EditText switchName = findViewById(R.id.switchNameEditText);
        EditText switchNote = findViewById(R.id.switchNoteEditText);

        //convert to string
        final String switchNameString = switchName.getText().toString();
        final String switchNoteString = switchNote.getText().toString();

        //notification that switch has been added
        final Toast toast = Toast.makeText(getApplicationContext(), "Switch "+switchNameString+"added!", Toast.LENGTH_LONG);

        //add button adds switch to repository
        Button add = this.findViewById(R.id.addSwitchButton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchRepository.addSwitch(switchNameString, switchNoteString);
                toast.show();
            }
        });
    }
}