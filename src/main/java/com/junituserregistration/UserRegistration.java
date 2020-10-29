package main.java.com.junituserregistration;

import java.util.regex.Pattern;

import main.java.com.customexceptions.*;

@FunctionalInterface
interface IUserRegistration {
	boolean validate(String pattern, String details);
}

public class UserRegistration {

	public static final String NAME_PATTERN = "^[A-Z]([a-z]{2,})$";
	public static final String EMAIL_PATTERN = "^[A-Za-z0-9]+([._%+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+([.]([a-zA-Z]{2,3})*)+$";
	public static final String MOBILENUM_PATTERN = "^[0-9]{2,3}[: :]{1}[6-9]{1}[0-9]{9}$";
	public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]*[@$!%&]([A-Za-z\\d]*){8,}$";

	static IUserRegistration detail = (detailsPattern, details) -> {
		return (Pattern.matches(detailsPattern, details));
	};

	public static boolean firstName(String firstName) throws InvalidUserDetailsException {
		if (detail.validate(NAME_PATTERN, firstName)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean lastName(String lastName) throws InvalidUserDetailsException {
		if (detail.validate(NAME_PATTERN, lastName)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean email(String mail) throws InvalidUserDetailsException {
		if (detail.validate(EMAIL_PATTERN, mail)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean mobileNum(String mNum) throws InvalidUserDetailsException {
		if (detail.validate(MOBILENUM_PATTERN, mNum)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean password(String password) throws InvalidUserDetailsException {
		if (detail.validate(PASSWORD_PATTERN, password)) {
			return true;
		}else {
		throw new InvalidUserDetailsException("Enter valid user details");
		}
	}
}