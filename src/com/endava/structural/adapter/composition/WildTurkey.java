package com.endava.structural.adapter.composition;

/**
 * Created by Andrei.Dragutan on 13/03/2017.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("I fly a little bit");
    }
}
