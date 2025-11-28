package com.example.demo;

// BankValidator.java
public class BankValidator {

    public static String validate(String bank, String branch, String account, String key, String order) {

        // BANK CODE: exactly 3 digits
        if (!bank.matches("\\d+"))
            return "Error: Invalid bank code (letters not allowed)";
        if (bank.length() != 3)
            return "Error: Wrong bank code length";

        // BRANCH CODE: exactly 4 digits
        if (!branch.matches("\\d+"))
            return "Error: Branch code must contain only numbers";
        if (branch.length() != 4)
            return "Error: Wrong branch code length";

        // ACCOUNT NUMBER: exactly 10 digits
        if (!account.matches("\\d+"))
            return "Error: Account contains invalid characters";
        if (account.length() < 10)
            return "Error: Account number too short";
        if (account.length() > 10)
            return "Error: Account number too long";

        // PERSONAL KEY: exactly 4 digits
        if (!key.matches("\\d+"))
            return "Error: Invalid personal key (letters not allowed)";
        if (key.length() != 4)
            return "Error: Wrong personal key length";

        // ORDER VALUE: only 1 or 2
        if (!order.matches("\\d+"))
            return "Error: Invalid order value (letters not allowed)";
        int orderValue = Integer.parseInt(order);
        if (orderValue != 1 && orderValue != 2)
            return "Error: Invalid operation order (allowed: 1 or 2)";

        return "Operation accepted ✓";
    }
}
