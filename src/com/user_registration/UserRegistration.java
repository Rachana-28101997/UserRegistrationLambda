package com.user_registration;

import java.util.Scanner;
import java.util.regex.*;


public class UserRegistration {
	private static final Scanner SC = new Scanner(System.in);

	public static void firstName() {
		System.out.println("First Name : ");
		String firstName = SC.next();
		boolean fname = Pattern.matches("^[A-Z]([a-z]{2,})$", firstName);
		if(fname == true)
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
	}

	public static void main(String args[]) {
		System.out.println("*****WELCOME TO USER REGISTRATION SYSTEM*****");
		firstName();
	}
}
