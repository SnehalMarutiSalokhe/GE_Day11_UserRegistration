import org.example.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    void testFirstNameValidation() {
        // Happy Test Case
        Assertions.assertTrue(userRegistration.validateFirstName("John"));
        // Sad Test Case
        Assertions.assertFalse(userRegistration.validateFirstName("jo"));
    }

    @Test
    void testLastNameValidation() {
        // Happy Test Case
        Assertions.assertTrue(userRegistration.validateLastName("Doe"));
        // Sad Test Case
        Assertions.assertFalse(userRegistration.validateLastName("do"));
    }

    @Test
    void testEmailValidation() {
        // Happy Test Case
        Assertions.assertTrue(userRegistration.validateEmail("abc.xyz@bl.co.in"));
        // Sad Test Case
        Assertions.assertFalse(userRegistration.validateEmail("abc@.com.my"));
    }

    @Test
    void testMobileNumberValidation() {
        // Happy Test Case
        Assertions.assertTrue(userRegistration.validateMobileNumber("91 9919819801"));
        // Sad Test Case
        Assertions.assertFalse(userRegistration.validateMobileNumber("919919819801"));
    }

    @Test
    void testPasswordValidation() {
        // Happy Test Case
        Assertions.assertTrue(userRegistration.validatePassword("Abc@1234"));
        // Sad Test Case
        Assertions.assertFalse(userRegistration.validatePassword("abc1234"));
    }
}