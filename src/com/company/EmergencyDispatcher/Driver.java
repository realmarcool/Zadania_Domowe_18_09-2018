package com.company.EmergencyDispatcher;

public abstract class Driver {
    protected AmbulanceStatus ambulanceStatus;
    protected Dispatcher dispatcher;
    protected String ambulanceNumber;


    public Driver(Dispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    public abstract void startIntervention(String intervention);

}
