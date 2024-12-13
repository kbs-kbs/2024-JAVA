package pack1;

import java.util.Scanner;

// 0~9 사이의 랜덤 숫자를 20번 입력 받아
// 변수 sInputVal에 등록하고
// 각각의 숫자가 몇 번씩 발생하였는지 출력하는 프로그램

public class NumberCounter {
	public static void main(String[] args) { // 메인 함수에서 ScanNumber 클래스를 상속받은  ScanDigit 클래스의 scanDigit 메서드를 호출
		ScanDigit sd = new ScanDigit();
		sd.scanDigit(20); // 0~9 사이의 값을 20번 입력 받음
	}
}

// 각 숫자의 발생 횟수:
// 0: 1번
// 1: 3번
// 2: 2번
// ...
// 9: 0번
