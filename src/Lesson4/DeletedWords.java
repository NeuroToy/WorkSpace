package Lesson4;

import java.util.Scanner;

public class DeletedWords {

	public static void main(String[] args) {
		
		System.out.println("Type your text:");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		System.out.println("How long words your prefer to delete (number):");
		Scanner scanInt = new Scanner(System.in);
		String number = scanInt.nextLine();
		
		scan.close();
		scanInt.close();
	}
}
