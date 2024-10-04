package ch05.sec03;

public class MultidimensionalArrayBy {
	public static void main(String[] args) {
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		
		System.out.println("배열 길이:" + scores.length);
		System.out.println("첫번째 반의 학생:" + scores[0].length);
		System.out.println("두번째 반의 학생:" + scores[1].length);
		
	}
	
}
