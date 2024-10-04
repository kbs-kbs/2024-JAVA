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
		
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
	}

}
