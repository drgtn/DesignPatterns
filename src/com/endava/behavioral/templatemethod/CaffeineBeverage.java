package com.endava.behavioral.templatemethod;

/**
 * Created by Andrei.Dragutan on 30/03/2017.
 */
public abstract class CaffeineBeverage {
    //the template method
    final void prepareReceipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected  void pourInCup(){
        System.out.println("Pouring into cup");
    };
    protected  void boilWater(){
        System.out.println("Boiling water");
    };

    protected abstract void addCondiments();

    protected abstract void brew();



}
