package ch08.sec01;

import java.util.Scanner;

public class ScorePractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		scanner.close();
		
		Grade grade = new Grade();
		grade.PrintlnGrade(score);
		
	}

}
