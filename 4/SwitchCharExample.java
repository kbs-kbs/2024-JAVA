package ch04.sec02;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("VIP");
			break;
		case 'B':
		case 'b':
			System.out.println("User");
			break;
		default:
			System.out.println("Guest");
		}
	}

}
