package Project;

public class PassengerCar extends Car {

	double engine;

	public PassengerCar(String a, int b, double c, double d, double e) {
		super(a, b, c, d);
		engine = e;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEngine: " + engine;
	}
}
