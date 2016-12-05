package Project;

public class Pickup extends Suv {

	double bodyCapacity;

	public Pickup(String a, int b, double c, double d, int e, double f) {
		super(a, b, c, d, e);
		bodyCapacity = f;
	}

	@Override
	public String toString() {
		return carName + "\nFuel consumption: " + fuelConsumption + "\nAcceleration: " + acceleration + "\nCar price: "
				+ price + "$" + "\nMax passengers: " + maxCapacity + "\nBody capacity: " + bodyCapacity + "litres";
	}
}
