package Rock_paper_scissors_game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"Rock", "Paper", "Scissors"};
        String computerMove;
        String playerMove;
        boolean playAgain = true;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        // Loop to allow the player to play multiple rounds
        while (playAgain) {
            // Generate computer's move
            int computerMoveIndex = random.nextInt(3);  // Random number between 0 and 2
            computerMove = rps[computerMoveIndex];

            // Prompt player to enter their move
            System.out.println("Enter your move (Rock, Paper, Scissors). To quit the game, type 'quit'.");
            playerMove = scanner.nextLine();

            // Check if the player wants to quit
            if (playerMove.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Validate player move
            if (!playerMove.equalsIgnoreCase("Rock") && 
                !playerMove.equalsIgnoreCase("Paper") && 
                !playerMove.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            System.out.println("Computer chose: " + computerMove);

            // Determine the winner
            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors") ||
                       playerMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock") ||
                       playerMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // Ask the user if they want to play again
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainInput = scanner.nextLine();
            if (!playAgainInput.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        scanner.close();
    }
}

