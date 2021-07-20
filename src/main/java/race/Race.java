package race;

import Vehicles.Car;
import Vehicles.Motorcycle;
import Vehicles.Truck;
import Vehicles.Vehicle;

import java.util.Random;

public class Race {
    private Vehicle[] vehicles;
    private int hoursOfRace;

    public static class Circumstances {


        private static boolean raining;
        private static final Random random = new Random();
        private static boolean truckBroken;

        protected static void calculateWeather(){
            raining = (1 + random.nextInt(10)) < 4;
        }

        public static boolean isRaining(){
            return raining;
        }

        public static boolean isTruckBroken(){
            return truckBroken;
        }

        public static void setTruckBroken(){
            truckBroken = !truckBroken;
        }

    }


    public Race(int numberOfRacer, int hoursOfRace){
        vehicles = new Vehicle[numberOfRacer];
        this.hoursOfRace = hoursOfRace;

    }

    private int findLastIndexOfArray(Vehicle[] array){
        for (int i = 0; i < array.length; i++){
            if(array[i] == null){
                return i;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void simulateRace(){
        for(int i = 0; i < hoursOfRace; i++){
            Circumstances.calculateWeather();
            for (Vehicle vehicle: vehicles) {
                vehicle.moveForAnHour();
            }
        }
    }

    public void registerRacer(Vehicle vehicle){
        int lastIndex = findLastIndexOfArray(vehicles);
        vehicles[lastIndex] = vehicle;
    }


    public void printRaceResults(){
        for (Vehicle vehicle:
             vehicles) {
            System.out.println("Name: " + vehicle.getName()
                    + ", distance travelled: " + vehicle.getDistance()
                    + "km, type: " + vehicle.getType());
        }
    }


}
