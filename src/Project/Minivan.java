package Project;

public class Minivan extends Suv {

	private static final long serialVersionUID = 1L;
	private boolean babyChair;

	public boolean isBabyChair() {
		return babyChair;
	}

	public void setBabyChair(boolean babyChair) {
		this.babyChair = babyChair;
	}

	public Minivan(String a, int b, double c, Double d, int e, boolean babyChair) {
		super(a, b, c, d, e);
		this.babyChair = babyChair;
	}

	@Override
	public String toString() {
		return super.toString() + Messages.getString("Minivan.0") + babyChair;
	}
}
