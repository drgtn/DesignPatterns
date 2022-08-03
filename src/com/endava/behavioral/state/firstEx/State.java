package com.endava.behavioral.state.firstEx;

/**
 * Created by Andrei.Dragutan on 20/03/2017.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
