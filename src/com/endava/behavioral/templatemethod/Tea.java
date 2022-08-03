package com.endava.behavioral.templatemethod;

/**
 * Created by Andrei.Dragutan on 30/03/2017.
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
