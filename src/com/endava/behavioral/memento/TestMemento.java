package com.endava.behavioral.memento;

import java.io.BufferedReader;

/**
 * Created by Andrei.Dragutan on 06/04/2017.
 */
public class TestMemento {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("Lion");
        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(memento);

        originator.setState("Horse");
        memento = originator.createMemento();
        caretaker.addMemento(memento);

        originator.setState("Elephant");
        System.out.println("Originator Current State: " + originator.getState());

        System.out.println("Originator restoring to previous state...");
        memento = caretaker.getMemento(1);
        originator.setMemento(memento);
        System.out.println(originator.getState());

    }
}
