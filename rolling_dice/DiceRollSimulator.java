package rolling_dice;

import java.util.Random;

public class DiceRollSimulator {

    public static void main(String[] args) {
        Random random = new Random();

        // Roll two dice
        int die1 = random.nextInt(6) + 1;  // Generates a random number between 1 and 6 for die 1
        int die2 = random.nextInt(6) + 1;  // Generates a random number between 1 and 6 for die 2

        // Display the results
        System.out.println("You rolled a " + die1 + " and a " + die2 + ".");
        int sum = die1 + die2;
        System.out.println("Total: " + sum);
    }
}

