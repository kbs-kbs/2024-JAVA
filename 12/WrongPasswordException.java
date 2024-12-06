package ch11.sec02.exam01;

public class WrongPasswordException extends Exception {

	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
		super(message);
	}

}
