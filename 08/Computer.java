package ch07.sec02;

public class Computer extends Calculator {

	@Override
	public double areaCircle(double r) {
		System.out.println("Calculator °´Ã¼ÀÇ areaCircle() ½ÇÇà");
		return Math.PI * r * r;
	}

}
