package Project;

class TaxiPark {

	String carName;
	int price;
	double fuelConsumption;
	double acceleration;

	public TaxiPark(String a, int b, double c, double d) {
		carName = a;
		price = b;
		fuelConsumption = c;
		acceleration = d;
	}

	public String toString() {
		return carName + "\nFuel consumption: " + fuelConsumption + "\nAcceleration: " + acceleration + "\nCar price: "
				+ price + "$";
	}
}