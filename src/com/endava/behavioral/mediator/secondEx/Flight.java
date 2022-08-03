package com.endava.behavioral.mediator.secondEx;

/**
 * Created by Andrei.Dragutan on 31/03/2017.
 */
public class Flight implements Command {
    IATCMediator mediator;

    public Flight(IATCMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void land() {
        if (mediator.isLandingOk()) {
            System.out.println("Landing done...");
            mediator.setLandingStatus(true);
        } else {
            System.out.println("Will wait to land");
        }
    }

    public void getReady() {
        System.out.println("Getting ready...");
    }
}
