package com.endava.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Andrei.Dragutan on 16/03/2017.
 */
//Composite
public class Manager implements Employee{
    private String name;
    private double salary;
    List<Employee> employeesList = new ArrayList();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        employeesList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeesList.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employeesList.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
     public void print() {
        System.out.println("-------------");
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("-------------");


        Iterator<Employee> employeeIterator = employeesList.iterator();
        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.print();
        }
    }

    @Override
    public double totalSalary() {
        double total=getSalary();
        for (Employee e:employeesList) {
              total=total+ e.totalSalary();
        }
        return total;
    }
}
