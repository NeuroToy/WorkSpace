package TaskModule2;

public class Plant {

	private static String name;
	private static String soil;
	private static String origin;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Plant.name = name;
	}

	public static String getSoil() {
		return soil;
	}

	public static void setSoil(String soil) {
		Plant.soil = soil;
	}

	public static String getOrigin() {
		return origin;
	}

	public static void setOrigin(String origin) {
		Plant.origin = origin;
	}
}