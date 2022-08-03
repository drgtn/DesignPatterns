package com.endava.creational.abstractFactory.firstEx;
/**
 * Defines a product object to be created by the corresponding concrete factory.
 o implements the AbstractProduct interface.
 */
public class Laptop extends Computer {
    @Override
    public String getRAM() {
        return "6GB";
    }
}
