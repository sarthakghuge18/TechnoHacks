package random_password_generator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    // Define possible characters for the password
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the desired password length
        System.out.print("Enter the length of the password: ");
        int passwordLength = scanner.nextInt();

        // Generate and display the password
        String password = generatePassword(passwordLength);
        System.out.println("Generated password: " + password);

        scanner.close();
    }

    // Method to generate a random password
    private static String generatePassword(int length) {
        String characterSet = UPPERCASE + LOWERCASE + DIGITS + SPECIAL_CHARACTERS;
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        // Generate random characters from the characterSet for the password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }

        return password.toString();
    }
}
