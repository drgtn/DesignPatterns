package com.endava.structural.decorator.firstEx;

/**
 * Created by Andrei.Dragutan on 14/03/2017.
 */
public class CarDecorator implements Car {
    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }
}
