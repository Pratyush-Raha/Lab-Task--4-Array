import java.util.Scanner;  // Import Scanner class to take user input

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object
        System.out.print("Input a degree in Fahrenheit: ");  
        double fahrenheit = scanner.nextDouble();  // Read user input
        
        // Convert Fahrenheit to Celsius using formula: C = (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;  
        
        // Print the result
        System.out.println("The Celsius value is: " +celsius);
        
    }
}

