package lessons.Lesson2.halfString;

import java.util.Scanner;

public class Half {

	public static void main(String[] args) {

		System.out.println("Введите текст:");
		Scanner imput = new Scanner(System.in);
		String full = imput.nextLine();
		int quantity = full.length();
		System.out.println("Кол-во символов: " + quantity);
		int half = quantity / 2;
		String firstPart = full.substring(0, half);
		String secondPart = full.substring(half);
		System.out.println("Первая часть: " + firstPart);
		System.out.println("Вторая часть: " + secondPart);
		imput.close();

	}

}
