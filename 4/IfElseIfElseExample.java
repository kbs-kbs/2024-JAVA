package ch04.sec02;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.println("100 ~ 90.");
			System.out.println("Your Grade is A.");
		} else if (score >= 80) {
			System.out.println("89 ~ 80.");
			System.out.println("Your Grade is B.");
		} else if (score >= 70) {
			System.out.println("79 ~ 70.");
			System.out.println("Your Grade is C.");
		} else {
			System.out.println("Smaller than 70.");
			System.out.println("Your Grade is D.");
		}

	}

}
