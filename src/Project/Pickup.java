package Project;

public class Pickup extends Suv {

	private static final long serialVersionUID = 1L;
	double bodyCapacity;

	public double getBodyCapacity() {
		return bodyCapacity;
	}

	public void setBodyCapacity(double bodyCapacity) {
		this.bodyCapacity = bodyCapacity;
	}

	public Pickup(String a, int b, double c, Double d, int e, double f) {
		super(a, b, c, d, e);
		bodyCapacity = f;
	}

	@Override
	public String toString() {
		return super.toString() + "\nBody capacity: " + bodyCapacity + "litres";
	}
}
