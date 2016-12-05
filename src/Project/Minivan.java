package Project;

public class Minivan extends Suv {

	boolean babyChair;

	public Minivan(String a, int b, double c, double d, int e, boolean f) {
		super(a, b, c, d, e);
		babyChair = f;
	}
	
	@Override
	public String toString() {
		return carName + "\nFuel consumption: " + fuelConsumption + "\nAcceleration: " + acceleration + "\nCar price: "
				+ price + "$" + "\nMax passengers: " + maxCapacity + "\nBaby chair: " + babyChair;
	}
}
