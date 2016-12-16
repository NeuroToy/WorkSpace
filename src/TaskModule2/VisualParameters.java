package TaskModule2;

public class VisualParameters {

	private String color;
	private int size;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public VisualParameters() {
	}
	
	public VisualParameters(String color, int size) {
		this.color = color;
		this.size = size;
	}
}