package bread.machine;

public class Model {

	private String name;
	private Make make;

	public Model(String name, Make make) {
		this.name = name;
		this.make = make;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Make getMake() {
		return make;
	}

	public void setMake(Make make) {
		this.make = make;
	}

}
