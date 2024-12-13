package pack1;

public class ScanDigit extends ScanNumber { // ScanNumber 클래스를 상속받음

	public void scanDigit(int num) {
		super.scanNumber(0, 10, num); // 부모 클래스의 scanNumber(0, 10, num) 실행
	}
}
