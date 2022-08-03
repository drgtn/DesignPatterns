package com.endava.structural.composite;

/**
 * Created by Andrei.Dragutan on 16/03/2017.
 */

//Component
public interface Employee {
    void add(Employee employee);

    void remove(Employee employee);

    Employee getChild(int i);

    String getName();

    double getSalary();

    void print();

    //total salary depending on what -  a leaf or a composite
    double totalSalary();
}
