package ch10.sec01;

import java.util.Scanner;

public class InputNOSortLIB {
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j =0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void calculator() {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		String[] symbolTypes = {"+", "-", "*", "/"};
		String symbol = "+";
		
		
		while (true) {
			String temp = scanner.nextLine();
			if (temp.equals("q")) {
				System.out.println("종료합니다");
				scanner.close();
				break;
			} else if (contains(symbolTypes, temp)) {
				symbol = temp;
			} else {
				switch (symbol) {
					case "+" -> a += Integer.parseInt(temp);
					case "-" -> a -= Integer.parseInt(temp);
					case "*" -> a *= Integer.parseInt(temp);
					case "/" -> a /= Integer.parseInt(temp);
				}
				System.out.println(a);
			}
		}
	}
	
	public boolean contains(String[] arr, String temp) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(temp)) {
				return true;
			}
		}
		return false;
	}
}
