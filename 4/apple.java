package ch04.sec02;

public class apple {

	public static void main(String[] args) {
		int appleNum = 123;
		int bagSize = 10;
		int bagNum = 0;
		
		// if ��
		if (appleNum % bagSize > 0) {
			bagNum = appleNum / bagSize + 1;
		} else {
			bagNum = appleNum / bagSize;
		}
		System.out.println("Total Need Bundle Count : " + bagNum + "cnt");
		
		// ���� ������
		bagNum = (appleNum % bagSize > 0) ? (appleNum / bagSize + 1) : (appleNum / bagSize);
		System.out.println("Total Need Bundle Count : " + bagNum + "cnt");
	}

}
