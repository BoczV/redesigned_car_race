
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

    public void moveForAnHour(){
        this.prepareForLap();
        distanceTraveled += actualSpeed;
    };
    protected abstract void prepareForLap();

    public int getDistance(){
        return this.distanceTraveled;
    };

    public abstract String getType();
}
