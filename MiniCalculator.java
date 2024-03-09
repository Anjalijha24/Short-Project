import java.util.Scanner;
public class MiniCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        // Use a do-while loop to repeatedly perform operations until the user decides to stop
	        do {
	            System.out.println("Mini Calculator");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.print("Enter your choice (1-4): ");

	            // Read user's choice for the operation
	            int choice = scanner.nextInt();

	            // Read two numbers from the user
	            System.out.print("Enter the first number: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Enter the second number: ");
	            double num2 = scanner.nextDouble();

	            // Perform the selected operation using a switch statement
	            switch (choice) {
	                case 1:
	                    System.out.println("Result: " + (num1 + num2));
	                    break;
	                case 2:
	                    System.out.println("Result: " + (num1 - num2));
	                    break;
	                case 3:
	                    System.out.println("Result: " + (num1 * num2));
	                    break;
	                case 4:
	                    // Check for division by zero
	                    if (num2 != 0) {
	                        System.out.println("Result: " + (num1 / num2));
	                    } else {
	                        System.out.println("Cannot divide by zero!");
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	            }

	            // Ask the user if they want to continue
	            System.out.print("Do you want to continue? (yes/no): ");
	            String continueChoice = scanner.next();

	            // Continue the loop if the user enters "yes"
	        } while ("yes".equalsIgnoreCase(scanner.next()));

	        // Display a closing message when the calculator is closed
	        System.out.println("Calculator closed. Thank you!");

	        // Close the Scanner to prevent resource leaks
	        scanner.close();
	    }
	

	}


