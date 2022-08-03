package com.endava.behavioral.strategy.secondEx;

/**
 * Created by Andrei.Dragutan on 06/03/2017.
 */
public class TestStrategy {
    public static void main(String[] args) {
        Duck mallardDuck=new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.display();
        mallardDuck.performFly();
    }

}
