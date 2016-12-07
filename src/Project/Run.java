package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

class Run {

	public static void main(String[] args) {

		ArrayList<Car> taxiPark = new ArrayList<Car>();
		taxiPark.add(new Minibus("Mercedes V-250", 60600, 9.1, 6.0, 5, true));
		taxiPark.add(new Minivan("Dodge Grand Caravan", 24590, 10.8, 12.4, 7, true));
		taxiPark.add(new Pickup("Volkswagen Amarok", 25000, 11.1, 7.9, 4, 189));
		taxiPark.add(new Cabrio("Mercedes E400", 63800, 5.2, 9.4, 3.0, "Leather"));
		taxiPark.add(new Sedan("Audi A8 4.0 TFSI", 105060, 4.5, 9.1, 4.0, "Quattro"));
		taxiPark.add(new Touring("BMW 550i GT Touring", 112500, 4.8, 9.6, 4.4, "Tip-Tronic"));
		Scanner scan = new Scanner(System.in);
		Scanner secondScan = new Scanner(System.in);
		Scanner thirdScan = new Scanner(System.in);
		Scanner fourthScan = new Scanner(System.in);
		boolean inspection = true;
		Car each;

		try {
			while (inspection) {
				System.out.println("1. Show all park's cars:");
				System.out.println("2. Operations:");
				System.out.println("3. Exit" + "\n");
				int num = scan.nextInt();
				switch (num) {
				case 1:
					for (Car x : taxiPark) {
						System.out.print("\n" + x + "\n");
					}
					System.out.println("\n");
					break;
				case 2:
					System.out.println("\n" + "1. Show the total cost of cars:");
					System.out.println("2. Sort by fuel consumption:");
					System.out.println("3. Find car by acceleration range:");
					System.out.println("4. Exit" + "\n");
					int secondNum = secondScan.nextInt();
					if (secondNum == 1) {
						Iterator<Car> itr = taxiPark.iterator();
						int costOfPark = 0;
						while (itr.hasNext()) {
							each = itr.next();
							costOfPark += each.price;
						}
						System.out.println("\n" + costOfPark + "$" + "\n");
					}
					if (secondNum == 2) {
						Collections.sort(taxiPark, new Comparator<Car>() {
							public int compare(Car a, Car b) {
								return a.getFuelConsumption().compareTo(b.getFuelConsumption());
							}
						});
						Iterator<Car> itr = taxiPark.iterator();
						while (itr.hasNext()) {
							each = itr.next();
							System.out.println("\n" + each + "\n");
						}
					}
					if (secondNum == 3) {
						System.out.print("\n" + "Enter range:" + "\n\n");
						double firstRange = thirdScan.nextDouble();
						double secondRange = fourthScan.nextDouble();
						Iterator<Car> itr = taxiPark.iterator();
						while (itr.hasNext()) {
							each = itr.next();
							if (each.acceleration >= firstRange && each.acceleration <= secondRange) {
								System.out.println("\n" + each.carName + "\nAcceleration: " + each.acceleration + "\n");
							}
						}
					}
					if (secondNum == 4) {
						inspection = false;
						System.out.println("\nProgramm closed.");
						System.exit(num);
					}
					if (secondNum > 4) {
						System.out.println("\nHaven't got variants, please try again\n");
					}
					break;
				case 3:
					inspection = false;
					System.out.println("\nProgramm closed.");
					System.exit(num);
					break;
				default:
					System.out.println("\n" + "Haven't got variants, please try again" + "\n");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("\n" + "Error - not a number!");
		}
		scan.close();
		secondScan.close();
		thirdScan.close();
		fourthScan.close();
	}
}
