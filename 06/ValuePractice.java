package ch06.sec01;

public class ValuePractice {

	public static void main(String[] args) {
		int iValue1 = 5;
		int iValue2 = 8;
		
		System.out.println("1. iValue1: " + iValue1);
		System.out.println("2. iValue2: " + iValue2);
		
		
		int tempValue = iValue1;
		iValue1 = iValue2;
		iValue2 = tempValue;
		
		System.out.println("1. iValue1: " + iValue1);
		System.out.println("2. iValue2: " + iValue2);
		
	}
}
