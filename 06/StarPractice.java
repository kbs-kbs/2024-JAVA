package ch06.sec01;

public class StarPractice {

	public static void main(String[] args) {
		int maxSize = 11;
		
		for (int l = 1; l < 11; l++) {
			for (int sp = 0; sp < maxSize - l; sp++) {
				System.out.print(" ");
			}
			for (int st = 1; st < l + 1; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int l = 1; l < 12; l++) {
			for (int sp = 0; sp < l - 1; sp++) {
				System.out.print(" ");
			}
			for (int st = 0; st < maxSize - l + 1; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
