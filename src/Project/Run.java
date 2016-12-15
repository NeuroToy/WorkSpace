package Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Run {

	public static void main(String[] args) {

		List<Car> taxiPark = new ArrayList<Car>();
		taxiPark.add(new Minibus("Mercedes V-250", 60600, 9.1, 6.0, 5, true));
		taxiPark.add(new Minivan("Dodge Grand Caravan", 24590, 10.8, 12.4, 7, true));
		taxiPark.add(new Pickup("Volkswagen Amarok", 25000, 11.1, 7.9, 4, 189));
		taxiPark.add(new Cabrio("Mercedes E400", 63800, 5.2, 9.4, 3.0, "Leather"));
		taxiPark.add(new Sedan("Audi A8 4.0 TFSI", 105060, 4.5, 9.1, 4.0, "Quattro"));
		taxiPark.add(new Touring("BMW 550i GT Touring", 112500, 4.8, 9.6, 4.4, "Tip-Tronic"));
		boolean inspection = true;
		Car each = null;

		try (Scanner scan = new Scanner(System.in);
				ObjectOutputStream output = new ObjectOutputStream(
						new FileOutputStream("C:\\Users\\Public\\Documents\\File.txt"));
				ObjectInputStream input = new ObjectInputStream(
						new FileInputStream("C:\\Users\\Public\\Documents\\File.txt"))) {
			System.out.println("1. EN");
			System.out.println("2. RU\n");
			int loc = scan.nextInt();
			if (loc == 1) {
				Locale.setDefault(new Locale("en", "US"));
			}
			if (loc == 2) {
				Locale.setDefault(new Locale("ru", "RU"));
			}
			while (inspection) {
				System.out.println(Messages.getString("Run.11"));
				System.out.println(Messages.getString("Run.12"));
				System.out.println(Messages.getString("Run.13"));
				int num = scan.nextInt();
				switch (num) {
				case 1:
					for (Car x : taxiPark) {
						System.out.print("\n" + x + "\n");
					}
					System.out.println("\n");
					break;
				case 2:
					System.out.println(Messages.getString("Run.17"));
					System.out.println(Messages.getString("Run.18"));
					System.out.println(Messages.getString("Run.19"));
					System.out.println(Messages.getString("Run.20"));
					System.out.println(Messages.getString("Run.21"));
					System.out.println(Messages.getString("Run.22"));
					int secondNum = scan.nextInt();
					if (secondNum == 1) {
						Iterator<Car> itr = taxiPark.iterator();
						int costOfPark = 0;
						while (itr.hasNext()) {
							each = itr.next();
							costOfPark += each.getPrice();
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
							System.out.println("\n" + each.getCarName() + Messages.getString("Run.27")
									+ each.getFuelConsumption() + "\n");
						}
					}
					if (secondNum == 3) {
						System.out.print(Messages.getString("Run.29"));
						double firstRange = scan.nextDouble();
						double secondRange = scan.nextDouble();
						Iterator<Car> itr = taxiPark.iterator();
						while (itr.hasNext()) {
							each = itr.next();
							if (each.getAcceleration() >= firstRange && each.getAcceleration() <= secondRange) {
								System.out.println("\n" + each.getCarName() + Messages.getString("Run.31")
										+ each.getAcceleration() + "\n");
							}
						}
						if (each.getAcceleration() < firstRange || secondRange < 4.5) {
							System.out.println(Messages.getString("Run.33"));
						}
					}
					if (secondNum == 4) {
						output.writeObject(taxiPark);
						System.out.println(Messages.getString("Run.34"));
					}
					if (secondNum == 5) {
						Object file_1 = input.readObject();
						System.out.print("\n" + file_1 + "\n\n");
					}
					if (secondNum == 6) {
						inspection = false;
						System.out.println(Messages.getString("Run.37"));
					}
					if (secondNum > 6) {
						System.out.println(Messages.getString("Run.38"));
					}
					break;
				case 3:
					inspection = false;
					System.out.println(Messages.getString("Run.39"));
					break;
				default:
					System.out.println(Messages.getString("Run.38"));
				}
			}
		} catch (InputMismatchException e) {
			System.out.println(Messages.getString("Run.41"));
		} catch (FileNotFoundException e1) {
			System.out.println(Messages.getString("Run.42"));
		} catch (IOException e1) {
			System.out.println(Messages.getString("Run.43"));
		} catch (ClassNotFoundException e1) {
			System.out.println(Messages.getString("Run.44"));
		}
	}
}
