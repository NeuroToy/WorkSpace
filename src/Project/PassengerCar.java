package Project;

public class PassengerCar extends Car {

	private static final long serialVersionUID = 1L;
	private double engine;

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public PassengerCar(String a, int b, double c, Double d, double engine) {
		super(a, b, c, d);
		this.engine = engine;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEngine: " + engine;
	}
}
