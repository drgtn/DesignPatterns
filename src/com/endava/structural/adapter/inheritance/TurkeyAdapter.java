package com.endava.structural.adapter.inheritance;


/**
 * Created by Andrei.Dragutan on 13/03/2017.
 */
public class TurkeyAdapter  extends Turkey implements Duck{


    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
    }
}
