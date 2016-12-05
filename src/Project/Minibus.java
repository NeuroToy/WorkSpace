package Project;

public class Minibus extends Suv {
	
	boolean tv;

	public Minibus(String a, int b, double c, double d, int e, boolean f) {
		super(a, b, c, d, e);
		tv = f;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTV option: " + tv;
	}
}
