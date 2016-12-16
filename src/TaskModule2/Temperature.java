package TaskModule2;

public class Temperature {

	private String value;
	private int size;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Temperature() {
	}

	public Temperature(String value, int size) {
		this.value = value;
		this.size = size;
	}
}
