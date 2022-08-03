package com.endava.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrei.Dragutan on 16/03/2017.
 */
public class ShapeFactory {
    private static final Map<String, MyShape> shapes=new HashMap<>();
    public static MyShape getShape(String label){
        MyShape shape=shapes.get(label);

        if (shape==null){
            if (label.equals("R")){
                shape=new MyRectangle(label);
            }
            else if (label.equals("O")) {
                shape = new MyOval(label);
            }
            shapes.put(label,shape);
        }
        return shape;
    }
}
