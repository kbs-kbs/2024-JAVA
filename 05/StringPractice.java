package ch05.sec03;

public class StringPractice {

	public static void main(String[] args) {
		String sTot = "10Point, 23Point, 33Point, 45Point, 55Point, 67Point";
		String sTotExtended = sTot + ", ";
		
		String[] tokens = sTotExtended.split("Point, ");
		
		int sum = 0;
		float mean = 0;
		
		for (int i = 0; i<tokens.length; i++) {
			sum += Integer.parseInt(tokens[i]);
		}
		mean = (float)sum / (float)tokens.length;
		
		System.out.println("1. ToCnt: " + tokens.length);
		System.out.println("2. SumValue: " + sum);
		System.out.println("3. Average: " + mean);
		System.out.printf("4. Average: %10.2f", mean);
	}

}
