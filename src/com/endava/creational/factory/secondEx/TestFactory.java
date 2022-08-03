package com.endava.creational.factory.secondEx;

/**
 * Created by Andrei.Dragutan on 06/03/2017.
 */
public class TestFactory {
    public static void main(String[] args) {
        ClientPizzaStore pizzaStore=new ClientPizzaStore();
        pizzaStore.orderPizza("cheese");
    }


}
