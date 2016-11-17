package lessons.Lesson2.week;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {

		System.out.println("Insert your number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String dayStr;
		switch (num) {
		case 1:
			dayStr = "Monday";
			System.out.println(dayStr);
			break;
		case 2:
			dayStr = "Tuesday";
			System.out.println(dayStr);
			break;
		case 3:
			dayStr = "Wednesday";
			System.out.println(dayStr);
			break;
		case 4:
			dayStr = "Thirsday";
			System.out.println(dayStr);
			break;
		case 5:
			dayStr = "Friday";
			System.out.println(dayStr);
			break;
		case 6:
			dayStr = "Saturday";
			System.out.println(dayStr);
			break;
		case 7:
			dayStr = "Sunday";
			System.out.println(dayStr);
			break;
		default:
			dayStr = "Error";
			System.out.println(dayStr);
			break;
		}
		scan.close();
	}
}
