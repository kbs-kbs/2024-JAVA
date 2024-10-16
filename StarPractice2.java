package ch06.sec01;

public class StarPractice2 {

	public static void main(String[] args) {
		int col = 25;
		int row = (col + 1) / 2;
		
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < r; c++) {
				System.out.print(" ");
			}
			for (int c = 0; c < col - 2 * r; c++) {
				System.out.print("*");
			}
			for (int c = 0; c < r; c++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		row--;
		
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < (col - (2 * r + 3)) / 2; c++) {
				System.out.print(" ");
			}
			for (int c = 0; c < 2 * r + 3; c++) {
				System.out.print("*");
			}
			for (int c = 0; c < (col - (2 * r + 3)) / 2; c++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
