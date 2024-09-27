package ch04.sec02;

import java.util.Scanner;

public class biggerNum {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("1. Input Integet value : ");
		int iFstVal = Integer.parseInt(scanner1.nextLine());
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("2. Input Integet value : ");
		int iSecVal = Integer.parseInt(scanner2.nextLine());
		
		System.out.println("Input iFstVal = " + iFstVal);
		System.out.println("Input iSecVal = " + iSecVal);
		
		int biggerNum = (iFstVal > iSecVal) ? iFstVal : iSecVal;
		int smallerNum = (iFstVal <= iSecVal) ? iFstVal : iSecVal;
		
		System.out.println("Output iFstVal = " + biggerNum);
		System.out.println("Output iSecVal = " + smallerNum);
	}

}
