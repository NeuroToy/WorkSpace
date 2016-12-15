package Project;

public class Touring extends PassengerCar {

	private static final long serialVersionUID = 1L;
	private String driveUnit;

	public String getDriveUnit() {
		return driveUnit;
	}

	public void setDriveUnit(String driveUnit) {
		this.driveUnit = driveUnit;
	}

	public Touring(String a, int b, double c, Double d, double e, String driveUnit) {
		super(a, b, c, d, e);
		this.driveUnit = driveUnit;
	}

	@Override
	public String toString() {
		return super.toString() + Messages.getString("Touring.0") + driveUnit;
	}
}
