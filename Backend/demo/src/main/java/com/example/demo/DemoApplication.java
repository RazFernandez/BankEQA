package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("=== Banking App Simulation ===\n");

		// Run 3 representative test cases
		runTestCase("TC01", "123", "1045", "1234567890", "1234", "1"); // Valid
		runTestCase("TC03", "12", "1045", "1234567890", "1234", "1"); // Boundary/Invalid length
		runTestCase("TC09", "123", "1045", "1234567890", "AB12", "1"); // Invalid
	}

	// Runs a test case and prints result
	public static void runTestCase(String id, String bank, String branch, String account, String key, String order) {
		System.out.println("Running " + id + "...");

		String result = validateInputs(bank, branch, account, key, order);
		System.out.println("Result: " + result + "\n");
	}

	// Validation logic based on your equivalence classes
	public static String validateInputs(String bank, String branch, String account, String key, String order) {

		// BANK CODE: must be exactly 3 digits
		if (!bank.matches("\\d+"))
			return "Error: Invalid bank code (letters not allowed)";
		if (bank.length() != 3)
			return "Error: Wrong bank code length";

		// BRANCH CODE: must be exactly 4 digits
		if (!branch.matches("\\d+"))
			return "Error: Branch code must contain only numbers";
		if (branch.length() != 4)
			return "Error: Wrong branch code length";

		// ACCOUNT NUMBER: must be exactly 10 digits
		if (!account.matches("\\d+"))
			return "Error: Account contains invalid characters";
		if (account.length() < 10)
			return "Error: Account number too short";
		if (account.length() > 10)
			return "Error: Account number too long";

		// PERSONAL KEY: must be exactly 4 digits
		if (!key.matches("\\d+"))
			return "Error: Invalid personal key (letters not allowed)";
		if (key.length() != 4)
			return "Error: Wrong personal key length";

		// ORDER VALUE: must be 1 or 2 only
		if (!order.matches("\\d+"))
			return "Error: Invalid order value (letters not allowed)";
		int orderValue = Integer.parseInt(order);
		if (orderValue != 1 && orderValue != 2)
			return "Error: Invalid operation order (allowed: 1 or 2)";

		// If all validations pass:
		return "Operation accepted ✓";
	}

}
