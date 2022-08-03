package com.endava.creational.abstractFactory.firstEx;

/**
 * Abstract Product declares an interface for a type of product object
 */
public abstract class Computer {
    public abstract String getRAM();


    @Override
    public String toString(){
        return "RAM= "+this.getRAM();
    }
}
