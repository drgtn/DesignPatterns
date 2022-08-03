package com.endava.structural.adapter.composition;


/**
 * Created by Andrei.Dragutan on 13/03/2017.
 */
public class TestAdapter {
    public static void main(String[] args) {
        Duck mallardDuck=new MallardDuck();

        System.out.println("The Duck says...");
        mallardDuck.quack();
        mallardDuck.fly();
        ////////////////////////////////////////

        Turkey wildTurkey=new WildTurkey();
        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();
        /////////////////////////////////////////

        TurkeyAdapter turkeyAdapter=new TurkeyAdapter();
        turkeyAdapter.setTurkey(new WildTurkey());
        System.out.println("The TurkeyAdapter says...");
        turkeyAdapter.fly();
        turkeyAdapter.quack();


    }
}
