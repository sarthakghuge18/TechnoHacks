package quiz_game;

import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        // Question 1
        System.out.println("\n1. What is the capital of France?");
        System.out.println("a) Berlin");
        System.out.println("b) Madrid");
        System.out.println("c) Paris");
        System.out.println("d) Rome");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        
        if (answer1.equalsIgnoreCase("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is c) Paris.");
        }

        // Question 2
        System.out.println("\n2. Who wrote 'To Kill a Mockingbird'?");
        System.out.println("a) Harper Lee");
        System.out.println("b) J.K. Rowling");
        System.out.println("c) Ernest Hemingway");
        System.out.println("d) Mark Twain");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();

        if (answer2.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is a) Harper Lee.");
        }

        // Question 3
        System.out.println("\n3. What is the largest planet in our solar system?");
        System.out.println("a) Earth");
        System.out.println("b) Jupiter");
        System.out.println("c) Mars");
        System.out.println("d) Saturn");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();

        if (answer3.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) Jupiter.");
        }

        // Final score
        System.out.println("\nYour final score is: " + score + "/3");

        scanner.close();
    }
}

