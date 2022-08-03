package com.endava.structural.bridge;

/**
 * Created by Andrei.Dragutan on 15/03/2017.
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
