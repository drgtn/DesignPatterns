package com.endava.behavioral.mediator.secondEx;

/**
 * Created by Andrei.Dragutan on 31/03/2017.
 */
public interface IATCMediator {
    public void registerRunway(Runway runway);

    public void registerFlight(Flight flight);

    public boolean isLandingOk();

    public void setLandingStatus(boolean status);
}
