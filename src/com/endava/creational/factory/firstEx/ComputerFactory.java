package com.endava.creational.factory.firstEx;
/**
 * Created by Andrei.Dragutan on 03/03/2017.
 */
public class ComputerFactory {
    public static Computer createComputer(String computerName){
        Computer computer=null;
        if("PC".equals(computerName)){
            computer=new PC();
        }
        if ("laptop".equals(computerName)){
            computer=new Laptop();
        }
        return computer;
    }
}
