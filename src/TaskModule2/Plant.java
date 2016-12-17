package TaskModule2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "name", "soil", "origin", "visualParameters", "growingTips", "multiplying" })
public class Plant {

	@XmlElement(required = true)
	private String name;
	@XmlElement(required = true)
	private String soil;
	@XmlElement(required = true)
	private String origin;
	@XmlElement(required = true)
	private VisualParameters visualParameters;
	@XmlElement(required = true)
	private GrowingTips growingTips;
	@XmlElement(required = true)
	private Multiplying multiplying;

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

	@Override
	public String toString() {
		return "\nPlant:\nname = " + name + "\nsoil = " + soil + "\norigin = " + origin + "\nvisualparameters:"
				+ visualParameters + "\ngrowingtips:" + growingTips + "\nmultiplying:" + multiplying + "\n";
	}
}