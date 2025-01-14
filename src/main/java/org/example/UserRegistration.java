package org.example;

import java.util.*;

public class UserRegistration {

    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";// Starts with uppercase and at least 3 characters
        return firstName.matches(regex);
    }

    public boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";// Starts with uppercase and at least 3 characters
        return lastName.matches(regex);
    }

    public boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._%+-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return email.matches(regex) && !email.contains("+");
    }

    public boolean validateMobileNumber(String mobileNumber) {
        String regex = "^[0-9]{1,3} [0-9]{10}$";
        return mobileNumber.matches(regex);
    }

    public boolean validatePassword(String password) {
        String rule1 = ".{8,}";
        String rule2 = "(?=.*[A-Z]).*";
        String rule3 = "(?=.*[0-9]).*";
        String rule4 = "(?=.*[@#$%^&+=!]).*";

        return password.matches(rule1) &&
                password.matches(rule2) &&
                password.matches(rule3) &&
                password.matches(rule4);
    }

    public List<Boolean> validateEmailSamples(List<String> emails) {
        List<Boolean> results = new ArrayList<>();
        for (String email : emails) {
            results.add(validateEmail(email));
        }
        return results;
    }
}
