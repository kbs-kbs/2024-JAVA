package ch06.sec01;

public class OperatorPractice2 {

	public static void main(String[] args) {
		int boxSize = 12;
		int boxNum = 100;
		int appleNum = 573;
		int emptyBoxNum = 0;
		
		emptyBoxNum = boxNum - (appleNum / boxSize); // **
		
		if (appleNum % boxSize > 0) {
			emptyBoxNum--;
		}
		
		System.out.println(emptyBoxNum);
	}

}
