package test.java.com.junitregistration;
import main.java.com.junituserregistration.UserRegistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest<user> {
	static UserRegistration user;

	@BeforeClass
	public static void createUserRegistrationObj() {
		user = new UserRegistration();
		System.out.println("In before class: First Name");
	}

	@AfterClass
	public static void nullObj() {
		System.out.println("In After class: First Name");
		user = null;
	}

	// FirstName Test cases
	@Test
	public void testFirstNameWithFirstLetterCapital_testAssertionHappy() {
		boolean result = user.firstName("Rachana");
		Assert.assertTrue(result);
	}

	@Test
	public void testFirstNameWithoutFirstLetterCapital_testAssertionHappy() {
		boolean result = user.firstName("rachana");
		Assert.assertFalse(result);
	}

	@Test
	public void testFirstNameWithoutFirstLetterCapital_testAssertionSad() {
		boolean result = user.firstName("rachana");
		Assert.assertTrue(result);
	}

	@Test
	public void testFirstNameWithFirstLetterCapital_testAssertionSad() {
		boolean result = user.firstName("Rachana");
		Assert.assertFalse(result);
	}

	// LastName Test cases
	@Test
	public void testLasttNameWithFirstLetterCapital_testAssertionHappy() {
		boolean result = user.lastName("Rachana");
		Assert.assertTrue(result);
	}

	@Test
	public void testLastNameWithoutFirstLetterCapital_testAssertionHappy() {
		boolean result = user.lastName("rachana");
		Assert.assertFalse(result);
	}

	@Test
	public void testLastNameWithoutFirstLetterCapital_testAssertionSad() {
		boolean result = user.lastName("rachana");
		Assert.assertTrue(result);
	}

	@Test
	public void testLastNameWithFirstLetterCapital_testAssertionSad() {
		boolean result = user.lastName("Rachana");
		Assert.assertFalse(result);
	}

	// Email Test cases
	@Test
	public void testEmailWithThreeMandatoryFeilds_testAssertionHappy() {
		boolean result = user.email("rachana@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void testEmailWithoutThreeMandatoryFeilds_testAssertionHappy() {
		boolean result = user.email("rachu@.com");
		Assert.assertFalse(result);
	}

	@Test
	public void testEmailWithoutThreeMandatoryFeilds_testAssertionSad() {
		boolean result = user.email("rachu28@gmail");
		Assert.assertTrue(result);
	}

	@Test
	public void testEmailWithThreeMandatoryFeilds_testAssertionSad() {
		boolean result = user.email("rachana@gmil.co");
		Assert.assertFalse(result);
	}

	// MobileNumber Test cases
	@Test
	public void testMobileNumberWithTwoMandatoryFeilds_testAssertionHappy() {
		boolean result = user.mobileNum("+91 8888999777");
		Assert.assertTrue(result);
	}

	@Test
	public void testMobileNumberWithoutTwoMandatoryFeilds_testAssertionHappy() {
		boolean result = user.mobileNum("9876543210");
		Assert.assertFalse(result);
	}

	@Test
	public void testMobileNumberWithoutTwoMandatoryFeilds_testAssertionSad() {
		boolean result = user.mobileNum("89543210");
		Assert.assertTrue(result);
	}

	@Test
	public void testMobileNumberWithTwoMandatoryFeilds_testAssertionSad() {
		boolean result = user.mobileNum("+91 8536382726");
		Assert.assertFalse(result);
	}

	// Password Test cases
	@Test
	public void testPasswordWithMinimumEightCharacters_testAssertionHappy() {
		boolean result = user.password1("Rachanar");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutMinimumEightCharacters_testAssertionHappy() {
		boolean result = user.password1("Rachana");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithoutMinimumEightCharacters_testAssertionSad() {
		boolean result = user.password1("8545654");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithMinimumEightCharacters_testAssertionSad() {
		boolean result = user.password1("87965646");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithAtleastOneUpperCase_testAssertionHappy() {
		boolean result = user.password2("Racsv");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutAtleastOneUpperCase_testAssertionHappy() {
		boolean result = user.password2("racana");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithoutAtleastOneUpperCase_testAssertionSad() {
		boolean result = user.password2("kmdklwkas");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithAtleastOneUpperCase_testAssertionSad() {
		boolean result = user.password2("skwndkxS");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithAtleastOneNumeric_testAssertionHappy() {
		boolean result = user.password3("Rach28");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutAtleastOneNumeric_testAssertionHappy() {
		boolean result = user.password3("rachrac");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithoutAtleastOneNumeric_testAssertionSad() {
		boolean result = user.password3("kmdklwkasK");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithAtleastOneNumeric_testAssertionSad() {
		boolean result = user.password3("9skwndkx");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithExactlyOneSpecialCharacter_testAssertionHappy() {
		boolean result = user.password4("Racghd@");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutExactlyOneSpecialCharacter_testAssertionHappy() {
		boolean result = user.password4("rachana");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithoutExactlyOneSpecialCharacter_testAssertionSad() {
		boolean result = user.password4("9kmdklwkasK");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithExactlyOneSpecialCharacter_testAssertionSad() {
		boolean result = user.password4("skwndkx$");
		Assert.assertFalse(result);
	}

}



