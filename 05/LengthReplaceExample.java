package ch05.sec03;

public class LengthReplaceExample {

	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("�ڸ����� �½��ϴ�.");
		} else {
			System.out.println("�ڸ����� Ʋ���ϴ�.");
		}
		
		String oldStr = "�ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
	}

}
