package lessons.Lesson3.newArray;

public class NewArray {

	public static void main(String[] args) {

		float newArray[] = { 3, -5, 6, 17, 28, 33, -4, -11, 9, -15 };
		float value = 0; // переменная суммы
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(" " + newArray[i] + " " + "|");
			value = value + newArray[i]; // сумма

		}

		System.out.println("\n" + "averrage value = " + value / newArray.length); // ср.
																					// арифметическое
	}

}
