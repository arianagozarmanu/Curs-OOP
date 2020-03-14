package t2.vehicule;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author arianagm
 *
 */
public class Main {

	public static void main(String[] args) {
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Car("Audi", "A4", 13200L, CarType.SEDAN));
		vehicles.add(new Scooter("Yamaha", "Z30", 1450L, ScooterType.FUEL));
		vehicles.add(new Trotineta("Xiaomi", "xg1200", 410L, false));

		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle.toString());
			vehicle.turnOn();
			vehicle.accelerate();
			vehicle.brake();		
		}
	}

}
