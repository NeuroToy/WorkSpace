package Project;

public class Minivan extends Suv {

	private static final long serialVersionUID = 1L;
	boolean babyChair;

	public boolean isBabyChair() {
		return babyChair;
	}

	public void setBabyChair(boolean babyChair) {
		this.babyChair = babyChair;
	}

	public Minivan(String a, int b, double c, Double d, int e, boolean f) {
		super(a, b, c, d, e);
		babyChair = f;
	}

	@Override
	public String toString() {
		return super.toString() + "\nBaby chair: " + babyChair;
	}
}
