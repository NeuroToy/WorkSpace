package TaskModule2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "soil",
    "origin",
    "visualParameters",
    "growingTips",
    "multiplying"
})
public class Plant {

	@XmlElement(required = true)
	private String name;
	@XmlElement(required = true)
	private String soil;
	@XmlElement(required = true)
	private String origin;
	@XmlElement(required = true)
	private VisualParameters visualParameters = new VisualParameters();
	@XmlElement(required = true)
	private GrowingTips growingTips = new GrowingTips();
	@XmlElement(required = true)
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
	
	@Override
	public String toString() {
		return "Plant [name=" + name + ", soil=" + soil + ", origin=" + origin + ", visualParameters="
				+ visualParameters + ", growingTips=" + growingTips + ", multiplying=" + multiplying + "]";
	}
}