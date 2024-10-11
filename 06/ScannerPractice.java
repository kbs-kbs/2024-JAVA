package ch06.sec01;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		int biggerNum = 0;
		int num = 0;
		int smallerNum = 0;
		
		System.out.println("1. Insert 1 ~ 10 Value:");
		Scanner scanner = new Scanner(System.in); // **
		String inputString = scanner.nextLine(); // **
		
		biggerNum = Integer.parseInt(inputString); // **
		
		System.out.println("2. Insert 1 ~ 10 Value:");
		inputString = scanner.nextLine();
		
		if (biggerNum < Integer.parseInt(inputString)) {
			num = biggerNum;
			biggerNum = Integer.parseInt(inputString);
		} else {
			num = Integer.parseInt(inputString);
		}
		
		System.out.println("3. Insert 1 ~ 10 Value:");
		inputString = scanner.nextLine();
		
		if (biggerNum < Integer.parseInt(inputString)) {
			smallerNum = num;
			num = biggerNum;
			biggerNum = Integer.parseInt(inputString);
		} else if (num < Integer.parseInt(inputString)) {
			smallerNum = num;
			num = Integer.parseInt(inputString);
		} else {
			smallerNum = Integer.parseInt(inputString);
		}
		
		System.out.println("[First]: " + biggerNum + " [Second]: " + num + " [Third]: " + smallerNum);
	}
}
