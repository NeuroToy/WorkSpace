package Project;

public class Minibus extends Suv {

	private static final long serialVersionUID = 1L;
	private boolean tv;

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public Minibus(String a, int b, double c, Double d, int e, boolean tv) {
		super(a, b, c, d, e);
		this.tv = tv;
	}

	@Override
	public String toString() {
		return super.toString() + Messages.getString("Minibus.0") + tv;
	}
}
