package ch05.sec03;

public class StringPractice2 {

	public static void main(String[] args) {
		String sStudent1 = "math:85, calc:93, science:71";
		String sStudent2 = "calc:71, math:88, science:92";
		
		String[] tokens1 = sStudent1.split(", ");
		String[] tokens2 = sStudent2.split(", ");
		
		String[][] tokensArray = {tokens1, tokens2};
		
		int sumMath = 0;
		int sumCalc = 0;
		int sumScience = 0;
		
		float meanMath = 0;
		float meanCalc = 0;
		float meanScience = 0;
		
		for (int i=0; i<tokens1.length; i++) {
			if (tokens1[i].contains("math")) {
				sumMath += Integer.parseInt(tokens1[i].replace("math:", ""));
			} else if (tokens1[i].contains("calc")) {
				sumCalc += Integer.parseInt(tokens1[i].replace("calc:", ""));
			} else if (tokens1[i].contains("science")) {
				sumScience += Integer.parseInt(tokens1[i].replace("science:", ""));
			} else {
				
			}
		}
		
		for (int i=0; i<tokens2.length; i++) {
			if (tokens2[i].contains("math")) {
				sumMath += Integer.parseInt(tokens2[i].replace("math:", ""));
			} else if (tokens2[i].contains("calc")) {
				sumCalc += Integer.parseInt(tokens2[i].replace("calc:", ""));
			} else if (tokens2[i].contains("science")) {
				sumScience += Integer.parseInt(tokens2[i].replace("science:", ""));
			} else {
				
			}
		}
		
		meanMath = (float)sumMath / (float)tokensArray.length;
		meanCalc = (float)sumCalc / (float)tokensArray.length;
		meanScience = (float)sumScience / (float)tokensArray.length;
		
		System.out.println("sumMath: " + sumMath);
		System.out.println("sumCalc: " + sumCalc);
		System.out.println("sumScience: " + sumScience);
		System.out.printf("meanMath: %10.2f\n", meanMath);
		System.out.printf("meanCalc: %10.2f\n", meanCalc);
		System.out.printf("meanScience: %10.2f\n", meanScience);
		
	}

}
