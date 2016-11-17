package Lesson4;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

		char[] alpha = new char[26];
		for (int i = 0; i < 26; i++) {
			alpha[i] = (char) ('a' + i);
		}
		System.out.println("Type your text:");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String lower = text.toLowerCase();
		char[] array = lower.toCharArray();
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.print(" " + " " + array[i]);
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < alpha.length; j++) {
				if (array[i] == alpha[j]) {
					System.out.print(" " + " " + (j + 1));
				}
			}
		}
		scan.close();
	}
}
