package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Collection {

	private static Car each = null;

	public static void showAll(ArrayList<Car> collection) {
		for (Car x : collection) {
			System.out.print("\n" + x + "\n");
		}
	}

	public static void showPrice(ArrayList<Car> collection) {
		Iterator<Car> itr = collection.iterator();
		int costOfPark = 0;
		while (itr.hasNext()) {
			each = itr.next();
			costOfPark += each.getPrice();
		}
		System.out.println("\n" + costOfPark + "$" + "\n");
	}

	public static void sortByFuel(ArrayList<Car> collection) {
		Collections.sort(collection, new Comparator<Car>() {
			public int compare(Car a, Car b) {
				return a.getFuelConsumption().compareTo(b.getFuelConsumption());
			}
		});
		Iterator<Car> itr = collection.iterator();
		while (itr.hasNext()) {
			each = itr.next();
			System.out.println(
					"\n" + each.getCarName() + Messages.getString("Run.27") + each.getFuelConsumption() + "\n");
		}
	}

	public static void sortByAcceleration(ArrayList<Car> collection, double first, double second) {
		Iterator<Car> itr = collection.iterator();
		while (itr.hasNext()) {
			each = itr.next();
			if (each.getAcceleration() >= first && each.getAcceleration() <= second) {
				System.out.println(
						"\n" + each.getCarName() + Messages.getString("Run.31") + each.getAcceleration() + "\n");
			}
		}
		if (each.getAcceleration() < first || second < 4.5) {
			System.out.println(Messages.getString("Run.33"));
		}
	}
}
