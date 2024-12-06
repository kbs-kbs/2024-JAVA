package ch11.sec02.exam01;

public class NotExistIDException extends Exception {

	public NotExistIDException() {
		
	}
	
	public NotExistIDException(String message) {
		super(message);
	}

}
