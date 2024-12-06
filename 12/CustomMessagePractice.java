package ch11.sec02.exam01;

public class CustomMessagePractice {

	public CustomMessagePractice() {}

	public void check(int num) throws CustomExceptionPractice {
		if (num > 9) {
			throw new CustomExceptionPractice("9¸¦ ÃÊ°ú");
		}
	}
}
