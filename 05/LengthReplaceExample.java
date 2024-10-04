package ch05.sec03;

public class LengthReplaceExample {

	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("자릿수가 맞습니다.");
		} else {
			System.out.println("자릿수가 틀립니다.");
		}
	}

}
