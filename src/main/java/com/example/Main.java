package com.example;

import java.util.Arrays;
//import java.util.List;

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

        if (isCommonPassword(password)) {
            System.out.println("Password is a common password.");
        } else {
            System.out.println("Password is not a common password.");
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

    public static boolean isCommonPassword(String password) {
        String[] commonPasswords = {"hallo1234", "qwerty", "0000"};
        return Arrays.asList(commonPasswords).contains(password);

/*        List<String> commonPasswords = Arrays.asList("Hallo1234", "qwerty", "0000");
        return commonPasswords.contains(password);*/

/*        boolean isCommon = false;
        for (String s : commonPasswords) {
            if (s.equals(password)) {
                isCommon = true;
                break;
            }
        }
        return isCommon;*/
    }
}