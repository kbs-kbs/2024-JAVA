package ch08.sec01;

public class MaxNumPractice {

	public static void main(String[] args) {
		int count = 0;
		int[] arr = new int[10];
		int min = 0;
		int max = 0;
		
		
		while (count < 10) {
			boolean isDuplicate = false;
			
			int num = (int)(Math.random() * 100) + 1;
			
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					isDuplicate = true;
					break;
				}
			}
			
			if (!isDuplicate) {
				arr[count] = num;
				count++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		min = arr[0];
		max = arr[0];
		
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.print(min + " ");
		System.out.print(max + " ");
		
		
	}

}
