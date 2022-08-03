package com.endava.creational.abstractFactory.firstEx;
/**
 * Implements the operations from AbstractFactory to create concrete product objects.
 * An application typically needs only one instance of a ConcreteFactory per product family. So it's usually best implemented
 as a Singleton
 */
public class LaptopFactory implements ComputerAbstractFactory {

    @Override
    public Computer createComputer() {
        return new PC();
    }
}
