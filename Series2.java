import java.util.Scanner; // Import Scanner class for user input

public class Series2 { // Define the class
    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input
        
        // Prompt user to enter the number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt(); // Read input as an integer

        
        int sum = 0; // Initialize sum to store the result

        // Loop to calculate the sum of the series
        for (int i = 1; i <= n; i++) { // Iterate from 1 to n
            if (i % 2 == 0) { // Check if the number is even
                sum -= i;  // Subtract even numbers
            } else { // If the number is odd
                sum += i;  // Add odd numbers
            }
        }

        // Print the final sum of the series
        System.out.println("Sum of series: " + sum);
    }
}
