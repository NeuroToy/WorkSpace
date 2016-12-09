package Project;

public class Cabrio extends PassengerCar {

	private static final long serialVersionUID = 1L;
	private String trim;

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}

	public Cabrio(String a, int b, double c, Double d, double e, String trim) {
		super(a, b, c, d, e);
		this.trim = trim;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSalon trim: " + trim;
	}
}
