package lessons.Lesson3.maxMin;

public class MaxMin {

	public static void main(String[] args) {
		
		int myArray[] = {3, -16, -98, 15, 4, 2, 6, 26, -6, -31};
		int min = myArray[0];                              //переменная мин
		int max = myArray[0];                              //переменная макс
		for (int i = 0; i < myArray.length; i++) {         //нахождение мимума
			if (min > myArray[i]) {
				min = myArray[i];
			}
			
			System.out.print(" " + myArray[i]);
		}
		
		for (int i = 0; i < myArray.length; i++) {         //нахождение максимума
			if (max < myArray[i]) {
				max = myArray[i];
			}
			
		}
		
		System.out.println("\nmin value = " + min);          //вывод
		System.out.println("max value = " + max);

	}

}