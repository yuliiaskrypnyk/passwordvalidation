package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void containsDigits() {
        assertTrue(Main.containsDigits("hallo1234"));
        assertFalse(Main.containsDigits("hallo"));
    }

    @Test
    void containsUpperAndLowerCase() {
        assertTrue(Main.containsUpperAndLowerCase("Hallo1234"));
        assertFalse(Main.containsUpperAndLowerCase("hallo1234"));
        assertFalse(Main.containsUpperAndLowerCase("HALLO1234"));
    }
}