package com.company.EmergencyDispatcher;

import java.util.ArrayList;
import java.util.List;

public class AmbulanceDispatcher implements Dispatcher {

        private boolean noFreeAmbulance = true;

        private List<AmbulanceDriver> ambulances = new ArrayList<>();

        public AmbulanceDispatcher(){
            this.ambulances = new ArrayList<>();
        }

        @Override
        public void takeIntervention(String intervention) {
            System.out.println("Przyjmuję wezwanie do: " + intervention);
            sendIntervention(intervention);
        }

        @Override
        public void sendIntervention(String intervention) {
            noFreeAmbulance = true;
            for (AmbulanceDriver ambulance: ambulances) {
                if (ambulance.ambulanceStatus == AmbulanceStatus.WAITING_FOR_INTERVENTION) {
                    noFreeAmbulance = false;
                    System.out.print("Karetka " + ambulance.ambulanceNumber + " jest wolna, wysyłam do niej wezwanie: " + intervention);
                    ambulance.startIntervention(intervention);
                    return;
                } else {
                    System.out.println("Karetka " + ambulance.ambulanceNumber + " w trakcie innej interwencji," +
                            " pozostały czas: " + ambulance.getInterventionTime());

                }}

                if (noFreeAmbulance) {
                    System.out.println("**********  Wszystkie karetki zajęte! Ponowne sprawdzenie za 5 sekund  **********");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sendIntervention(intervention);
                }
            }

        @Override
        public void addDriver(Driver driver) {
            ambulances.add((AmbulanceDriver) driver);
        }
    }
