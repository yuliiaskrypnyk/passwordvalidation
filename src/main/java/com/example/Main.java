package com.example;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) {
        String password = "hallo1234";

        if (containsDigits(password)) {
            System.out.println("Password contains digits");
        } else {
            System.out.println("Password does not contains digits");
        }

        if (containsUpperAndLowerCase(password)) {
            System.out.println("Password contains both uppercase and lowercase letters");
        } else {
            System.out.println("Password does not contain both uppercase and lowercase letters");
        }
    }

    public static boolean containsDigits(String password) {
        return password.matches(".*\\d.*");
    }

    public static boolean containsUpperAndLowerCase(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (int i = 0; i < password.length(); i++) {
            if (isUpperCase(password.charAt(i))) {
                hasUpperCase = true;
            }

            if (isLowerCase(password.charAt(i))) {
                hasLowerCase = true;
            }

            if (hasUpperCase && hasLowerCase) {
                return true;
            }
        }

        return false;
    }
}