import java.util.Scanner;// Import Scanner class for user input
public class Season {// Define the class
    public static void main(String[] args) {// Main method 
        Scanner scanner = new Scanner(System.in);// Create Scanner object for input
        // Prompt user to enter a month number
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
   // Using switch-case to determine the season based on the month number
        switch (month) {
            case 3, 4: System.out.println("The Season is Spring (Boshonto)"); 
            break;
            case 5, 6: System.out.println("The Season is Summer (Grishmo)"); 
            break;
            case 7, 8: System.out.println("The Season is Monsoon (Borsha)"); 
            break;
            case 9, 10: System.out.println("The Season is Autumn (Shorot)"); 
            break;
            case 11, 12: System.out.println("The Season is Late Autumn (Hemonto)"); 
            break;
            case 1, 2: System.out.println("The Season is Winter (Sheet)"); 
            break;
            default: System.out.println("Invalid month number.");
        }
    }
}
