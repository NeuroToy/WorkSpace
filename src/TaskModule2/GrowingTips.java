package TaskModule2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "temperature",
    "watering"
})
public class GrowingTips {

	@XmlElement(required = true)
	private Temperature temperature = new Temperature();
	@XmlElement(required = true)
	private Watering watering = new Watering();

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	public Watering getWatering() {
		return watering;
	}

	public void setWatering(Watering watering) {
		this.watering = watering;
	}

	public GrowingTips() {
	}

	public GrowingTips(Temperature temperature, Watering watering) {
		this.temperature = temperature;
		this.watering = watering;
	}
}
