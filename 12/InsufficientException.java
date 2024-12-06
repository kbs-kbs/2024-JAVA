package ch11.sec02.exam01;

public class InsufficientException extends Exception {
	public InsufficientException() {
		
	}
	
	public InsufficientException(String message) {
		super(message);
	}
}
