/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_st1048736_prog5121;

/**
 *
 * @author Kganya
 */
public class POE_St1048736_PROG5121 {

    public static void main(String[] args) {
        Login login = new Login();

        boolean result = login.checkUserName("kyl_1");
        System.out.println(result);

        boolean result2 = login.checkCellPhoneNumber("+27838968976");
        System.out.println(result2);

        String result3 = login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Test");
        System.out.println(result3);

        boolean loginResult = login.loginUser("kyl_1", "Ch&&sec@ke99!");
        System.out.println(loginResult);

        String statusMessage = login.returnLoginStatus(loginResult, "Kyle", "Test");
        System.out.println(statusMessage);
    }
}