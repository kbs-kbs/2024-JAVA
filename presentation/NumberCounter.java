package pack1;

import java.util.Scanner;

public class NumberCounter {

	public static void main(String[] args) { // 메인 함수
		
		// 0~9 사이의 랜덤 숫자를 20번 입력 받아
		// 변수 sInputVal에 등록하고
		// 각각의 숫자가 몇 번씩 발생하였는지 출력하는 프로그램
		
		ScanNumber sn = new ScanNumber();
		sn.scanNumber(1, 7, 5); // 20번 입력 받음
	}
}