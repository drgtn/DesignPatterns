package com.endava.creational.factory.secondEx;

/**
 * Created by Andrei.Dragutan on 06/03/2017.
 */
public class ClientPizzaStore {
  public Pizza orderPizza(String type){
      Pizza pizza=SimplePizzaFactory.createPizza("cheese");
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
      return pizza;
  }

}
