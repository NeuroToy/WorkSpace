package Project;

public class Car { //implements Comparable<Car>

	private String carName;
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	public void setFuelConsumption(Double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	private int price;
	private double acceleration;
	private Double fuelConsumption;

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

}