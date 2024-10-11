package ch06.sec01;

public class DeepCopy {

	public static void main(String[] args) {
		int a[] = {1, 8, 3};
		int b[] = a.clone();
		
		System.out.print("a Array: ");
		for (int i =0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.print("\nb Array: ");
		for (int i =0; i < b.length; i++)
			System.out.print(b[i] + " ");

		b[0] = 10;
		
		System.out.print("\na Array: ");
		for (int i =0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.print("\nb Array: ");
		for (int i =0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}

}
