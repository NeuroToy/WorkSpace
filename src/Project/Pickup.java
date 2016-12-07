package Project;

public class Pickup extends Suv {

	double bodyCapacity;

	public Pickup(String a, int b, double c, Double d, int e, double f) {
		super(a, b, c, d, e);
		bodyCapacity = f;
	}

	@Override
	public String toString() {
		return super.toString() + "\nBody capacity: " + bodyCapacity + "litres";
	}
}
