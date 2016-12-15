package Project;

public class Pickup extends Suv {

	private static final long serialVersionUID = 1L;
	private double bodyCapacity;

	public double getBodyCapacity() {
		return bodyCapacity;
	}

	public void setBodyCapacity(double bodyCapacity) {
		this.bodyCapacity = bodyCapacity;
	}

	public Pickup(String a, int b, double c, Double d, int e, double bodyCapacity) {
		super(a, b, c, d, e);
		this.bodyCapacity = bodyCapacity;
	}

	@Override
	public String toString() {
		return super.toString() + Messages.getString("Pickup.0") + bodyCapacity + Messages.getString("Pickup.1");
	}
}
