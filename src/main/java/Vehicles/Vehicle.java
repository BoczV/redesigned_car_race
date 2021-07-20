package Vehicles;

import java.util.Random;

public abstract class Vehicle {

    protected String name;
    protected int normalSpeed;
    protected int actualSpeed;
    protected int distanceTraveled;
    protected static Random random = new Random();


    public String getName() {
        return name;
    }

    public abstract void moveForAnHour();
    protected abstract void prepareForLap();

    public abstract int getDistance();

    public abstract String getType();
}
