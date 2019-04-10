package com.example.switchadministratorui;

/**
 * this class creates a switch with a name and note
 */
public class Switch {
    private String name;
    private String note;

    /**
     * constructs a switch
     *
     * @param switchName the name of the switch
     * @param thisNote the note of the switch
     */
    public Switch(String switchName, String thisNote) {
        name = switchName;
        note = thisNote;
    }

    /**
     * constructs a switch with just a name
     *
     * @param thisName the name of the switch
     */
    public Switch(String thisName) {
        name = thisName;
    }

    /**
     * sets the switch's note
     *
     * @param newNote the new note
     */
    public void setNote(String newNote) {
        note = newNote;
    }

    /**
     * sets the switch's name
     *
     * @param newName the new name
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * gets the name of the switch
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * gets the note of the switch
     *
     * @return the note
     */
    public String getNote() {
        return note;
    }
}