package TaskModule2;

public class GrowingTips {

	private Temperature temperature = new Temperature();
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
