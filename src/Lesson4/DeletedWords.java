package Lesson4;

import java.util.Scanner;

public class DeletedWords {

	public static void main(String[] args) {
		
		System.out.println("Type your text:");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		int i = 0;
		System.out.println("How long words your prefer to delete (number):");
		Scanner scanInt = new Scanner(System.in);
		String secondScan = scanInt.nextLine();
		char[] smb = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
		String textNew = new String();
		Integer number = new Integer(secondScan);
		String[] textParts = text.split(" ");
		for (String x : textParts) {
			if (x.length() == number && x.charAt(0) == smb[i]) {
				x = "";
				i++;
			}
			textNew += x + " ";
		}
		System.out.println(textNew);
		scan.close();
		scanInt.close();
	}
}
