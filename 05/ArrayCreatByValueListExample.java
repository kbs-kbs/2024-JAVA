package ch05.sec03;

public class ArrayCreatByValueListExample {

	public static void main(String[] args) {
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		System.out.println("season[0]: "+ season[0]);
		System.out.println("season[1]: "+ season[1]);
		System.out.println("season[2]: "+ season[2]);
		System.out.println("season[3]: "+ season[3]);
		
		season[1] = "¿©¸§";
		System.out.println("season[1]: "+ season[1]);
		System.out.println();
	}
}
