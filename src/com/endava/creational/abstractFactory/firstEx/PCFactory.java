package com.endava.creational.abstractFactory.firstEx;
/**
 * Implements the operations from AbstractFactory to create concrete product objects
 */
public class PCFactory implements ComputerAbstractFactory{
    @Override
    public Computer createComputer() {
        return new PC();
    }
}
