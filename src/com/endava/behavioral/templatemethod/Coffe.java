package com.endava.behavioral.templatemethod;

/**
 * Created by Andrei.Dragutan on 30/03/2017.
 */
public class Coffe extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk i the coffee");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through the filter");
    }

}
