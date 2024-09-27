package ch04.sec02;

import java.util.Scanner;

public class WhileRandom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chance = 3;
		int randomNum;

		while (true) {
			
			randomNum = (int)(Math.random()*10 + 1);
			
			System.out.print("Input a number between 1 and 30: ");
			String strNum = scanner.nextLine();
			
			if (Integer.parseInt(strNum) < randomNum) {
				System.out.println("Up!");
			} else if (Integer.parseInt(strNum) > randomNum) {
				System.out.println("Down!");
			} else if (Integer.parseInt(strNum) == randomNum) {
				System.out.println("Bingo!");
			}
		}
	}

}
