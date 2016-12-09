package Project;

public class Suv extends Car {

	int maxCapacity;

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Suv(String a, int b, double c, Double d, int e) {
		super(a, b, c, d);
		maxCapacity = e;
	}

	@Override
	public String toString() {
		return super.toString() + "\nMax passengers: " + maxCapacity;
	}
}
