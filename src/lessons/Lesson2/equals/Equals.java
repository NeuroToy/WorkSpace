package lessons.Lesson2.equals;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		
		System.out.println ("Введите первое число:");
		Scanner first = new Scanner(System.in);
		int one = first.nextInt();
		System.out.println ("Ваше число: " + one);
		System.out.println ("Введите второе число:");
		Scanner second = new Scanner(System.in);
		int two = second.nextInt();
		System.out.println ("Ваше число: " + two);
		if (one == two)
		System.out.println ("Ваши значения - равны!");
		else if (one > two)
			System.out.println (one + " - Больше!");
		else if (two > one)
			System.out.println (two + " - Больше!");
		first.close();
		second.close();
		
	}

}