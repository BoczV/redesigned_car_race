package Vehicles;

import race.Race;

public class Motorcycle extends Vehicle{


    public Motorcycle(){
        
    }

    @Override
    protected void prepareForLap() {
        this.normalSpeed = 100;
        this.actualSpeed = Race.Circumstances.isRaining()? 5 + random.nextInt(46): normalSpeed;
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }
}
