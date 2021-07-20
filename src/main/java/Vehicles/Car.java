package Vehicles;

import race.Race;

public class Car extends Vehicle {


    public Car(){

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
