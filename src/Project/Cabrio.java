package Project;

public class Cabrio extends PassengerCar {

	String trim;

	public Cabrio(String a, int b, double c, Double d, double e, String f) {
		super(a, b, c, d, e);
		trim = f;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSalon trim: " + trim;
	}
}
