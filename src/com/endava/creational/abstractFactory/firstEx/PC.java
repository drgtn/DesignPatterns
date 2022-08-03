package com.endava.creational.abstractFactory.firstEx;
/**
 * Defines a product object to be created by the corresponding concrete factory.
 o implements the AbstractProduct interface.
 */
public class PC extends Computer {
    @Override
    public String getRAM() {
        return "8GB";
    }
}
