package TaskModule2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "reproduction" })
public class Multiplying {

	@XmlElement(required = true)
	private String reproduction;

	public String getReproduction() {
		return reproduction;
	}

	public void setReproduction(String reproduction) {
		this.reproduction = reproduction;
	}

	public Multiplying() {
	}

	public Multiplying(String reproduction) {
		this.reproduction = reproduction;
	}

	@Override
	public String toString() {
		return "\n\treproduction = " + reproduction;
	}
}
