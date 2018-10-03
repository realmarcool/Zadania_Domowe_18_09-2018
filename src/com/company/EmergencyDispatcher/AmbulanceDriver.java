package com.company.EmergencyDispatcher;

public class AmbulanceDriver extends Driver {

    private int interventionTime;

    public int getInterventionTime() {
        return interventionTime;
    }

    public AmbulanceDriver(Dispatcher dispatcher, String ambulanceNumber) {
        super(dispatcher);
        this.ambulanceNumber = ambulanceNumber;
        ambulanceStatus = AmbulanceStatus.WAITING_FOR_INTERVENTION;
    }

    @Override
    public void startIntervention(String intervention) {
        ambulanceStatus = AmbulanceStatus.DURING_INTERVENTION;
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" -> Karetka " + ambulanceNumber + " zaczyna interwencję: " + intervention);
                for(int i = 20 ;i>1;i--) {
                    interventionTime = i;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ambulanceStatus = AmbulanceStatus.WAITING_FOR_INTERVENTION;
            }
        }).start();
    }
}
