package com.endava.structural.facade;

/**
 * Created by Andrei.Dragutan on 02/02/2017.
 */
public class SchedulerFacade {

    private ScheduleServer scheduleServer;
    //other components as well

    public SchedulerFacade(ScheduleServer scheduleServer) {
        this.scheduleServer = scheduleServer;
    }

    public void startServer() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
    }
    public void stopServer(){

        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }

}
