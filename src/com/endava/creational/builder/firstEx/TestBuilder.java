package com.endava.creational.builder.firstEx;

/**
 * Created by Andrei.Dragutan on 10/03/2017.
 */
public class TestBuilder {
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer computer=new Computer.ComputerBuilder("8RAM","500GB").setBluetoothEnabled(true).build();
    }
}
