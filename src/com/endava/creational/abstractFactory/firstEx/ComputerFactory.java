package com.endava.creational.abstractFactory.firstEx;
/**
 * Client uses only interfaces declared by AbstractFactory and AbstractProduct classes.
 */
public class ComputerFactory {
    static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
                return computerAbstractFactory.createComputer();
    }
}
