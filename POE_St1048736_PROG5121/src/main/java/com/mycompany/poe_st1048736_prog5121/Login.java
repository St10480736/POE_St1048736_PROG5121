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
        return false;
    }

    public String registerUser(String username, String password, String cellNumber) {
        return "";
    }

    public boolean loginUser(String username, String password) {
        return false;
    }

    public String returnLoginStatus(boolean loginSuccess, String firstName, String lastName) {
        return "";
    }

}