package todo_list;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        boolean running = true;

        System.out.println("Welcome to your To-Do List!");

        while (running) {
            // Display the menu options
            System.out.println("\nMenu:");
            System.out.println("1. View To-Do List");
            System.out.println("2. Add an item");
            System.out.println("3. Remove an item");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // View the to-do list
                    viewToDoList(toDoList);
                    break;
                case 2:
                    // Add an item
                    addItem(toDoList, scanner);
                    break;
                case 3:
                    // Remove an item
                    removeItem(toDoList, scanner);
                    break;
                case 4:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting the To-Do List program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }

        scanner.close();
    }

    // Method to view the to-do list
    private static void viewToDoList(ArrayList<String> toDoList) {
        if (toDoList.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("\nYour To-Do List:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }

    // Method to add an item to the to-do list
    private static void addItem(ArrayList<String> toDoList, Scanner scanner) {
        System.out.print("Enter the task to add: ");
        String task = scanner.nextLine();
        toDoList.add(task);
        System.out.println("Task added: " + task);
    }

    // Method to remove an item from the to-do list
    private static void removeItem(ArrayList<String> toDoList, Scanner scanner) {
        if (toDoList.isEmpty()) {
            System.out.println("Your to-do list is empty. Nothing to remove.");
        } else {
            viewToDoList(toDoList);
            System.out.print("Enter the number of the task to remove: ");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                String removedTask = toDoList.remove(taskNumber - 1);
                System.out.println("Task removed: " + removedTask);
            } else {
                System.out.println("Invalid task number. Please try again.");
            }
        }
    }
}
