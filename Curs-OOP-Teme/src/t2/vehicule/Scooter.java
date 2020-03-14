package t2.vehicule;

/**
 * 
 * @author arianagm
 *
 */
public class Scooter extends Vehicle {
	
	ScooterType type;
	
	public Scooter(String make, String model, long price, ScooterType type) {
		super(make, model, price);
		this.type = type;
	}

	@Override
	public void turnOn() {
		System.out.println("Tii frana si apesi start.");
	}

	@Override
	public void accelerate() {
		System.out.println("Roteste cu mana dreapta de acceleratie inspre tine.");
	}

	@Override
	public void brake() {
		System.out.println("Apasa cu mainile frana.");
	}
	
	public ScooterType getScooterType() {
		return type;
	}

	@Override
	public String toString() {
		return super.toString() + " [type=" + type + "]";
	}

}
