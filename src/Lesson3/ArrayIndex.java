package Lesson3;

public class ArrayIndex {

	public static void main(String[] args) {

		int myArray[] = { 5, -12, 11, -8, 0, 4, 20, 38, 45, 69, -18, 33, -74, 21, -61 }; // создали
																							// массив
		int min = myArray[0]; // переменная для присвоения минимального значения
		int indexOfArray = 0; // индекс
		System.out.print("Array:\n"); // вывели массив

		for (int i = 0; i < myArray.length; i++) {
			if (min > myArray[i]) { // если переменная больше, то присваивается
									// меньшее значение
				min = myArray[i];
				indexOfArray = i; // индекс переменной
			}
			System.out.print(" " + myArray[i]);
		}
		System.out.println("\nYour's min value = " + min + "\nIndex of array = " + indexOfArray);
	}
}
