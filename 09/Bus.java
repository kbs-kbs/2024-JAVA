package ch08.sec01;

public class Bus implements Vehicle {
	int iNo = 0;

	@Override
	public void run() {
		iNo++;
		System.out.println("버스가 달립니다." + iNo);
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
	
	
}
