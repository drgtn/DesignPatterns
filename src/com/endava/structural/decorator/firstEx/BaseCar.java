package com.endava.structural.decorator.firstEx;

/**
 * Created by Andrei.Dragutan on 14/03/2017.
 */
public class BaseCar implements Car {

    @Override
    public void assemble() {
        System.out.println("This is a concrete car");
    }
}
