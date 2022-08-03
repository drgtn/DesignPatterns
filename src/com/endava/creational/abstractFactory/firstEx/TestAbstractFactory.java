package com.endava.creational.abstractFactory.firstEx;
/**
 * Created by Andrei.Dragutan on 03/03/2017.
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        Computer computer=ComputerFactory.getComputer(new PCFactory());
        System.out.println(computer);
    }
}
