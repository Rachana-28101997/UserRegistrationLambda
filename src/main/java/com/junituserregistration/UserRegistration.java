package main.java.com.junituserregistration;

import java.util.regex.Pattern;

import main.java.com.customexceptions.*;

public class UserRegistration {
	
	public static boolean firstName(String firstName) throws InvalidUserDetailsException {
		boolean fname = Pattern.matches("^[A-Z]([a-z]{2,})$", firstName);
		if(fname)
			return true;
		throw new InvalidUserDetailsException("Enter valid user details");
	}

	public static boolean lastName(String lastName) throws InvalidUserDetailsException {
		boolean lname = Pattern.matches("^[A-Z]([a-z]{2,})$", lastName);
		if(lname)
			return true;
		throw new InvalidUserDetailsException("Enter valid user details");
	}

	public static boolean email(String mail) throws InvalidUserDetailsException {
		boolean email = Pattern.matches("^[A-Za-z0-9]+([._%+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+([.]([a-zA-Z]{2,3})*)+$", mail);
		if(email)
			return true;
		throw new InvalidUserDetailsException("Enter valid user details");
		
	}

	public static boolean mobileNum(String mNum) throws InvalidUserDetailsException {
		boolean mobileNum = Pattern.matches("^[+]*([0-9]{1,3})+[[:space:]]+[0-9]{10}$", mNum);
		if(mobileNum)
			return true;
		throw new InvalidUserDetailsException("Enter valid user details");
	}

	public static boolean password1(String password) throws InvalidUserDetailsException {
		boolean pwd1 = Pattern.matches("^([0-9a-zA-Z@#!]){8,}$", password);
		if(pwd1)
			return true;
		throw new InvalidUserDetailsException("Enter valid user details");
	}

	public static boolean password2(String password) throws InvalidUserDetailsException {
		boolean pwd2 = Pattern.matches("^([a-z0-9@#!]*)[A-Z]+([a-z0-9@#!]*)$", password);
		if(pwd2)
			return true;
		throw new InvalidUserDetailsException("Enter valid user details");
	}

	public static boolean password3(String password) throws InvalidUserDetailsException {
		boolean pwd3 = Pattern.matches("^([a-zA-Z@#!]*)[0-9]+([a-zA-Z@#!]*)$", password);
		if(pwd3)
			return true;
		throw new InvalidUserDetailsException("Enter valid user details");
	}

	public static boolean password4(String password) throws InvalidUserDetailsException {
		boolean pwd4 = Pattern.matches("^([a-zA-Z0-9]*)[@#!$]{1}([a-zA-Z0-9]*)$", password);
		if(pwd4)
			return true;
		throw new InvalidUserDetailsException("Enter valid user details");
	}


}