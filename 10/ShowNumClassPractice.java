package chap09.sec01;

import java.util.Scanner;

public class ShowNumClassPractice {
	
	public void Exception(int count) {
		int countException = 0;
		for (int i = 1; i < 101; i++) {
			if (i % count == 0) {
				continue;
			}
			countException++;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(countException);
	}
	
	public void Only(int count) {
		int countOnly = 0;
		for (int i = 1; i < 101; i++) {
			if (i % count == 0) {
				countOnly++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(countOnly);
	}
	
	public void Scan(int count) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[count];
		
		for (int i = 0; i < count; i++) {
			int num = scanner.nextInt();
			arr[i] = num;
		}
		
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(arr[0]);
	}
}
