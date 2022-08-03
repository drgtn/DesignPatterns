package com.endava.structural.bridge;

/**
 * Created by Andrei.Dragutan on 15/03/2017.
 */
public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle filled with color ");
        color.applyColor();
    }
}
