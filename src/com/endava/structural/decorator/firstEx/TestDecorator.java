package com.endava.structural.decorator.firstEx;

/**
 * Created by Andrei.Dragutan on 14/03/2017.
 */
public class TestDecorator {
    public static void main(String[] args) {
        Car car=new LuxuryCar(new BaseCar());
        car.assemble();
    }
}
