/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe_st1048736_prog5121;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kganya
 */
public class LoginTest {

    public LoginTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        Login instance = new Login();

        // Correctly formatted username
        assertTrue(instance.checkUserName("kyl_1"));

        // Incorrectly formatted username (no underscore)
        assertFalse(instance.checkUserName("kyle!!!!!!"));
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        Login instance = new Login();

        // Meets complexity requirements
        assertTrue(instance.checkPasswordComplexity("Ch&&sec@ke99!"));

        // Does not meet complexity requirements
        assertFalse(instance.checkPasswordComplexity("password"));
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        Login instance = new Login();

        // Correctly formatted cell number
        assertTrue(instance.checkCellPhoneNumber("+27838968976"));

        // Incorrectly formatted cell number
        assertFalse(instance.checkCellPhoneNumber("08966553"));
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Login instance = new Login();

        String result = instance.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Test");
        assertEquals("User successfully registered.", result);
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        Login instance = new Login();

        // Register first, so there's something to log in against
        instance.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Test");

        // Login successful
        assertTrue(instance.loginUser("kyl_1", "Ch&&sec@ke99!"));

        // Login failed (wrong password)
        assertFalse(instance.loginUser("kyl_1", "wrongpassword"));
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        Login instance = new Login();

        String successMessage = instance.returnLoginStatus(true, "Kyle", "Test");
        assertEquals("Welcome Kyle, Test it is great to see you again.", successMessage);

        String failMessage = instance.returnLoginStatus(false, "Kyle", "Test");
        assertEquals("Username or password incorrect, please try again.", failMessage);
    }

}