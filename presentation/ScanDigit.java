package pack1;

public class ScanDigit extends ScanNumber {

	@Override
	public void scanNumber(int num) {
		super.scanNumber(0, 10, num);
	}
}
