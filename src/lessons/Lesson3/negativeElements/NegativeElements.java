package lessons.Lesson3.negativeElements;

public class NegativeElements {

	public static void main(String[] args) {

		int myArray[] = { 5, -12, 11, -8, 0, 4, 20, 38, 45, 69, -18, 33, -74, 21, -61 };
		int value = 0; // переменная для нахождения отрицательных эл-тов
		int sum = 0; // переменная кол-ва отрицательных элементов
		System.out.print("Negative elements:");
		for (int i = 0; i < myArray.length; i++) {
			if (value > myArray[i]) {
				System.out.print(" " + myArray[i]);
				sum = sum + 1;
			}
		}
		System.out.print("\nThe number of negative elements: " + sum);
	}

}
