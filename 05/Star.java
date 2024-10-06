package ch05.sec03;

public class Star {

	public static void main(String[] args) {
		int starNum = 5;
		for (int i=0; i < starNum; i++) {
			for (int j=0; j < starNum - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i < starNum; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < starNum - i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
