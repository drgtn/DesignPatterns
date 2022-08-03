package com.endava.structural.adapter.inheritance;



/**
 * Created by Andrei.Dragutan on 13/03/2017.
 */
public class TestAdapter {
    public static void main(String[] args) {
        Duck mallardDuck=new MallardDuck();
        System.out.println("The Duck says...");
        mallardDuck.quack();
        mallardDuck.fly();
        /////////////////////////////////////////

        Turkey turkey=new Turkey();
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        /////////////////////////////////////////

        Duck turkeyAdapter=new TurkeyAdapter();
        System.out.println("The TurkeyAdapter says...");
        turkeyAdapter.fly();
        turkeyAdapter.quack();


    }
}
