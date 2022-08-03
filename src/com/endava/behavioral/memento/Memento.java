package com.endava.behavioral.memento;

/**
 * Created by Andrei.Dragutan on 06/04/2017.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
