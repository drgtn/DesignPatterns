package com.endava.structural.decorator.secondEx;

/**
 * Created by Andrei.Dragutan on 14/03/2017.
 */
public abstract class Beverage {
    private String description="Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
