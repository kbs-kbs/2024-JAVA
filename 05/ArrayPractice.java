package ch05.sec03;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] == 7) {
				System.out.println("7 is " + i + "th Number.");
			}
		}
	}

}
