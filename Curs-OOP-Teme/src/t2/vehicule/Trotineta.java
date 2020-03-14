package t2.vehicule;

/**
 * 
 * @author arianagm
 *
 */
public class Trotineta extends Vehicle {

	private boolean suspensions;
	
	public Trotineta(String make, String model, long price, boolean suspensions) {
		super(make, model, price);
		this.suspensions = suspensions;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Apasa butonul de pornire.");	
	}

	@Override
	public void accelerate() {
		System.out.println("Apasa maneta de acceleratie.");		
	}

	@Override
	public void brake() {
		System.out.println("Apasa maneta de frana.");
		
	}

	public boolean hasSuspensions() {
		return suspensions;
	}

	@Override
	public String toString() {
		return super.toString() + " [suspensions=" + suspensions + "]";
	}
	
}
