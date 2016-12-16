package TaskModule2;

public class Plant {

	private String name;
	private String soil;
	private String origin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoil() {
		return soil;
	}

	public void setSoil(String soil) {
		this.soil = soil;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public Plant (String name, String soil, String origin) {
		this.name = name;
		this.origin = origin;
		this.soil = soil;
	}
}