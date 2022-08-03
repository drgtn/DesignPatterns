package com.endava.creational.factory.firstEx;

/**
 * Factory design pattern is used when we have a super class with multiple sub-classes and based on input,
 * we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client program to the factory class.
 */
public class TestFactory {
    public static void main(String[] args) {
        Computer computer=ComputerFactory.createComputer("laptop");
        System.out.println(computer);
    }
}
