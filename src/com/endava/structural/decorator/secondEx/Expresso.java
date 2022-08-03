package com.endava.structural.decorator.secondEx;

/**
 * Created by Andrei.Dragutan on 14/03/2017.
 */
public class Expresso extends Beverage {
    public Expresso() {
        setDescription("Expresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
