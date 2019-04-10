package com.example.switchadministratorui;

/**
 * this class creates a repository of switches
 */
import java.io.Serializable;
import java.util.ArrayList;

public class SwitchRepository implements Serializable {
    private ArrayList<Switch> repository;

    /**
     * creates a repository that stores all switches in an array list
     * @param thisRepository an array list of switches
     */
    public SwitchRepository(ArrayList<Switch> thisRepository){
       repository = thisRepository;
    }

    /**
     * adds a switch to the repository
     * @param newSwitch the switch to be added
     */
    public void addSwitch(Switch newSwitch) {
        repository.add(newSwitch);
    }

    /**
     * adds a switch to the repository
     * @param newSwitchName the switch to be added
     * @param newSwitchNote the note of the switch to be added
     */
    public void addSwitch(String newSwitchName, String newSwitchNote) {
        Switch newSwitch = new Switch(newSwitchName, newSwitchNote);
        repository.add(newSwitch);
    }

    /**
     * removes a switch from the repository
     * @param name the switch to be removed
     */
    public void removeSwitch(Switch name) {
        repository.remove(name);
    }

    /**
     * prints all switches
     * @return a string value for all switches
     */
    public String printAll() {
        String str = "";
        for (Switch s : repository) {
            str = str + "\n"+s.getName()+" - "+s.getNote();
        }
        return str;
    }
}
