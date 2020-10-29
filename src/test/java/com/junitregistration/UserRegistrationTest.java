package test.java.com.junitregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import main.java.com.customexceptions.InvalidUserDetailsException;
import main.java.com.junituserregistration.UserRegistration;

class UserRegistrationTest {

	static UserRegistration user;

	@BeforeClass
	public static void createUserRegistrationObj() {
		user = new UserRegistration();
		System.out.println("In before class");
	}

	@AfterClass
	public static void nullObj() {
		System.out.println("In After class");
		user = null;
	}

	// FirstName Test cases
	@Test
	public void testFirstNameWithFirstLetterCapital_testAssertionHappy() throws InvalidUserDetailsException {
		boolean result = UserRegistration.firstName("Rachana");
		Assert.assertTrue(result);
	}

	@Test
	public void testFirstNameWithoutFirstLetterCapital_testAssertionHappy() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.firstName("rachana");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}

	}

	@Test
	public void testFirstNameWithoutFirstLetterCapital_testAssertionSad() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.firstName("rachana");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testFirstNameWithFirstLetterCapital_testAssertionSad() throws InvalidUserDetailsException {
		boolean result = UserRegistration.firstName("Rachan");
		Assert.assertFalse(result);
	}

	// LastName Test cases
	@Test
	public void testLasttNameWithFirstLetterCapital_testAssertionHappy() throws InvalidUserDetailsException {
		boolean result = UserRegistration.lastName("Ramya");
		Assert.assertTrue(result);
	}

	@Test
	public void testLastNameWithoutFirstLetterCapital_testAssertionHappy() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.lastName("ramya");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testLastNameWithoutFirstLetterCapital_testAssertionSad() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.lastName("rachan");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testLastNameWithFirstLetterCapital_testAssertionSad() throws InvalidUserDetailsException {
		boolean result = UserRegistration.lastName("Rachu");
		Assert.assertFalse(result);
	}

	// Email Test cases
	@Test
	public void testEmailWithThreeMandatoryFeilds_testAssertionHappy() throws InvalidUserDetailsException {
		boolean result = UserRegistration.email("rachana@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void testEmailWithoutThreeMandatoryFeilds_testAssertionHappy() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.email("rachana@.com");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testEmailWithoutThreeMandatoryFeilds_testAssertionSad() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.email("rachu28@gmail");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testEmailWithThreeMandatoryFeilds_testAssertionSad() throws InvalidUserDetailsException {
		boolean result = UserRegistration.email("ramya@gmil.co");
		Assert.assertFalse(result);
	}

	// MobileNumber Test cases
	@Test
	public void testMobileNumberWithTwoMandatoryFeilds_testAssertionHappy() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.mobileNum("+91 8888999777");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testMobileNumberWithoutTwoMandatoryFeilds_testAssertionHappy() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.mobileNum("9876543210");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testMobileNumberWithoutTwoMandatoryFeilds_testAssertionSad() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.mobileNum("89543210");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testMobileNumberWithTwoMandatoryFeilds_testAssertionSad() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.mobileNum("+91 8796560000");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	// Password Test cases
	@Test
	public void testPasswordWithMinimumEightCharacters_testAssertionHappy() throws InvalidUserDetailsException {
		boolean result = UserRegistration.password("Rachanar");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutMinimumEightCharacters_testAssertionHappy() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.password("Ramyana");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testPasswordWithoutMinimumEightCharacters_testAssertionSad() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.password("8545654");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testPasswordWithMinimumEightCharacters_testAssertionSad() throws InvalidUserDetailsException {
		boolean result = UserRegistration.password("87965646");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithAtleastOneUpperCase_testAssertionHappy() throws InvalidUserDetailsException {
		boolean result = UserRegistration.password("Rachana");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutAtleastOneUpperCase_testAssertionHappy() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.password("rachan");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testPasswordWithoutAtleastOneUpperCase_testAssertionSad() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.password("kmdklwkas");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testPasswordWithAtleastOneUpperCase_testAssertionSad() throws InvalidUserDetailsException {
		boolean result = UserRegistration.password("skwndkxS");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithAtleastOneNumeric_testAssertionHappy() throws InvalidUserDetailsException {
		boolean result = UserRegistration.password("Rachana28");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutAtleastOneNumeric_testAssertionHappy() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.password("rachan");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testPasswordWithoutAtleastOneNumeric_testAssertionSad() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.password("kmdklwkasK");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testPasswordWithAtleastOneNumeric_testAssertionSad() throws InvalidUserDetailsException {
		boolean result = UserRegistration.password("9skwndkx");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithExactlyOneSpecialCharacter_testAssertionHappy() throws InvalidUserDetailsException {
		boolean result = UserRegistration.password("Rachu28@");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutExactlyOneSpecialCharacter_testAssertionHappy() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.password("rachur");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testPasswordWithoutExactlyOneSpecialCharacter_testAssertionSad() throws InvalidUserDetailsException {
		try {
			boolean result = UserRegistration.password("9kmdklwkasK");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException e) {
			Assert.assertEquals("Enter valid user details", e.getMessage());
		}
	}

	@Test
	public void testPasswordWithExactlyOneSpecialCharacter_testAssertionSad() throws InvalidUserDetailsException {
		boolean result = UserRegistration.password("skwndkx$");
		Assert.assertFalse(result);
	}

}