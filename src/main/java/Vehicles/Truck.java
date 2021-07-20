package Vehicles;

import race.Race;

public class Truck extends Vehicle {
    private boolean brokenDown;
    private int brokenDownCounter;


    public Truck(){
        name = String.valueOf(random.nextInt(1001));
    }

    @Override
    protected void prepareForLap() {
        if(brokenDown){
            if(brokenDownCounter == 1) brokenDownCounter += 1;
            else {
                brokenDown = false;
                brokenDownCounter = 0;
                Race.Circumstances.setTruckBroken(false);
            }
        }
        doIBreakDown();
        this.normalSpeed = 100;
        this.actualSpeed = brokenDown? 0: 100;
    }

    private void doIBreakDown(){
        int chanceOfBreakingDown = 1 + random.nextInt(100);
        brokenDown = chanceOfBreakingDown <= 5;
        if (brokenDown) {
            Race.Circumstances.setTruckBroken(true);
            brokenDownCounter = 1;
        }
    }

    @Override
    public String getType() {
        return "Truck";
    }

}
