package com.endava.creational.factory.secondEx;

/**
 * Created by Andrei.Dragutan on 06/03/2017.
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza= new CheesePizza();
        }
        return pizza;
    }
}
