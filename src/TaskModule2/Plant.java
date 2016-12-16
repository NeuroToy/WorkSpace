package TaskModule2;

public class Plant {

	private String name;
	private String soil;
	private String origin;
	private VisualParameters visualParameters = new VisualParameters();
	private GrowingTips growingTips = new GrowingTips();
	private Multiplying multiplying = new Multiplying();

	public VisualParameters getVisualParameters() {
		return visualParameters;
	}

	public void setVisualParameters(VisualParameters visualParameters) {
		this.visualParameters = visualParameters;
	}

	public GrowingTips getGrowingTips() {
		return growingTips;
	}

	public void setGrowingTips(GrowingTips growingTips) {
		this.growingTips = growingTips;
	}

	public Multiplying getMultiplying() {
		return multiplying;
	}

	public void setMultiplying(Multiplying multiplying) {
		this.multiplying = multiplying;
	}

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

	public Plant() {
	}

	public Plant(String name, String soil, String origin, VisualParameters visualParameters, GrowingTips growingTips,
			Multiplying multiplying) {
		this.name = name;
		this.origin = origin;
		this.soil = soil;
		this.visualParameters = visualParameters;
		this.growingTips = growingTips;
		this.multiplying = multiplying;
	}
	
	public String toString() {
		return name ;
	}
}