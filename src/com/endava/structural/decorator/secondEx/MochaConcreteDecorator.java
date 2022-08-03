package com.endava.structural.decorator.secondEx;

/**
 * Created by Andrei.Dragutan on 14/03/2017.
 */
public class MochaConcreteDecorator extends CondimentDecorator {
    Beverage beverage;

    public MochaConcreteDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+ 0.20;
    }
}
