package Project;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

class Run {

	public static void main(String[] args) {

		LinkedHashSet<Car> taxiPark = new LinkedHashSet<Car>();
		Minibus a = new Minibus("Mercedes V-250", 60600, 6.0, 9.1, 5, true);
		taxiPark.add(a);
		taxiPark.add(new Minivan("Dodge Grand Caravan", 24590, 12.4, 10.8, 7, true));
		taxiPark.add(new Pickup("Volkswagen Amarok", 25000, 7.9, 11.1, 4, 189));
		taxiPark.add(new Cabrio("Mercedes E400", 63800, 9.4, 5.2, 3.0, "Leather"));
		taxiPark.add(new Sedan("Audi A8 4.0 TFSI", 105060, 9.1, 4.5, 4.0, "Quattro"));
		taxiPark.add(new Touring("BMW 550i GT", 112500, 9.6, 4.8, 4.4, "Tip-Tronic"));

		System.out.println("1. Show the value of all park's cars:");
		System.out.println("2. Show park's cars according to information:");
		System.out.println("3. Exit");
		Scanner scan = new Scanner(System.in);
		try {
			boolean x = true;
			while (x) {
				int num = scan.nextInt();
				switch (num) {
				case 1:
					Iterator<Car> iterator = taxiPark.iterator();
					int costOfPark = 0;
					while (iterator.hasNext()) {
						Car each = iterator.next();
						costOfPark += each.price;
					}
					System.out.println(costOfPark + "$");
					break;
				case 2:
					System.out.println("1. Test");
					System.out.println("2. Test");
					switch (num) {
					case 1:				
					case 2:
						System.out.println("2. Test1.2");
					}
					break;
				default:
					if (num == 3) {
						x = false;
						System.exit(num);
					}
					System.out.println("Press 1-3");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Please, enter numbers");
		}
	}
}
