package com.endava.behavioral.mediator.secondEx;

/**
 * Created by Andrei.Dragutan on 31/03/2017.
 */
public class ATCMediator implements IATCMediator {
    private Flight flight;
    private Runway runway;
    private boolean land;

    @Override
    public void registerRunway(Runway runway) {
        this.runway=runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight=flight;
    }

    @Override
    public boolean isLandingOk() {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.land=status;
    }
}
