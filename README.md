# Credit Card Validator

This Java program provides credit card validation functionality, allowing you to determine the type of a credit card and check if a provided credit card number is valid.

## Features

- **`checkCardType(String str)`**: This method determines the type of a credit card (Visa, UnionPay, American Express, or MasterCard) based on the provided credit card number string. It utilizes regular expressions to match different card patterns and returns the corresponding card type as a string.

- **`checkCardNumber(String str)`**: This method validates a credit card number string using a comprehensive regular expression pattern that covers Visa, UnionPay, American Express, and MasterCard formats. It returns a boolean indicating whether the provided credit card number is valid according to the defined patterns.

- **`main(String[] args)`**: The main function of the program takes user input for a credit card number, validates it using the `checkCardNumber` method, and identifies the card type using the `checkCardType` method. It displays whether the card number is valid and, if so, the corresponding card type.

## Usage

1. Compile and run the program using a Java compiler or integrated development environment (IDE).
2. Follow the on-screen instructions to enter a credit card number for validation.
3. The program will output whether the entered credit card number is valid and, if valid, the corresponding card type.

### Note

- The provided regular expressions cover a simplified set of card number formats and may not encompass all possible variations.
- It's crucial to consult the latest credit card industry standards and regulations before deploying any credit card validation system in a production environment.

Feel free to modify the program to suit your specific needs and to enhance its capabilities.

