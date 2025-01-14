package org.example;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        try {
            System.out.println("First Name Validation:");
            System.out.println(userRegistration.validateFirstName("John")); // Should return true
            System.out.println(userRegistration.validateFirstName("jo"));   // Should throw exception
        } catch (UserRegistration.UserRegistrationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Last Name Validation:");
            System.out.println(userRegistration.validateLastName("Doe"));  // Should return true
            System.out.println(userRegistration.validateLastName("do"));   // Should throw exception
        } catch (UserRegistration.UserRegistrationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Email Validation:");
            System.out.println(userRegistration.validateEmail("abc.xyz@bl.co.in")); // Should return true
            System.out.println(userRegistration.validateEmail("abc@.com.my"));     // Should throw exception
        } catch (UserRegistration.UserRegistrationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Mobile Number Validation:");
            System.out.println(userRegistration.validateMobileNumber("91 9919819801")); // Should return true
            System.out.println(userRegistration.validateMobileNumber("919919819801"));  // Should throw exception
        } catch (UserRegistration.UserRegistrationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Password Validation:");
            System.out.println(userRegistration.validatePassword("Abc@1234")); // Should return true
            System.out.println(userRegistration.validatePassword("abc1234")); // Should throw exception
        } catch (UserRegistration.UserRegistrationException e) {
            System.out.println(e.getMessage());
        }

        List<String> emailSamples = List.of(
                // Valid Emails
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com",

                // Invalid Emails
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        );

        System.out.println("Email Samples Validation:");
        System.out.println(userRegistration.validateEmailSamples(emailSamples));
    }
}