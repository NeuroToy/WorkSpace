package TaskModule2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "size"
})
public class VisualParameters {

	@XmlAttribute(name = "color")
	private String color;
	@XmlElement(required = true)
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