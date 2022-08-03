package com.endava.behavioral.strategy.secondEx;

/**
 * Created by Andrei.Dragutan on 06/03/2017.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuakBehavior quakBehavior;

    public void swim() {
        System.out.println("All ducks can swim");
    }

    public abstract void display();

    //delegate the behavior
    public void performFly() {
        flyBehavior.fly();
    }

    //delegate the behavior
    public void performQuack() {
        quakBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuakBehavior(QuakBehavior quakBehavior) {
        this.quakBehavior = quakBehavior;
    }
}
