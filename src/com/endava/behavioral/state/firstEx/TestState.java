package com.endava.behavioral.state.firstEx;

/**
 * Created by Andrei.Dragutan on 24/03/2017.
 */
public class TestState {
    public static void main(String[] args) {
        GumballMachine gumballMachine=new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
