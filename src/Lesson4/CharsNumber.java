package Lesson4;

import java.util.Scanner;

public class CharsNumber {

	public static void main(String[] args) {

		System.out.println("Type your text:");
		Scanner scan = new Scanner(System.in);
		String scanText = scan.nextLine();
		String lowerText = scanText.toLowerCase();
		String text = lowerText.replace(" ", "");
		int count = 0;
		for (int j = 0; j < text.length(); j++) {
			for (int i = text.length() - 1; i > j; i--) {
				if (text.charAt(j) == text.charAt(i)){
					count = count + 1;
				}
			}
		}
		if (count < 1) {
			System.out.println("Symbols are unique");
		}
		else {
			System.out.println("Symbols are not unique");
		}
		scan.close();
	}
}
