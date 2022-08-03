package com.endava.structural.adapter.composition;

/**
 * Created by Andrei.Dragutan on 13/03/2017.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public void setTurkey(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
