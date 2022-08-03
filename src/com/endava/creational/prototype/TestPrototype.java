package com.endava.creational.prototype;

/**
 * Created by Andrei.Dragutan on 10/03/2017.
 */
public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        CheeseCake cheeseCake=new CheeseCake();
        cheeseCake.setSugar("100g");
        cheeseCake.setButter("200g");
        cheeseCake.setCheese("Acapella");
        cheeseCake.setName("CheeseCake");
        System.out.println("Cake1 = " + cheeseCake.toString());

        //same object just changing its name and one ingredient

        //with clone from Clonable
        CheeseCake bastien= (CheeseCake) cheeseCake.clone();
        bastien.setName("Bastien");
        System.out.println("Cake2 = " + bastien.toString());

        //with my method
        CheeseCake adams= (CheeseCake) cheeseCake.prepareCake();
        adams.setCheese("Much more cheese");
        adams.setName("Adams");
        System.out.println("Cake3 = " + adams.toString());



    }
}
