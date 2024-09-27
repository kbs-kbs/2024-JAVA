package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("Bigger than 90.");
			System.out.println("Your Grade is A.");
		}
		
		if (score < 90)
			System.out.println("Smaller than 90.");
			System.out.println("Your Grade is B.");
	}

}
