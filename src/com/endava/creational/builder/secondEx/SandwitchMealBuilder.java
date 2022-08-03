package com.endava.creational.builder.secondEx;

import com.endava.creational.builder.secondEx.Meal;
import com.endava.creational.builder.secondEx.MealBuilder;

/**
 * Created by Andrei.Dragutan on 10/03/2017.
 */
public class SandwitchMealBuilder implements MealBuilder {
    Meal meal=new Meal();
    @Override
    public void setSandwich(String sandwich) {
        this.meal.sandwich=sandwich;
    }

    @Override
    public void setOrder(String sideOrder) {
        this.meal.sideOrder=sideOrder;
    }

    @Override
    public void setDrink(String drink) {
        this.meal.drink=drink;
    }

    @Override
    public void setOffer(String offer) {
        this.meal.offer=offer;
    }

    @Override
    public void setPrice(Double price) {
        this.meal.price=price;
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }
}
