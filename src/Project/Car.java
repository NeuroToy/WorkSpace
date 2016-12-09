package Project;

import java.io.Serializable;

/**
 * Класс служит для хранения объектов со свойствами <br>
 * <b>carName</b> <br>
 * <b>price</b> <br>
 * <b>acceleration</b> <br>
 * <b>fuelConsumption</b>
 * 
 * @author malevich
 */
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;
	/** Свойство - имя */
	private String carName;
	/** Свойство - цена */
	private int price;
	/** Свойство - ускорение */
	private double acceleration;
	/** Свойство - расход топлива */
	private Double fuelConsumption;

	/**
	 * Функция для получения значения поля {@link Car#carName}
	 * 
	 * @return Имя машины
	 */
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	/**
	 * Функция для получения значения поля {@link Car#price}
	 * 
	 * @return цена
	 */
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Функция для получения значения поля {@link Car#acceleration}
	 * 
	 * @return ускорение
	 */
	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	/**
	 * Функция для получения значения поля {@link Car#fuelConsumption}
	 * 
	 * @return расход топлива
	 */
	public Double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(Double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	/**
	 * Создает новый объект с заданными значениями
	 * 
	 * @param carName
	 *            имя
	 * @param price
	 *            цена
	 * @param acceleration
	 *            ускорение
	 * @param fuelConsumption
	 *            расход топлива
	 */
	public Car(String carName, int price, double acceleration, Double fuelConsumption) {
		this.carName = carName;
		this.price = price;
		this.acceleration = acceleration;
		this.fuelConsumption = fuelConsumption;
	}

	/**
	 * @return строку с заданными значениями
	 */
	@Override
	public String toString() {
		return carName + "\nCar price: " + price + "$" + "\nAcceleration: " + acceleration + "\nFuel consumption: "
				+ fuelConsumption;
	}

}