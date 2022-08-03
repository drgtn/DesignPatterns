package com.endava.structural.decorator.secondEx;

/**
 * Created by Andrei.Dragutan on 14/03/2017.
 */
public class TestDecorator {
    public static void main(String[] args) {
        Beverage beverage=new Expresso();
        System.out.println(beverage.getDescription() + " $ " +beverage.cost() );

        Beverage beverage1=new Expresso();
        beverage1=new MochaConcreteDecorator(beverage1);
        System.out.println(beverage1.getDescription() + " $ " +beverage1.cost() );

        Beverage beverage2=new SoyConcreteDecorator(new MochaConcreteDecorator(new Expresso()));
        System.out.println(beverage2.getDescription() + " $ " +beverage2.cost() );


    }
}
