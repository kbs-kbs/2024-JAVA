package ch05.sec03;

public class ArrayPractice {

	public static void main(String[] args) {
		int[][] studentScores = {{90, 80, 72}, {94, 85, 92}, {87, 91, 78}};
		
		int koreanTotalScore = 0;
		int englishTotalScore = 0;
		int mathTotalScore = 0;
		
		float koreanAverageScore = 0;
		float englishAverageScore = 0;
		float mathAverageScore = 0;
		
		int student1TotalScore = 0;
		int student2TotalScore = 0;
		int student3TotalScore = 0;
		
		float student1AverageScore = 0;
		float student2AverageScore = 0;
		float student3AverageScore = 0;
		
		for (int i = 0; i < studentScores.length; i++) {
			koreanTotalScore += studentScores[i][0];
		}
		for (int i = 0; i < studentScores.length; i++) {
			englishTotalScore += studentScores[i][1];
		}
		for (int i = 0; i < studentScores.length; i++) {
			mathTotalScore += studentScores[i][2];
		}
		
		koreanAverageScore = (float)koreanTotalScore / (float)studentScores.length;
		englishAverageScore = (float)englishTotalScore / (float)studentScores.length;
		mathAverageScore = (float)mathTotalScore / (float)studentScores.length;
		
		for (int i = 0; i < studentScores[0].length; i++) {
			student1TotalScore += studentScores[0][i];
		}
		for (int i = 0; i < studentScores[1].length; i++) {
			student2TotalScore += studentScores[1][i];
		}
		for (int i = 0; i < studentScores[2].length; i++) {
			student3TotalScore += studentScores[2][i];
		}
		
		student1AverageScore = (float)student1TotalScore / (float)studentScores[0].length;
		student2AverageScore = (float)student2TotalScore / (float)studentScores[1].length;
		student3AverageScore = (float)student3TotalScore / (float)studentScores[2].length;
		
		System.out.print("1 Student KOR: "+ studentScores[0][0] + "  ENG: " + studentScores[0][1] + "  MATH: " + studentScores[0][2] + " [ sumVal: " + student1TotalScore);
		System.out.printf(", Avr: %4.2f ]\n", student1AverageScore);
		System.out.print("2 Student KOR: "+ studentScores[1][0] + "  ENG: " + studentScores[1][1] + "  MATH: " + studentScores[1][2] + " [ sumVal: " + student2TotalScore);
		System.out.printf(", Avr: %4.2f ]\n", student2AverageScore);
		System.out.print("3 Student KOR: "+ studentScores[2][0] + "  ENG: " + studentScores[2][1] + "  MATH: " + studentScores[2][2] + " [ sumVal: " + student3TotalScore);
		System.out.printf(", Avr: %4.2f ]\n", student3AverageScore);
		
		System.out.print("    KOR SUM: " + koreanTotalScore);
		System.out.printf(", Avr: %4.2f\n", koreanAverageScore);
		System.out.print("   MATH SUM: " + englishTotalScore);
		System.out.printf(", Avr: %4.2f\n", englishAverageScore);
		System.out.print("    ENG SUM: " + mathTotalScore);
		System.out.printf(", Avr: %4.2f\n", mathAverageScore);

		
	}

}
