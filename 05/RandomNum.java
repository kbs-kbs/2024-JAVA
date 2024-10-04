package ch05.sec03;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		int count = 0;
		int randomNum = 0;
		
		while(true) {
			if (count == 0) {
				randomNum = (int)(Math.random()*20 + 1);
				System.out.println("Input a number between 1 and 20.");
			}
			
			Scanner scanner = new Scanner(System.in);
			String strNum = scanner.nextLine();
			
			if (Integer.parseInt(strNum) > randomNum) {
				System.out.println("Down");
				count++;
			} else if (Integer.parseInt(strNum) < randomNum) {
				System.out.println("Up");
				count++;
			} else if (Integer.parseInt(strNum) == randomNum) {
				System.out.println("Bingo");
				System.out.println("Count: " + count);
				count = 0;
			}
			
		}
		
	}

}
