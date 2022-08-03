package com.endava.behavioral.strategy.secondEx;

/**
 * Created by Andrei.Dragutan on 06/03/2017.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Im flying!!!");
    }
}
