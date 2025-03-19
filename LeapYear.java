import java.util.Scanner;  // Import Scanner class for user input

public class LeapYear {  // Define the class
    public static void main(String[] args) {  // Main method 
        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter a year: ");  // Prompt user for input
        int year = scanner.nextInt();  // Read input as an integer
        
        // Check leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");  
        } else {
            System.out.println(year + " is not a Leap Year.");  
        }
        
        scanner.close();  // Close the scanner object
    }
}
