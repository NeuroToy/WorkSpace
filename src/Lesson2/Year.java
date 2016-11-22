package Lesson2;

/**
 * Вычисляет высокостный ли вводимый год
 * @author malevich
 * @version 1.0
 */
import java.util.Scanner;

public class Year {

	public static void main(String[] args) {

		System.out.println("Введите год: ");
		Scanner year = new Scanner(System.in);
		int value = year.nextInt();
		if (value % 4 == 0 && value % 100 != 0 || value % 400 == 0)
			System.out.println("Ваш год високосный!");
		else
			System.out.println("Ваш год не високосный");
		year.close();
	}
}