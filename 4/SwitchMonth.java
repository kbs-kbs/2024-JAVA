package ch04.sec02;

public class SwitchMonth {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12) + 1;

		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Month " + month + " Length: 31.");
			case 2 -> System.out.println("Month " + month + " Length: 28.");
			case 4, 6, 9, 11 -> System.out.println("Month " + month + " Length: 30.");
			default -> System.out.println("Wrong Month");
		}
	}

}
