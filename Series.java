import java.util.Scanner;// Import Scanner class for user input

public class Series {// Define the class
    public static void main(String[] args) {// Main method
        Scanner scanner = new Scanner(System.in);// Create Scanner object for input
        // Prompt user to enter the number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();  // Read user input for n
        int sum = 0;  // Initialize sum to store the result

        for (int i = 1, count = 0; count < n; i += 2, count++) {
            sum += (i * i);  // Square the odd number and add to sum
        }

        System.out.println("Sum of series: " + sum);  // Print final result
    }
}
