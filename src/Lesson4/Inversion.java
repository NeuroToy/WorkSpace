package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Inversion {

	public static void main(String[] args) {

		System.out.println("Type your string:");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String lowerText = text.toLowerCase();
		String finalText = lowerText.replace(" ", "");
		char[] array = finalText.toCharArray();
		Arrays.sort(array);
		System.out.println("Type your second string:");
		Scanner secondScan = new Scanner(System.in);
		String secondText = scan.nextLine();
		String secondLower = secondText.toLowerCase();
		String secondFinal = secondLower.replace(" ", "");
		char[] secondArray = secondFinal.toCharArray();
		Arrays.sort(secondArray);
		if (Arrays.equals(array, secondArray)) {
			System.out.println("Your second string is inversion of first");
		} else {
			System.out.println("Your second string is unique");
		}
		scan.close();
		secondScan.close();
	}
}
