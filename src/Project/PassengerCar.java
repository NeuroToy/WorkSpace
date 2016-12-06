package Project;

public class PassengerCar extends TaxiPark {

	double engine;

	public PassengerCar(String a, int b, double c, double d, double e) {
		super(a, b, c, d);
		engine = e;
	}

	public String toString() {
		return super.toString() + "\nEngine: " + engine;
	}
}
