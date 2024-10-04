package ch05.sec03;

public class StringPractice2 {

	public static void main(String[] args) {
		String sStudent1 = "math:85, calc:93, science:71";
		String sStudent2 = "calc:71, math:88, science:92";
		
		String[] tokens1 = sStudent1.split(", ");
		String[] tokens2 = sStudent2.split(", ");
		
		int sumMath = 0;
		int sumCalc = 0;
		int sumScience = 0;
		
		float meanMath = 0;
		float meanCalc = 0;
		float meanScience = 0;
		
		for (int i = 0; i<tokens1.length; i++) {
			if (tokens1[i].contains("math")) {
				String mathScore = tokens1[i].replace("math:", "");
				sumMath += Integer.parseInt(mathScore);
			}
			if (tokens1[i].contains("math")) {
				String calcScore = tokens1[i].replace("calc:", "");
				sumCalc += Integer.parseInt(calcScore);
			}
			if (tokens1[i].contains("math")) {
				String scienceScore = tokens1[i].replace("science:", "");
				sumScience += Integer.parseInt(scienceScore);
			}
		}
		
		for (int i = 0; i<tokens2.length; i++) {
			int indexMath = tokens2[i].indexOf("math");
			int indexCalc = tokens2[i].indexOf("calc");
			int indexScience = tokens2[i].indexOf("science");
			
			String mathScore = tokens2[indexMath].replace("math:", "");
			String calcScore = tokens2[indexCalc].replace("calc:", "");
			String scienceScore = tokens2[indexScience].replace("science:", "");
			
			sumMath += Integer.parseInt(mathScore);
			sumCalc += Integer.parseInt(calcScore);
			sumScience += Integer.parseInt(scienceScore);
		}
		
		meanMath = (float)sumMath / 2.0f;
		meanCalc = (float)sumCalc / 2.0f;
		meanScience = (float)sumScience / 2.0f;
		
		System.out.println("sumMath: " + sumMath);
		System.out.println("sumCalc: " + sumCalc);
		System.out.println("sumScience: " + sumScience);
		System.out.printf("meanMath: %10.2f", meanMath);
		System.out.printf("meanCalc: %10.2f", meanCalc);
		System.out.printf("meanScience: %10.2f", meanScience);
		
	}

}
