package ch05.sec03;

public class EmptyStringExample {

	public static void main(String[] args) {
		String hobby = "";
		if (hobby.equals("")) {
			System.out.println("hobby ������ �����ϴ� String ��ü�� �� ���ڿ�");
		}
		System.out.println(hobby == null);
	}
}
