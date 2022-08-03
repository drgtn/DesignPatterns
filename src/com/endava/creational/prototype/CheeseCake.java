package com.endava.creational.prototype;

/**
 * Created by Andrei.Dragutan on 10/03/2017.
 */
public class CheeseCake implements Cloneable {
    private String sugar;
    private String butter;
    private String cheese;
    private String name;


    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public void setButter(String butter) {
        this.butter = butter;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public CheeseCake prepareCake() {
        CheeseCake cake = null;
        try {
            cake = (CheeseCake) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cake;
    }

    @Override
    public String toString() {
        return "CheeseCake{" +
                "sugar='" + sugar + '\'' +
                ", butter='" + butter + '\'' +
                ", cheese='" + cheese + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
