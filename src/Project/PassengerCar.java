package Project;

public class PassengerCar extends Car {

	double engine;

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public PassengerCar(String a, int b, double c, Double d, double e) {
		super(a, b, c, d);
		engine = e;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEngine: " + engine;
	}
}
