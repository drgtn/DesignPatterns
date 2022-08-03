package com.endava.structural.composite;

/**
 * Created by Andrei.Dragutan on 16/03/2017.
 */
public class TestComposite {
    public static void main(String[] args) {
        Employee dev1=new Developer("John",10000);
        Employee dev2=new Developer("David",15000);

        Employee manager1=new Manager("Daniel",25000);
        manager1.add(dev1);
        manager1.add(dev2);
        System.out.println(manager1.totalSalary());

        Employee dev3=new Developer("Michael",20000);

        Employee generalManager=new Manager("Mark",50000);
        generalManager.add(dev3);
        generalManager.add(manager1);
        generalManager.print();




    }
}
