package Project;

public class Touring extends PassengerCar {

	String driveUnit;

	public Touring(String a, int b, double c, Double d, double e, String f) {
		super(a, b, c, d, e);
		driveUnit = f;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDrive unit: " + driveUnit;
	}
}
