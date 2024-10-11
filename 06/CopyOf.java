package ch06.sec01;

import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {
		String a[] = new String[] {"1", "2", "3"};
		String b[] = Arrays.copyOf(a, 5);
		
		System.out.print("a Array: ");
		for (int i =0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.print("\nb Array: ");
		for (int i =0; i < b.length; i++)
			System.out.print(b[i] + " ");

		b[0] = "10";
		
		System.out.print("\na Array: ");
		for (int i =0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.print("\nb Array: ");
		for (int i =0; i < b.length; i++)
			System.out.print(b[i] + " ");

	}

}
