package Project;

public class Sedan extends PassengerCar {

	private static final long serialVersionUID = 1L;
	private String typeOfTransmission;

	public String getTypeOfTransmission() {
		return typeOfTransmission;
	}

	public void setTypeOfTransmission(String typeOfTransmission) {
		this.typeOfTransmission = typeOfTransmission;
	}

	public Sedan(String a, int b, double c, double d, Double e, String typeOfTransmission) {
		super(a, b, c, d, e);
		this.typeOfTransmission = typeOfTransmission;
	}

	@Override
	public String toString() {
		return super.toString() + "\nType of transmission: " + typeOfTransmission;
	}
}
