package ch04.sec02;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			if (m != 7) {
				System.out.println("*** " + m + "dan ***");
				for (int n = 1; n <= 9; n++) {
					System.out.println(m + " X " + n + " = " + (m*n));
				}
			}
		}

	}

}
