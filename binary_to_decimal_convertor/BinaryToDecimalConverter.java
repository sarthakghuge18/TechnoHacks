package binary_to_decimal_convertor;

import java.util.Scanner;

public class BinaryToDecimalConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            // Convert binary to decimal
            int decimal = Integer.parseInt(binaryString, 2);
            System.out.println("The decimal equivalent is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number. Please enter a valid binary number.");
        }

        scanner.close();
    }
}
