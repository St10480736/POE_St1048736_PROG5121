/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_st1048736_prog5121;

/**
 *
 * @author Kganya
 */
public class Login {

    // Fields to remember the registered user's details
    private String storedUsername;
    private String storedPassword;
    private String storedCellNumber;

    public boolean checkUserName(String username) {
        boolean hasUnderscore = username.contains("_");
        boolean isCorrectLength = username.length() <= 5;

        return hasUnderscore && isCorrectLength;
    }

    public boolean checkPasswordComplexity(String password) {
        boolean isLongEnough = password.length() >= 8;
        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasCapitalLetter = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        return isLongEnough && hasCapitalLetter && hasNumber && hasSpecialChar;
    }

    public boolean checkCellPhoneNumber(String cellNumber) {
        // Regex checks for South African international format:
        // starts with +27, followed by 1-9 digits
        // Reference: Oracle Java Regex Tutorial - https://docs.oracle.com/javase/tutorial/essential/regex/
        String pattern = "^\\+27\\d{1,9}$";
        return cellNumber.matches(pattern);
    }

    public String registerUser(String username, String password, String cellNumber) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber(cellNumber)) {
            return "Cell phone number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
        }

        // All checks passed - save the details so loginUser() can check against them later
        storedUsername = username;
        storedPassword = password;
        storedCellNumber = cellNumber;

        return "User successfully registered.";
    }

    public boolean loginUser(String username, String password) {
        return false;
    }

    public String returnLoginStatus(boolean loginSuccess, String firstName, String lastName) {
        return "";
    }

}