package Project;

public class Minibus extends Suv {

	private static final long serialVersionUID = 1L;
	boolean tv;

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public Minibus(String a, int b, double c, Double d, int e, boolean f) {
		super(a, b, c, d, e);
		tv = f;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTV option: " + tv;
	}
}
