package com.endava.creational.builder.secondEx;

/**
 * Created by Andrei.Dragutan on 10/03/2017.
 */
public interface MealBuilder {

    public void setSandwich(String sandwich);
    public void setOrder(String sideOrder);
    public void setDrink(String drink);
    public void setOffer(String offer);
    public void setPrice (Double price);

    //method for builder
    Meal getMeal();
}
