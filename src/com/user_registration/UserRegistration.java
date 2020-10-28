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

	public static void lastName() {
		System.out.println("Last Name : ");
		String lastName = SC.next();
		boolean lname = Pattern.matches("^[A-Z]([a-z]{2,})$", lastName);
		if(lname == true)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

	public static void email() {
		System.out.println("Email : ");
		String email = SC.next();
		boolean mail = Pattern.matches("^[A-Za-z0-9]+([._%+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+([.]([a-zA-Z]{2,3})*)+$", email);
		if(mail == true)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

	public static void mobileNum() {
		System.out.println("Mobile Number : ");
		String mobile = SC.next();
		boolean mobileNo = Pattern.matches("^[+]*([0-9]{1,3})+([[:space:]])+[0-9]{10}$", mobile);
		if(mobileNo == true)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

	public static void password() {
		System.out.println("Password : ");
		String pwd = SC.next();
		boolean pwd1 = Pattern.matches("^([0-9a-zA-Z@#!]){8,}$", pwd);
		boolean pwd2 = Pattern.matches("^([a-z0-9@#!]*)[A-Z]+([a-z0-9@#!]*)$", pwd);
		boolean pwd3 = Pattern.matches("^([a-zA-Z@#!]*)[0-9]+([a-zA-Z@#!]*)$", pwd);
		boolean pwd4 = Pattern.matches("^([a-zA-Z0-9]*)[@#!]{1}([a-zA-Z0-9]*)$", pwd);
		if(pwd1 == true) {
			if(pwd2 == true) {  
				if(pwd3 == true) {
					if(pwd4 == true) {
						System.out.println("Rule 1,2,3 & 4 Matched");
					}else {
						System.out.println("Rule 4 Not Matched");
					}}else {
					System.out.println("Rule 3 Not Matched");
				}} else { 
				System.out.println("Rule 2 Not Matched");
			}} else {
			System.out.println("Rule 1 Not Matched");
		}
	}
	
	public static void main(String args[]) {
		System.out.println("*****WELCOME TO USER REGISTRATION SYSTEM*****");
		firstName();
		lastName();
		email();
		mobileNum();
		System.out.println("Rules to be maintained for attaining a valid password");
		System.out.println("Password1 : Should contain minimum of 8 characters");
		System.out.println("Password2 : Should have atleast 1 Uppercase letter");
		System.out.println("Password3 : Should have atleast 1 numeric number in password");
		System.out.println("Password4 : Should contain exactly 1 special character");
		password();
	}
}