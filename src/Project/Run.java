package Project;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Run {

	public static void main(String[] args) {

		LinkedHashSet<TaxiPark> taxiPark = new LinkedHashSet<TaxiPark>();
		taxiPark.add(new Minibus("Mercedes V-250", 60600, 6.0, 9.1, 5, true));
		taxiPark.add(new Minivan("Dodge Grand Caravan", 24590, 12.4, 10.8, 7, true));
		taxiPark.add(new Pickup("Volkswagen Amarok", 25000, 7.9, 11.1, 4, 189));
		for (TaxiPark c : taxiPark) {
			System.out.print(c + "\n\n");
		}
		Iterator<TaxiPark> it = taxiPark.iterator();
	}
}
