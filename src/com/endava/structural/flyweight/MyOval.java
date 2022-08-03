package com.endava.structural.flyweight;

import java.awt.*;

/**
 * Created by Andrei.Dragutan on 16/03/2017.
 */
public class MyOval implements MyShape {
    String label;

    public MyOval(String label) {
        this.label = label;
    }

    @Override
    public void draw(Graphics oval, int x, int y, int width, int height, Color color, boolean fill, String font) {
        oval.setColor(color);
        oval.drawOval(x, y, width, height);
        oval.setFont(new Font(font, 12, 12));
        oval.drawString(label, x + (width / 2), y);
        if (fill)
            oval.fillOval(x, y, width, height);
    }


}
