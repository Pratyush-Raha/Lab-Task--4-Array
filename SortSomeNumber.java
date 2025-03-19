import java.util.Arrays; // Import Arrays class for sorting
import java.util.Scanner; // Import Scanner class for user input

public class SortSomeNumber { // Define the class
    public static void main(String[] args) { // Main method 
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Prompt user to enter the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();  // Read input as an integer

        int[] arr = new int[n]; // Declare an array of size n

        // Prompt user to enter elements of the array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) { // Loop to take n inputs
            arr[i] = scanner.nextInt(); // Store user input in the array
        }

        Arrays.sort(arr); // Sort the array in ascending order using Arrays.sort()

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr)); 
    }
}
