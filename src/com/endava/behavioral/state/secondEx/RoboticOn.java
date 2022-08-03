package com.endava.behavioral.state.secondEx;

/**
 * Created by Andrei.Dragutan on 24/03/2017.
 */
public class RoboticOn implements RoboticState {
    Robot robot;

    public RoboticOn(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public void cook() {
        System.out.println("Transfering to CookState");
        robot.setState(robot.getRoboticCook());

    }

    @Override
    public void off() {
        System.out.println("Transfering to RoboticOff");
        robot.setState(robot.getRoboticOff());
    }
}
