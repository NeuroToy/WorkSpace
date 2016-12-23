package Project;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Operations {

	private static Car each = null;

	public static void showAll(List<Car> taxiPark) {
		for (Car x : taxiPark) {
			System.out.print("\n" + x + "\n");
		}
	}

	public static void showPrice(List<Car> taxiPark) {
		Iterator<Car> itr = taxiPark.iterator();
		int costOfPark = 0;
		while (itr.hasNext()) {
			each = itr.next();
			costOfPark += each.getPrice();
		}
		System.out.println("\n" + costOfPark + "$" + "\n");
	}
	
	public static void sortByFuel(List<Car> taxiPark) {
		Collections.sort(taxiPark, new Comparator<Car>() {
			public int compare(Car a, Car b) {
				return a.getFuelConsumption().compareTo(b.getFuelConsumption());
			}
		});
		Iterator<Car> itr = taxiPark.iterator();
		while (itr.hasNext()) {
			each = itr.next();
			System.out.println(
					"\n" + each.getCarName() + Messages.getString("Run.27") + each.getFuelConsumption() + "\n");
		}
	}

	public static void sortByAcceleration(List<Car> taxiPark, double firstRange, double secondRange) {
		Iterator<Car> itr = taxiPark.iterator();
		while (itr.hasNext()) {
			each = itr.next();
			if (each.getAcceleration() >= firstRange && each.getAcceleration() <= secondRange) {
				System.out.println(
						"\n" + each.getCarName() + Messages.getString("Run.31") + each.getAcceleration() + "\n");
			}
		}
		if (each.getAcceleration() < firstRange || secondRange < 4.5) {
			System.out.println(Messages.getString("Run.33"));
		}
	}
}
