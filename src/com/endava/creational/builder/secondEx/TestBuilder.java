package com.endava.creational.builder.secondEx;

/**
 * Created by Andrei.Dragutan on 10/03/2017.
 */
public class TestBuilder {
    public static void main(String[] args) {
        MealBuilder sandwitchBuilder=new SandwitchMealBuilder();
        new MealDirector().makeMeal(sandwitchBuilder);

        Meal meal = sandwitchBuilder.getMeal();

    }
}
