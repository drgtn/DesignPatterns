package com.endava.structural.bridge;

/**
 * Created by Andrei.Dragutan on 15/03/2017.
 */
public class Circle extends Shape {


    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Circle");
        color.applyColor();
    }


}
