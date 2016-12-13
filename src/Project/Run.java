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
import java.util.Scanner;

class Run {

	public static void main(String[] args) {

		List<Car> taxiPark = new ArrayList<Car>();
		taxiPark.add(new Minibus("Mercedes V-250", 60600, 9.1, 6.0, 5, true)); //$NON-NLS-1$
		taxiPark.add(new Minivan("Dodge Grand Caravan", 24590, 10.8, 12.4, 7, true)); //$NON-NLS-1$
		taxiPark.add(new Pickup("Volkswagen Amarok", 25000, 11.1, 7.9, 4, 189)); //$NON-NLS-1$
		taxiPark.add(new Cabrio("Mercedes E400", 63800, 5.2, 9.4, 3.0, "Leather")); //$NON-NLS-1$ //$NON-NLS-2$
		taxiPark.add(new Sedan("Audi A8 4.0 TFSI", 105060, 4.5, 9.1, 4.0, "Quattro")); //$NON-NLS-1$ //$NON-NLS-2$
		taxiPark.add(new Touring("BMW 550i GT Touring", 112500, 4.8, 9.6, 4.4, "Tip-Tronic")); //$NON-NLS-1$ //$NON-NLS-2$
		boolean inspection = true;
		Car each = null;

		try (Scanner scan = new Scanner(System.in);
				ObjectOutputStream output = new ObjectOutputStream(
						new FileOutputStream("C:\\Users\\Public\\Documents\\File.txt")); //$NON-NLS-1$
				ObjectInputStream input = new ObjectInputStream(
						new FileInputStream("C:\\Users\\Public\\Documents\\File.txt"))) { //$NON-NLS-1$
			while (inspection) {
				System.out.println(Messages.getString("Run.11")); //$NON-NLS-1$
				System.out.println(Messages.getString("Run.12")); //$NON-NLS-1$
				System.out.println(Messages.getString("Run.13")); //$NON-NLS-1$
				int num = scan.nextInt();
				switch (num) {
				case 1:
					for (Car x : taxiPark) {
						System.out.print("\n" + x + "\n"); //$NON-NLS-1$ //$NON-NLS-2$
					}
					System.out.println("\n"); //$NON-NLS-1$
					break;
				case 2:
					System.out.println(Messages.getString("Run.17")); //$NON-NLS-1$
					System.out.println(Messages.getString("Run.18")); //$NON-NLS-1$
					System.out.println(Messages.getString("Run.19")); //$NON-NLS-1$
					System.out.println(Messages.getString("Run.20")); //$NON-NLS-1$
					System.out.println(Messages.getString("Run.21")); //$NON-NLS-1$
					System.out.println(Messages.getString("Run.22")); //$NON-NLS-1$
					int secondNum = scan.nextInt();
					if (secondNum == 1) {
						Iterator<Car> itr = taxiPark.iterator();
						int costOfPark = 0;
						while (itr.hasNext()) {
							each = itr.next();
							costOfPark += each.getPrice();
						}
						System.out.println("\n" + costOfPark + "$\n"); //$NON-NLS-1$ //$NON-NLS-2$
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
							System.out.println("\n" + each.getCarName() + Messages.getString("Run.26") //$NON-NLS-1$ //$NON-NLS-2$
									+ each.getFuelConsumption() + "\n"); //$NON-NLS-1$
						}
					}
					if (secondNum == 3) {
						System.out.print(Messages.getString("Run.28")); //$NON-NLS-1$
						double firstRange = scan.nextDouble();
						double secondRange = scan.nextDouble();
						Iterator<Car> itr = taxiPark.iterator();
						while (itr.hasNext()) {
							each = itr.next();
							if (each.getAcceleration() >= firstRange && each.getAcceleration() <= secondRange) {
								System.out.println(
										"\n" + each.getCarName() + Messages.getString("Run.30") + each.getAcceleration() + "\n"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
							}
						}
						if (each.getAcceleration() < firstRange || secondRange < 4.5) {
							System.out.println(Messages.getString("Run.32")); //$NON-NLS-1$
						}
					}
					if (secondNum == 4) {
						output.writeObject(taxiPark);
						System.out.println(Messages.getString("Run.33")); //$NON-NLS-1$
					}
					if (secondNum == 5) {
						Object file_1 = input.readObject();
						System.out.print("\n" + file_1 + "\n\n"); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (secondNum == 6) {
						inspection = false;
						System.out.println(Messages.getString("Run.36")); //$NON-NLS-1$
					}
					if (secondNum > 6) {
						System.out.println(Messages.getString("Run.37")); //$NON-NLS-1$
					}
					break;
				case 3:
					inspection = false;
					System.out.println(Messages.getString("Run.38")); //$NON-NLS-1$
					break;
				default:
					System.out.println(Messages.getString("Run.39")); //$NON-NLS-1$
				}
			}
		} catch (InputMismatchException e) {
			System.out.println(Messages.getString("Run.40")); //$NON-NLS-1$
		} catch (FileNotFoundException e1) {
			System.out.println(Messages.getString("Run.41")); //$NON-NLS-1$
		} catch (IOException e1) {
			System.out.println(Messages.getString("Run.42")); //$NON-NLS-1$
		} catch (ClassNotFoundException e1) {
			System.out.println(Messages.getString("Run.43")); //$NON-NLS-1$
		}
	}
}
