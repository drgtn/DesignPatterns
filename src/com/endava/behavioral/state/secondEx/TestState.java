package com.endava.behavioral.state.secondEx;

/**
 * Created by Andrei.Dragutan on 24/03/2017.
 */
public class TestState {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.walk();
        robot.cook();
        robot.walk();
        robot.off();

        robot.walk();
        robot.off();
        robot.cook();
    }
}
