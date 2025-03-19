import java.util.Scanner; // Import Scanner class for user input

public class largestNumber { // Define the class
    public static void main(String[] args) { // Main method 
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Prompt user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt(); // Read the number of elements

        int[] arr = new int[n]; // Declare an array of size n

        // Prompt user to enter elements of the array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) { // Loop to take n inputs
            arr[i] = scanner.nextInt(); // Store user input in the array
        }

        int max = arr[0]; // Assume first element is the maximum
        for (int i = 1; i < n; i++) { // Loop through the array starting from the second element
            if (arr[i] > max) { // Compare each element with max
                max = arr[i]; // Update max if a larger value is found
            }
        }

        // Print the largest number in the array
        System.out.println("Largest number: " + max);
    }
}
