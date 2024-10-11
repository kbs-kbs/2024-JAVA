package ch06.sec01;

public class StarPractice2 {

	public static void main(String[] args) {
		int max = 25;
		
		for (int i = 0; i < max; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < max / 2 - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < max / 2 - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
