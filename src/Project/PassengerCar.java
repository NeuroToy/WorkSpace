package Project;

public class PassengerCar extends TaxiPark {

	double engine;

	public PassengerCar(String a, int b, double c, double d, double e) {
		super(a, b, c, d);
		engine = e;
	}

	public String toString() {
		return carName + "\nFuel consumption: " + fuelConsumption + "\nAcceleration: " + acceleration + "\nCar price: "
				+ price + "$" + "\nEngine: " + engine;
	}
}
