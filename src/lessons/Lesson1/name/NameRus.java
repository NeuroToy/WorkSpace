package lessons.Lesson1.name;

import java.util.Scanner;

public class NameRus {

	public static void main(String[] args) {

		System.out.println("Как Ваше имя?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Привет, " + name + "!");
		scanner.close();
	}
}
