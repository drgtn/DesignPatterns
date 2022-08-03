package com.endava.structural.facade;

/**
 * Created by Andrei.Dragutan on 02/02/2017.
 */
public class TestFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer=new ScheduleServer();
        SchedulerFacade schedulerFacade=new SchedulerFacade(scheduleServer);

        schedulerFacade.startServer();
        schedulerFacade.stopServer();
    }

}
