package ch06.sec01;

public class GugudanPractice {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			if (i == 6) {
				continue;
			}
			
			for (int k = 1; k < 10; k++) {
				System.out.println(i + " x " + k + " = "  + (i * k));
			}
		}
	}

}
