package lessons.Lesson4.whiteSpaces;

import java.util.Scanner;

public class WhiteSpaces {

	public static void main(String[] args) {

		System.out.println("Type your text:");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		scan.close();
		String textNew = new String();
		char[] chr = text.toCharArray();
		for (char ch : chr) {
			if (Character.isLetter(ch) || Character.isWhitespace(ch))
				textNew += ch;
		}
		System.out.println(textNew);
	}
}
