package com.endava.structural.decorator.firstEx;

/**
 * Created by Andrei.Dragutan on 14/03/2017.
 */
public class LuxuryCar extends CarDecorator {


    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" LuxuryCar ");
    }
}
