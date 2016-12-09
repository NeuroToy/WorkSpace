package Project;

public class Sedan extends PassengerCar {

	private static final long serialVersionUID = 1L;
	String typeOfTransmission;

	public String getTypeOfTransmission() {
		return typeOfTransmission;
	}

	public void setTypeOfTransmission(String typeOfTransmission) {
		this.typeOfTransmission = typeOfTransmission;
	}

	public Sedan(String a, int b, double c, double d, Double e, String f) {
		super(a, b, c, d, e);
		typeOfTransmission = f;
	}

	@Override
	public String toString() {
		return super.toString() + "\nType of transmission: " + typeOfTransmission;
	}
}
