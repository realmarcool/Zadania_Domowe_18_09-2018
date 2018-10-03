package com.company.EmergencyDispatcher;

public interface Dispatcher {

    void takeIntervention(String intervention);
    void sendIntervention(String intervention);
    void addDriver(Driver driver);
}
