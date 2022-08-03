package com.endava.structural.bridge;

/**
 * Created by Andrei.Dragutan on 15/03/2017.
 */
public class TestBridge {
    public static void main(String[] args) {
        Shape triangle=new Triangle(new RedColor());
        triangle.applyColor();

        Shape circle=new Circle(new BlueColor());
        circle.applyColor();
    }
}
