package com.endava.structural.decorator.secondEx;

/**
 * Created by Andrei.Dragutan on 14/03/2017.
 */
public class SoyConcreteDecorator extends CondimentDecorator {
    Beverage beverage;

    public SoyConcreteDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
