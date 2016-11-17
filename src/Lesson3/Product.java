package Lesson3;

public class Product {

	public static void main(String[] args) {

		int myArray[] = { 5, -12, 11, -8, 1, 4, 20, 38, 45, 0, -18, 33, -74, 21, -61 };
		int sum = 0;

		for (int i = 0; i < myArray.length; i++) { // проводится переcчёт
													// элементов массива
			System.out.print(" " + myArray[i]); // вывод массива с
												// форматированием
			sum = sum + myArray[i];
			if (myArray[i] == 0) // если элемент массива равняется 0, цикл
									// прерывается
				break;
		}
		System.out.println("\nArray sum = " + sum);
	}
}
