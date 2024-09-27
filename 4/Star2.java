package ch04.sec02;

public class Star2 {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			int j = 9;
			int k = 1;
			
			for (j = 9; j > i - 1; j--) {
				System.out.print(" ");	
			}
			for (k = 1; k < i + 1; k++) {
				System.out.print("*");	
			}
			
			System.out.println("");	
		}
	}

}
