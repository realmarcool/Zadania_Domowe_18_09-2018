package com.company.EmergencyDispatcher;

public class AmbulanceMain {
    public static void run() throws InterruptedException {

        AmbulanceDispatcher ambulanceDispatcher = new AmbulanceDispatcher();
        AmbulanceDriver ambulanceDriver1 = new AmbulanceDriver(ambulanceDispatcher,"1");
        AmbulanceDriver ambulanceDriver2 = new AmbulanceDriver(ambulanceDispatcher,"2");
        AmbulanceDriver ambulanceDriver3 = new AmbulanceDriver(ambulanceDispatcher,"3");

        ambulanceDispatcher.addDriver(ambulanceDriver1);
        ambulanceDispatcher.addDriver(ambulanceDriver2);
        ambulanceDispatcher.addDriver(ambulanceDriver3);

        System.out.println("**************************************************");
        ambulanceDispatcher.takeIntervention("ul.Pożeczkowa 12");
        Thread.sleep(2000);
        System.out.println("**************************************************");
        ambulanceDispatcher.takeIntervention("ul.Truskawkowa 12");
        Thread.sleep(2000);
        System.out.println("**************************************************");
        ambulanceDispatcher.takeIntervention("ul.Czereśniowa 12");
        Thread.sleep(2000);
        System.out.println("**************************************************");
        ambulanceDispatcher.takeIntervention("ul.Wiśniowa 12");
        Thread.sleep(2000);
        System.out.println("**************************************************");
        ambulanceDispatcher.takeIntervention("ul.Jabłkowa 12");
        Thread.sleep(2000);
        System.out.println("**************************************************");
        ambulanceDispatcher.takeIntervention("ul.Gruszkowa 12");
        Thread.sleep(2000);
        System.out.println("**************************************************");
        ambulanceDispatcher.takeIntervention("ul.Bananowa 12");
        Thread.sleep(2000);
        System.out.println("**************************************************");
        ambulanceDispatcher.takeIntervention("ul.Pomarańczowa 12");
        Thread.sleep(2000);
        System.out.println("**************************************************");
        ambulanceDispatcher.takeIntervention("ul.Cytrynowa 12");
        Thread.sleep(2000);
        System.out.println("**************************************************");
        ambulanceDispatcher.takeIntervention("ul.Jagodowa 12");
    }
}
