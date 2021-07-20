package Vehicles;

import race.Race;

public class Car extends Vehicle {

    @Override
    public void moveForAnHour() {
        prepareForLap();
        this.distanceTraveled += actualSpeed;
    }

    @Override
    protected void prepareForLap() {
        this.normalSpeed = 80 + random.nextInt(31);
        this.actualSpeed = Race.Circumstances.isTruckBroken()? 75: normalSpeed;
    }

    @Override
    public int getDistance() {
        return this.distanceTraveled;
    }

    @Override
    public String getType() {
        return "Car";
    }
}
