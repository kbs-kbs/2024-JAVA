package ch06.sec01;

public class ArrayPractice {

	public static void main(String[] args) {
		int arrLength = 10;
		
		int arr[] = new int[arrLength];
		
		for (int i = 0; i < arrLength; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 7) {
				System.out.println("7 is " + (i + 1) + "th Number.");
			}
		}
	}

}
