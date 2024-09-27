package ch04.sec02;

import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		boolean isOddNum = true;
		
		System.out.println("Input Integer value : ");
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		isOddNum = (num % 2 == 1) ? true : false;
		
		if (isOddNum) {
			System.out.println("Is Odd Number.");
		} else {
			System.out.println("Is Not Odd Number.");
		}
	}

}
