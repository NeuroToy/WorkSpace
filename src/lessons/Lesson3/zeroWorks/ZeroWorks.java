package lessons.Lesson3.zeroWorks;

public class ZeroWorks {

	public static void main(String[] args) {

		int myArray[] = { 5, 0, 0, -8, 0, 4, 20, 38, 0, 0, -18, 33, -74, 21, 1 };
		System.out.print("Array:\n");
		for (int i = 0; i < myArray.length; i++) { // объявление массива
			System.out.print(" " + myArray[i]);
		}
		for (int i = myArray.length - 1; i > 0; i--) { // пузырьковая сортировка
			for (int j = 0; j < i; j++) {
				if (myArray[j] == 0) {
					int tmp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = tmp;
				}
			}
		}
		System.out.print("\nNew array:\n"); // объявление сортированного массива
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(" " + myArray[i]);
		}
	}
}
