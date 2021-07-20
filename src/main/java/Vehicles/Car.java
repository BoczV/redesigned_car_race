package Vehicles;

import race.Race;

public class Car extends Vehicle {

    private static String[] randomNames = new String[]{"Dragon", "Presence", "Crux", "Fire",
        "Adventure", "Enigma", "Blast", "Realm", "Aeon", "Chase"};


    public Car(){
        name = randomNames[random.nextInt(10)] + " " + randomNames[random.nextInt(10)];
    }

    @Override
    protected void prepareForLap() {
        this.normalSpeed = 80 + random.nextInt(31);
        this.actualSpeed = Race.Circumstances.isTruckBroken()? 75: normalSpeed;
    }


    @Override
    public String getType() {
        return "Car";
    }
}
