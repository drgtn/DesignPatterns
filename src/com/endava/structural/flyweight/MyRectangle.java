package com.endava.structural.flyweight;

import java.awt.*;

/**
 * Created by Andrei.Dragutan on 16/03/2017.
 */
public class MyRectangle implements MyShape {
    private String label;

    public MyRectangle(String label) {
        this.label = label;

    }

    @Override
    public void draw(Graphics rectangle, int x, int y, int width, int height, Color color, boolean fill, String font) {
        rectangle.setColor(color);
        rectangle.drawRect(x, y, width, height);
        rectangle.setFont(new Font(font, 12, 12));
        rectangle.drawString(label, x + (width / 2), y);
        if (fill)
            rectangle.fillRect(x, y, width, height);
    }

}
