package Project;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = 1L;
	private String carName;
	private int price;
	private double acceleration;
	private Double fuelConsumption;

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

	public Car(String carName, int price, double acceleration, Double fuelConsumption) {
		this.carName = carName;
		this.price = price;
		this.acceleration = acceleration;
		this.fuelConsumption = fuelConsumption;
	}

	public Double getFuelConsumption() {
		return fuelConsumption;
	}

	public String toString() {
		return carName + "\nCar price: " + price + "$" + "\nAcceleration: " + acceleration + "\nFuel consumption: "
				+ fuelConsumption;
	}

}