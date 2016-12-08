package Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
		boolean inspection = true;
		Car each = null;
		String str = taxiPark.toString();

		try (Scanner scan = new Scanner(System.in);
				Scanner secondScan = new Scanner(System.in);
				Scanner thirdScan = new Scanner(System.in);
				Scanner fourthScan = new Scanner(System.in);) {
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
					System.out.println("4. Write a file:");
					System.out.println("5. Read from file:");
					System.out.println("6. Exit" + "\n");
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
							System.out.println(
									"\n" + each.carName + "\nFuel consumprion: " + each.fuelConsumption + "\n");
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
						if (each.acceleration < firstRange || each.acceleration > secondRange) {
							System.out.println("\n" + "We haven't got cars for you" + "\n");
						}
					}
					if (secondNum == 4) {
						try (FileOutputStream output = new FileOutputStream("C:\\Users\\malevich\\Desktop\\File.txt")) {
							byte[] byteFile = str.getBytes();
							output.write(byteFile);
							System.out.println("\n" + "Done!" + "\n");
						} catch (IOException e1) {
							System.out.println("Input/Output error!");
						}
					}
					if (secondNum == 5) {
						try (FileInputStream input = new FileInputStream("C:\\Users\\malevich\\Desktop\\File.txt")) {
							byte[] byteFile = new byte[input.available()];
							input.read(byteFile, 0, input.available());
							System.out.print("\n");
							for (int i = 0; i < byteFile.length; i++) {
								System.out.print((char) byteFile[i]);
							}
							System.out.println("\n");
						} catch (FileNotFoundException e1) {
							System.out.println("File not found!");
						} catch (IOException e1) {
							System.out.println("Input/Output error!");
						}
					}
					if (secondNum == 6) {
						inspection = false;
						System.out.println("\nProgramm closed.");
					}
					if (secondNum > 6) {
						System.out.println("\nHaven't got variants, please try again\n");
					}
					break;
				case 3:
					inspection = false;
					System.out.println("\nProgramm closed.");
					break;
				default:
					System.out.println("\n" + "We haven't got variants, please try again" + "\n");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("\n" + "Error - not a number!");
		}
	}
}
