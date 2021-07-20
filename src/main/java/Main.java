import Vehicles.Car;
import Vehicles.Motorcycle;
import Vehicles.Truck;
import Vehicles.Vehicle;
import race.Race;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello project");
        int numberOfRacer = 30;
        Race race = new Race(numberOfRacer, 50);
        for(int i = 0; i < numberOfRacer; i++){
            Vehicle vehicle = i < 10? new Car(): i < 20 ? new Motorcycle(): new Truck();
            race.registerRacer(vehicle, i);
        }

        race.simulateRace();
        race.printRaceResults();
    }
}
