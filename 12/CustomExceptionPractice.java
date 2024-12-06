package ch11.sec02.exam01;

public class CustomExceptionPractice extends Exception{

	public CustomExceptionPractice() {
		
	}
	
	public CustomExceptionPractice(String message) {
		super(message);
	}
}
