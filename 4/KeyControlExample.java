package ch04.sec02;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1. Up | 2. Down | 3. Stop");
			System.out.println("-------------------------");
			System.out.print("Select: ");
			
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) {
				speed++;
				System.out.println("Now Speed = " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("Now Speed = " + speed);
			} else if (strNum.equals("3")) {
				run = false;
			}
		}
		
		System.out.println("...");
	}

}
