package Vehicles;

public abstract class Vehicle {

    private String name;
    private int normalSpeed;
    private int actualSpeed;
    private int distanceTraveled;


    public String getName() {
        return name;
    }

    public abstract void moveForAnHour();
    protected abstract void prepareForLap();

    public abstract int getDistance();

    public abstract String getType();
}
