public class SumCalculator {
	
	// Method to calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate the sum of three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to calculate the sum of four integers
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Method to calculate the sum of five integers
    public static int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
}

//main.java

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of digits (2-5)
        System.out.print("Enter the number of digits (2-5): ");
        int numDigits = scanner.nextInt();

        int result = 0;

        // Perform sum operation based on the number of digits using switch
        switch (numDigits) {
            case 2:
                result = performSumOperation(2);
                break;
            case 3:
                result = performSumOperation(3);
                break;
            case 4:
                result = performSumOperation(4);
                break;
            case 5:
                result = performSumOperation(5);
                break;
            default:
                System.out.println("Invalid number of digits. Please enter a number between 2 and 5.");
        }

        // Display the result
        System.out.println("Sum of given numbers: " + result);

        scanner.close();
    }

    // Method to calculate the sum of two integers
    private static int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate the sum of three integers
    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to calculate the sum of four integers
    private static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Method to calculate the sum of five integers
    private static int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    // Method to handle sum operation based on the number of digits
    private static int performSumOperation(int numDigits) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[numDigits];

        // Read numbers from the user
        for (int i = 0; i < numDigits; i++) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Call the appropriate sum method based on the number of digits
        switch (numDigits) {
            case 2:
                return sum(numbers[0], numbers[1]);
            case 3:
                return sum(numbers[0], numbers[1], numbers[2]);
            case 4:
                return sum(numbers[0], numbers[1], numbers[2], numbers[3]);
            case 5:
                return sum(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]);
            default:
                return 0; // This should not happen, as it's already validated in the main method.
        }
    }
}

//output
/* public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of digits (2-5)
        System.out.print("Enter the number of digits (2-5): ");
        int numDigits = scanner.nextInt();

        int result = 0;

        // Perform sum operation based on the number of digits using switch
        switch (numDigits) {
            case 2:
                result = performSumOperation(2);
                break;
            case 3:
                result = performSumOperation(3);
                break;
            case 4:
                result = performSumOperation(4);
                break;
            case 5:
                result = performSumOperation(5);
                break;
            default:
                System.out.println("Invalid number of digits. Please enter a number between 2 and 5.");
        }

        // Display the result
        System.out.println("Sum of given numbers: " + result);

        scanner.close();
    }

    // Method to calculate the sum of two integers
    private static int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate the sum of three integers
    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to calculate the sum of four integers
    private static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Method to calculate the sum of five integers
    private static int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    // Method to handle sum operation based on the number of digits
    private static int performSumOperation(int numDigits) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[numDigits];

        // Read numbers from the user
        for (int i = 0; i < numDigits; i++) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Call the appropriate sum method based on the number of digits
        switch (numDigits) {
            case 2:
                return sum(numbers[0], numbers[1]);
            case 3:
                return sum(numbers[0], numbers[1], numbers[2]);
            case 4:
                return sum(numbers[0], numbers[1], numbers[2], numbers[3]);
            case 5:
                return sum(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]);
            default:
                return 0; // This should not happen, as it's already validated in the main method.
        }
    }
}

//output

/*Enter the number of digits (2-5): 4
Enter digit 1: 4
Enter digit 2: 5
Enter digit 3: 5
Enter digit 4: 5
Sum of given numbers: 19 */ 