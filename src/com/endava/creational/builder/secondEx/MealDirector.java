package com.endava.creational.builder.secondEx;

/**
 * Created by Andrei.Dragutan on 10/03/2017.
 */
public class MealDirector {
    public void makeMeal(MealBuilder mealBuilder){
        mealBuilder.setSandwich("Hamburger");
        mealBuilder.setDrink("Coke");
        mealBuilder.setOffer("Weekend Bonanza");
        mealBuilder.setPrice(5.99);
        mealBuilder.setOrder("Your order");
    }
}
