package com.endava.behavioral.mediator.secondEx;

/**
 * Created by Andrei.Dragutan on 31/03/2017.
 */
public class Runway implements Command{
    IATCMediator mediator;

    public Runway(IATCMediator mediator) {
        this.mediator = mediator;
        mediator.setLandingStatus(true);
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted...");
        mediator.setLandingStatus(true);
    }
}
