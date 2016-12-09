package Project;

public class Touring extends PassengerCar {

	private static final long serialVersionUID = 1L;
	String driveUnit;

	public String getDriveUnit() {
		return driveUnit;
	}

	public void setDriveUnit(String driveUnit) {
		this.driveUnit = driveUnit;
	}

	public Touring(String a, int b, double c, Double d, double e, String f) {
		super(a, b, c, d, e);
		driveUnit = f;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDrive unit: " + driveUnit;
	}
}
