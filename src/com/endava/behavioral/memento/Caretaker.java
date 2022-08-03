package com.endava.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrei.Dragutan on 06/04/2017.
 */
public class Caretaker {
    private List<Memento> statesList = new ArrayList<>();

    public void addMemento(Memento memento) {
        statesList.add(memento);
    }

    public Memento getMemento(int index) {
        return statesList.get(index);
    }

}
