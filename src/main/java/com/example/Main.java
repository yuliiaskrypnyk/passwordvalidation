package com.example;

import java.security.SecureRandom;
//import java.util.Arrays;
//import java.util.List;

public class Main {
    public static void main(String[] args) {
        int passwordLength = 12;
        String password = generateRandomPassword(passwordLength);
        System.out.println("Generated Random Password: " + generateRandomPassword(passwordLength));

        if (isValidLength(password)) {
            System.out.println("Password has valid length");
        } else {
            System.out.println("Password is too short");
        }

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
            System.out.println("Password is a common password");
        } else {
            System.out.println("Password is not a common password");
        }

        if (containsSpecialCharacters(password)) {
            System.out.println("Password contains special characters");
        } else {
            System.out.println("Password does not contain any special characters");
        }
    }

    public static boolean isValidLength(String password) {
        return password.length() >= 8;
    }

    public static boolean containsDigits(String password) {
        return password.matches(".*\\d.*");
    }

    public static boolean containsUpperAndLowerCase(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpperCase = true;
            }

            if (Character.isLowerCase(password.charAt(i))) {
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
//        return Arrays.asList(commonPasswords).contains(password);

/*        List<String> commonPasswords = Arrays.asList("Hallo1234", "qwerty", "0000");
        return commonPasswords.contains(password);*/

        boolean isCommon = false;
        for (String s : commonPasswords) {
            if (s.equals(password)) {
                isCommon = true;
                break;
            }
        }

        return isCommon;
    }

    public static boolean containsSpecialCharacters(String password) {
        return password.matches(".*[!@#$%^&*()\\-_=+<>?].*");
    }

    public static String generateRandomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=<>?";
        SecureRandom random = new SecureRandom();
        String password = "";
        //StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password += characters.charAt(index);
            //password.append(characters.charAt(index));
        }

        return password;
        //return password.toString();
    }
}