package com.example;

public class Main {
    public static void main(String[] args) {
        String password = "hallo1234";
        containsDigits(password);
    }

    public static boolean containsDigits(String password) {
        return password.matches(".*\\d.*");
    }
}