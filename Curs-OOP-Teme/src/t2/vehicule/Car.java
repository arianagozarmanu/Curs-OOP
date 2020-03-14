package t2.vehicule;

/**
 * 
 * @author arianagm
 *
 */
public class Car extends Vehicle {

	private CarType type;
	
	public Car(String make, String model, long price, CarType type) {
		super(make, model, price);
		this.type = type;
	}
	
	public void turnOn() {
		System.out.println("Calci ambreiaj si apesi Start.");		
	}

	public void accelerate() {
		System.out.println("Apesi pedala de acceleratie.");
		
	}

	public void brake() {
		System.out.println("Apesi pedala de frana.");
	}

	public CarType getType() {
		return type;
	}

	@Override
	public String toString() {
		return super.toString() + " [type=" + type + "]";
	}
	
}
