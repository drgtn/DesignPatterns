package com.endava.creational.factory.firstEx;

/**
 * Created by Andrei.Dragutan on 03/03/2017.
 */
public class Laptop extends Computer {
    @Override
    public String getRAM() {
        return "2GB";
    }

    @Override
    public String getHDD() {
        return "500GB";
    }

    @Override
    public String getCPU() {
        return "2.5Ghz";
    }
}
