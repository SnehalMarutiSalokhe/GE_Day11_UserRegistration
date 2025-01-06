package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        public static void main(String[] args) {
            UserRegistration userRegistration = new UserRegistration();

            System.out.println("First Name Validation:");
            System.out.println(userRegistration.validateFirstName("John")); // Should return true
            System.out.println(userRegistration.validateFirstName("jo"));   // Should return false

            System.out.println("Last Name Validation:");
            System.out.println(userRegistration.validateLastName("Doe"));  // Should return true
            System.out.println(userRegistration.validateLastName("do"));   // Should return false

            System.out.println("Email Validation:");
            System.out.println(userRegistration.validateEmail("abc.xyz@bl.co.in")); // Should return true
            System.out.println(userRegistration.validateEmail("abc@.com.my"));     // Should return false

    }
}