package com.endava.structural.adapter.composition;

/**
 * Created by Andrei.Dragutan on 13/03/2017.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Im slying");
    }
}
