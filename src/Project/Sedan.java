package Project;

public class Sedan extends PassengerCar {

	String typeOfTransmission;

	public Sedan(String a, int b, double c, double d, Double e, String f) {
		super(a, b, c, d, e);
		typeOfTransmission = f;
	}

	@Override
	public String toString() {
		return super.toString() + "\nType of transmission: " + typeOfTransmission;
	}
}