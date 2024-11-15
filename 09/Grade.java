package ch08.sec01;

public class Grade {
	public Grade() {
		System.out.println("»ý¼ºÀÚ");
	}
	
	public void PrintlnGrade(int score) {
		if (score > 89) {
			System.out.println("A");
		} else if (score > 79) {
			System.out.println("B");
		} else if (score > 69) {
			System.out.println("C");
		} else if (score > 59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
	
}
