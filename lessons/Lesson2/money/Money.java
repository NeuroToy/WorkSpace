package lessons.Lesson2.money;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		
		System.out.println("Введите число от 1 до 999:");
		Scanner number = new Scanner(System.in);
		int i = number.nextInt();
		if (i > 10 && i <= 20)
			System.out.println(i + " рублей");
		else if (i % 100 > 10 && i % 100 < 20)
			System.out.println(i + " рублей");
		else if (i % 10 == 1)
			System.out.println(i + " рубль");
		else if (i % 10 == 2)
			System.out.println(i + " рубля");
		else if (i % 10 == 3)
			System.out.println(i + " рубля");
		else if (i % 10 == 4)
			System.out.println(i + " рубля");
		else if (i % 10 == 5)
			System.out.println(i + " рублей");
		else if (i % 10 == 6)
			System.out.println(i + " рублей");
		else if (i % 10 == 7)
			System.out.println(i + " рублей");
		else if (i % 10 == 8)
			System.out.println(i + " рублей");
		else if (i % 10 == 9)
			System.out.println(i + " рублей");
		else if (i % 10 == 0)
			System.out.println(i + " рублей");
		
	}

}