package TaskModule2;

public class Watering {

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

	public Watering() {
	}

	public Watering(String value, int size) {
		this.value = value;
		this.size = size;
	}
}
