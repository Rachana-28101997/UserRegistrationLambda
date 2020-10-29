package main.java.com.customexceptions;

public class InvalidUserDetailsException extends Exception {

	public InvalidUserDetailsException(String message) {
		super(message);
	}
}
