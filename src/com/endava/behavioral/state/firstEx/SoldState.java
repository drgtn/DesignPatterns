package com.endava.behavioral.state.firstEx;

/**
 * Created by Andrei.Dragutan on 24/03/2017.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry you ");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesnt get you another ball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Ops, out of Gumballs");
        }
    }
}
