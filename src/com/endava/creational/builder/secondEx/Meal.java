package com.endava.creational.builder.secondEx;

/**
 * Created by Andrei.Dragutan on 10/03/2017.
 */
public class Meal {
    public String sandwich;
    public String sideOrder;
    public String drink;
    public String offer;
    public double price;

    @Override
    public String toString() {
        return "Sandwich=" + sandwich + " Side Order=" + sideOrder + " Drink="
                + drink + " Offer=" + offer + " Price=" + price;
    }
}
