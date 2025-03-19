import java.util.Scanner;  // Import Scanner class for user input
public class BaseExponent { // Define the class
    public static void main(String[] args) { // Main method 
        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input
        
        // Prompt user to enter the base number
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();  // Read base value
        
        // Prompt user to enter the exponent value
        System.out.print("Enter the exponent number: ");
        int exponent = scanner.nextInt();  // Read exponent value
        
        long result = 1;  // Initialize result variable to store the power calculation
        
        // Loop to multiply base 'exponent' times
        for (int i = 0; i < exponent; i++) {
            result *= base;  // Multiply result by base in each iteration
        }
        // Display the base and ecponent number
        System.out.println("The Base Number:"+ base);
         System.out.println("The Exponent Number:"+ exponent);
        // Display the calculated power
        System.out.println("Answer is:"+ base + "^" + exponent + " = " + result); 
    }
}

