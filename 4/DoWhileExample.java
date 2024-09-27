package ch04.sec02;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("Input your message.");
		System.out.println("Exit is q key.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("Exit");
		
	}

}
