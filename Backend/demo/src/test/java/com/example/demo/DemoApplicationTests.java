package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

 /* ============================
       TC01 - All valid data
       ============================ */
    @Test
    void testTC01_AllValid() {
        String result = BankValidator.validate(
                "123", "1045", "1234567890", "1234", "1"
        );
        assertEquals("Operation accepted ✓", result);
    }

    /* ============================
       TC02 - Bank code has letters
       ============================ */
    @Test
    void testTC02_BankHasLetters() {
        String result = BankValidator.validate(
                "A12", "1045", "1234567890", "1234", "1"
        );
        assertEquals("Error: Invalid bank code (letters not allowed)", result);
    }

    /* ============================
       TC03 - Bank code too short
       ============================ */
    @Test
    void testTC03_BankTooShort() {
        String result = BankValidator.validate(
                "12", "1045", "1234567890", "1234", "1"
        );
        assertEquals("Error: Wrong bank code length", result);
    }

    /* ============================
       TC04 - Branch has letters
       ============================ */
    @Test
    void testTC04_BranchHasLetters() {
        String result = BankValidator.validate(
                "123", "10B3", "1234567890", "1234", "1"
        );
        assertEquals("Error: Branch code must contain only numbers", result);
    }

    /* ============================
       TC05 - Branch too long
       ============================ */
    @Test
    void testTC05_BranchTooLong() {
        String result = BankValidator.validate(
                "123", "10001", "1234567890", "1234", "1"
        );
        assertEquals("Error: Wrong branch code length", result);
    }

    /* ============================
       TC06 - Account too short
       ============================ */
    @Test
    void testTC06_AccountTooShort() {
        String result = BankValidator.validate(
                "123", "1045", "999", "1234", "1"
        );
        assertEquals("Error: Account number too short", result);
    }

    /* ============================
       TC07 - Account too long
       ============================ */
    @Test
    void testTC07_AccountTooLong() {
        String result = BankValidator.validate(
                "123", "1045", "123456789010", "1234", "1"
        );
        assertEquals("Error: Account number too long", result);
    }

    /* ============================
       TC08 - Account has letters
       ============================ */
    @Test
    void testTC08_AccountHasLetters() {
        String result = BankValidator.validate(
                "123", "1045", "12A45B78C9", "1234", "1"
        );
        assertEquals("Error: Account contains invalid characters", result);
    }

    /* ============================
       TC09 - Key has letters
       ============================ */
    @Test
    void testTC09_KeyHasLetters() {
        String result = BankValidator.validate(
                "123", "1045", "1234567890", "AB12", "1"
        );
        assertEquals("Error: Invalid personal key (letters not allowed)", result);
    }

    /* ============================
       TC10 - Key too long
       ============================ */
    @Test
    void testTC10_KeyTooLong() {
        String result = BankValidator.validate(
                "123", "1045", "1234567890", "12345", "1"
        );
        assertEquals("Error: Wrong personal key length", result);
    }

    /* ============================
       TC11 - Order value not allowed (3)
       ============================ */
    @Test
    void testTC11_OrderNotAllowed() {
        String result = BankValidator.validate(
                "123", "1045", "1234567890", "1234", "3"
        );
        assertEquals("Error: Invalid operation order (allowed: 1 or 2)", result);
    }

    /* ============================
       TC12 - Order has letters
       ============================ */
    @Test
    void testTC12_OrderHasLetters() {
        String result = BankValidator.validate(
                "123", "1045", "1234567890", "1234", "A"
        );
        assertEquals("Error: Invalid order value (letters not allowed)", result);
    }

}
