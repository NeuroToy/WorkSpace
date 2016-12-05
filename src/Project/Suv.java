package Project;

public class Suv extends TaxiPark {

	int maxCapacity;

	public Suv(String a, int b, double c, double d, int e) {
		super(a, b, c, d);
		maxCapacity = e;
	}

	@Override
	public String toString() {
		return super.toString() + "\nMax passengers: " + maxCapacity;
	}
}
