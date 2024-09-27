package ch04.sec02;

public class SwitchExpressionExample {

	public static void main(String[] args) {
		char grade = 'a';
		
		switch (grade) {
			case 'A', 'a' -> System.out.println("VIP");
			case 'B', 'b' -> System.out.println("User");
			default -> System.out.println("Guest");
		}
	}

}
