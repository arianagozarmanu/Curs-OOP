package t2.vehicule;

/**
 * 
 * @author arianagm
 *
 */
public abstract class Vehicle implements VehicleInterface {

	private String make;
	private String model;
	private long price;
	
	public Vehicle(String make, String model, long price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price="
				+ price + "]";
	}

}
