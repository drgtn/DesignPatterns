package com.endava.structural.flyweight;

import java.awt.*;

/**
 * Created by Andrei.Dragutan on 16/03/2017.
 */
public interface MyShape {
    public void draw(Graphics g, int x, int y, int width, int height, Color color, boolean fill, String font);
}
