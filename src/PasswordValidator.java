import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password to test:");
        String password = scanner.nextLine();

        System.out.println("Password: " + password + " is " + (isValidPassword(password) ? "valid" : "invalid"));
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }

        int countValidCategories = 0;

        // Check for lowercase letters
        if (password.matches(".*[a-z].*")) {
            countValidCategories++;
        }

        // Check for uppercase letters
        if (password.matches(".*[A-Z].*")) {
            countValidCategories++;
        }

        // Check for numbers
        if (password.matches(".*[0-9].*")) {
            countValidCategories++;
        }

        // Check for special symbols
        if (password.matches(".*[~!@#$%^&*()\\-=_+].*")) {
            countValidCategories++;
        }

        return countValidCategories >= 3;
    }
}
