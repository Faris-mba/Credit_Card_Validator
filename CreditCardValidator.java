import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardValidator {

    public static String checkCardType(String str) {
        if (str.matches("^4[0-9]{12}(?:[0-9]{3})?$")) {
            return "Visa";
        } else if (str.matches("^62[0-9]{14,17}$")) {
            return "UnionPay";
        } else if (str.matches("^3[47][0-9]{13}$")) {
            return "American Express";
        } else if (str.matches("^(5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$")) {
            return "MasterCard";
        } else {
            return "Unknown";
        }
    }
    
    public static boolean checkCardNumber(String str) {
        // Your regular expression and validation logic here

        // Regex to check valid
        // Visa, American Express, MasterCard, UnionPay
        String regex = "^(4[0-9]{12}(?:[0-9]{3})?|62[0-9]{14,17}|3[47][0-9]{13}|(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12})$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty, return false
        if (str == null) {
            return false;
        }

        // Find match between given string and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(str);

        // Return true if the string matched the ReGex, otherwise false
        return m.matches();
    }

          public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the credit card number:");
        String cardNumber = scanner.nextLine();

        boolean isValid = checkCardNumber(cardNumber);
        String cardType = checkCardType(cardNumber);

        if (isValid) {
            System.out.println("The card number is valid.");
            System.out.println("Card type: " + cardType);
        } else {
            System.out.println("The card number is not valid.");
        }

        scanner.close();
    }
}