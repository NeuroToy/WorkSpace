package Lesson2;

/**
 * Делит 2 числа
 * первое на второе
 * @author malevich
 * @version 1.0
 */
import java.util.Scanner;

public class Quotient {

	public static void main(String[] args) {

		System.out.println("Введите первое число:");
		Scanner first = new Scanner(System.in);
		int one = first.nextInt();
		System.out.println("Введите второе число:");
		Scanner second = new Scanner(System.in);
		double two = second.nextInt();
		double three = (one / two);
		System.out.println("Частное от Ваших чисел: " + three);
		first.close();
		second.close();
	}
}
