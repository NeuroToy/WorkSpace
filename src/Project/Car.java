package Project;

public class Car { //implements Comparable<Car>

	String carName;
	int price;
	double acceleration;
	Double fuelConsumption;

	public Car(String a, int b, double c, Double d) {
		carName = a;
		price = b;
		acceleration = c;
		fuelConsumption = d;
	}

	public Double getFuelConsumption() {
		return fuelConsumption;
	}

	public String toString() {
		return carName + "\nCar price: " + price + "$" + "\nAcceleration: " + acceleration + "\nFuel consumption: "
				+ fuelConsumption;
	}

//	public int compareTo(Car a) {
//		return fuelConsumption.compareTo(a.getFuelConsumption());
//	}
}