package org.example;
import java.util.Scanner;

public class App {
//    public String getGreeting() {
//        return "Hello World!";
//    }

    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());

        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the first number: ");
        double num1 = 0;
        double num2 = 0;

        // Ask the user for the second number
        System.out.print("Enter the first number: ");

        if (scanner.hasNextDouble()) {

            num1 = scanner.nextDouble();

        } else {

            System.out.println("Invalid input for first number.");

            return;  // Exit the program if input is invalid

        }

         System.out.print("Enter second number: ");

        if (scanner.hasNextDouble()) {

            num2 = scanner.nextDouble();

        } else {

            System.out.println("Invalid input for second number.");

            return;  // Exit the program if input is invalid

        }
        // Ask the user for the operation they want to perform
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter the operation (1/2/3/4): ");
        int choice;
        if (scanner.hasNextInt()) {

            choice = scanner.nextInt();

        } else {

            System.out.println("Invalid operation choice.");

            return;  // Exit the program if input is invalid

        }

        double result;

        // Perform the operation based on user input
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4:
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation! Please choose 1, 2, 3, or 4.");
        }

        // Close the scanner
        scanner.close();
    }
}

