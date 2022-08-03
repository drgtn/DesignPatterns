package com.endava.behavioral.state.secondEx;

/**
 * Created by Andrei.Dragutan on 24/03/2017.
 */
public class RoboticOff implements RoboticState {
    Robot robot;

    public RoboticOff(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
        robot.setState(robot.getRoboticOn());
    }

    @Override
    public void cook() {
        System.out.println("Cannot cook at Off state.");
    }

    @Override
    public void off() {
        System.out.println("Already switched off...");
    }
}
